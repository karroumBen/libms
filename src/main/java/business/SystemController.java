package business;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import dataaccess.Auth;
import dataaccess.DataAccess;
import dataaccess.DataAccessFacade;
import dataaccess.User;
import java.time.LocalDate;
import java.util.Map;

public class SystemController implements ControllerInterface {
	public static Auth currentAuth = null;
	public void login(String id, String password) throws LoginException {
		DataAccess da = new DataAccessFacade();
		HashMap<String, User> map = da.readUserMap();
		if(!map.containsKey(id)) {
			throw new LoginException("ID " + id + " not found");
		}
		String passwordFound = map.get(id).getPassword();
		if(!passwordFound.equals(password)) {
			throw new LoginException("Password incorrect");
		}
		currentAuth = map.get(id).getAuthorization();
		
	}
	@Override
	public List<String> allMemberIds() {
		DataAccess da = new DataAccessFacade();
		List<String> retval = new ArrayList<>();
		retval.addAll(da.readMemberMap().keySet());
		return retval;
	}
	
	@Override
	public List<String> allBookIds() {
		DataAccess da = new DataAccessFacade();
		List<String> retval = new ArrayList<>();
		retval.addAll(da.readBooksMap().keySet());
		return retval;
	}

    @Override
    public void addNewBook(Book book) {
        DataAccess da = new DataAccessFacade();
        da.saveNewBook(book);
        System.out.println(da.readBooksMap().toString());
    }

    @Override
    public void addBookCopy(Book book) {
        book.addCopy();
        addNewBook(book);
    }
    public boolean handleBookCopy(String isbn) {
       boolean isSuccessful = true;
       Book searchedBook = getBookByIsbn(isbn);
       if(searchedBook == null) {
          isSuccessful = false; 
       } else {
           addBookCopy(searchedBook);
       }
       
       return isSuccessful;
    }
    public static List<?> getAllBooks() {
        DataAccess da = new DataAccessFacade();
       var bookMap = da.readBooksMap();
       
       System.out.println(bookMap.toString());
       return (new ArrayList(bookMap.values()));
    }

    public HashMap<String, String> handleLogin(String usernameValue, String passwordValue) {
        HashMap<String, String> result = new HashMap<>();
        User member = checkMember(usernameValue);
        if(member == null) {
            result.put("type", "Error");
            result.put("message", "Invalid username");
            
            return result;
        }

        if(!member.getPassword().equals(passwordValue)) {
            result.put("type", "Error");
            result.put("message", "Invalid password");
            return result;
        }

        System.out.println("The role of the user is: " + member.getAuthorization());
        DataAccessFacade.setCurrentUser(member);
        result.put("type", "Success");
        result.put("message", "Logged in successfully");

        return result;
    }
    public User checkMember(String usernameValue) {
        DataAccessFacade dataAccessFacade = new DataAccessFacade();
        HashMap<String, User> members = dataAccessFacade.readUserMap();
        User member = members.get(usernameValue);
        
        return member;
    }

    public void handleBookCreation(String isbn, String title, int maxCheckout, List<Map<String, String>> rawAuthors) {
        List<Author> authors = new ArrayList<>();
        for(Map<String, String> map: rawAuthors) {
           Address address = new Address(map.get("aStreet"), map.get("aCity"), map.get("aState"), map.get("aZipCode"));
           Author author = new Author(map.get("aFirst"), map.get("aLast"), map.get("aPhone"), address, map.get("aBio"));
           
           authors.add(author);
        }
        
        Book book = new Book(isbn, title, maxCheckout, authors);
        addNewBook(book);
    }

    public int getAuthorization() {
        User currentUser = DataAccessFacade.getCurrentUser();
        return currentUser.getAuthorization().ordinal();
    }

    public void logout() {
        DataAccessFacade.setCurrentUser(null);
    }

    public Object[][] getMemberList() {
        DataAccess da = new DataAccessFacade();
        var members = new ArrayList<>(da.readMemberMap().values());
        Object[][] rawData = new Object[members.size()][6];
        for (int i = 0; i < members.size(); i++) {
            LibraryMember member = members.get(i);
            rawData[i][0] = member.getMemberId();
            rawData[i][1] = member.getFirstName();
            rawData[i][2] = member.getLastName();
            rawData[i][3] = member.getTelephone();
            rawData[i][4] = member.getAddress().getStreet();
            rawData[i][5] = member.getAddress().getCity();
        }
        
        return rawData;
    }

    public Object[][] getBookList() {
        DataAccess da = new DataAccessFacade();
        var books = new ArrayList<>(da.readBooksMap().values());
        Object[][] rawData = new Object[books.size()][3];
        for (int i = 0; i < books.size(); i++) {
            Book book = books.get(i);
            rawData[i][0] = book.getIsbn();
            rawData[i][1] = book.getTitle();
            rawData[i][2] = book.getMaxCheckoutLength();
        }
        
        return rawData;
    }

    public HashMap<String, String> performCheckout(String memberID, String isbn) {
        HashMap<String, String> result = new HashMap<>();
        Book book = getBookByIsbn(isbn);
        LibraryMember member = getMemberById(memberID);
        
        if(book == null) {
            result.put("type", "Error");
            result.put("message", "Book not found");
            return result;
        }
        
        if(!book.isAvailable()) {
            result.put("type", "Error");
            result.put("message", "Book not available");
            return result;
        }
        
        if(member == null) {
            result.put("type", "Error");
            result.put("message", "Member not found");
            return result;
        }
        
        BookCopy[] copy = book.getCopies();
        

        CheckoutRecord record = new CheckoutRecord(LocalDate.now().toString());
        LocalDate futureDate = LocalDate.now().plusDays(21);
        
        CheckoutRecordEntry entry = new CheckoutRecordEntry(LocalDate.now(), futureDate, copy[copy.length - 1]);
        record.setRecordEntry(entry);
        
        copy[copy.length - 1].changeAvailability();
        book.updateCopies(copy[copy.length - 1]);
        
        member.addRecord(record);
        DataAccess da = new DataAccessFacade();
        da.saveNewMember(member);
        System.out.println("Member " + member);
        result.put("type", "Success");
        result.put("message", "Checkout succssfully done");
        return result;
        
    }
    public Book getBookByIsbn(String isbn) {
        DataAccess da = new DataAccessFacade();
        var books = da.readBooksMap();
        var searchedBook = books.get(isbn);
        
        return searchedBook;
    }

    private LibraryMember getMemberById(String memberID) {
         DataAccess da = new DataAccessFacade();
         var members = da.readMemberMap();
         LibraryMember member = members.get(memberID);
         System.out.println("Member "+ member);
         
         return member;
    }

    public Object[][] getCheckoutRecords() {
        DataAccess da = new DataAccessFacade();
        var members = new ArrayList<>(da.readMemberMap().values());
        var checkoutLength = 0; 
        for(LibraryMember member: members) {
            if(member.getRecord() != null) {
                checkoutLength += member.getRecord().size();
            }
        }
        Object[][] rawData = new Object[checkoutLength][4];
        for (int i = 0; i < checkoutLength; i++) {
            LibraryMember member = members.get(i);
            System.out.println("member"+member);
            if(member.getRecord() != null) {
                int len = member.getRecord().size();
                System.out.println("len "+len);
                for (int j = 0; j < len; j++) {
                    rawData[i][0] = member.getMemberId();
                    rawData[i][1] = member.getRecord().get(i).getRecordEntry().getBookCopy().getBook().getIsbn();
                    rawData[i][2] = member.getRecord().get(i).getRecordEntry().getCheckoutDate();
                    rawData[i][3] = member.getRecord().get(i).getRecordEntry().getDueDate();
                }   
            }    
        }
        
        return rawData;
    }
    
	
    
    public void handleNewMemberCreation(String aFirstName, String aLastName, String aPhone, String aStreet, String aCity, String aZip, String aState) {
        DataAccess da = new DataAccessFacade();
        LibraryMember member;
        String memId = null;
        for(LibraryMember libMem:da.readMemberMap().values()){
            memId = libMem.getMemberId();
        }
        String memberIdString = memId;
        int memberIdInt = Integer.parseInt(memberIdString) + 1;
        String memberId = Integer.toString(memberIdInt);        
        Address address = new Address(aStreet,aCity,aState,aZip);
        member = new LibraryMember(memberId, aFirstName, aLastName,aPhone, address);
        addNewMember(member);
    }
    
    @Override
    public void  addNewMember(LibraryMember member){
        DataAccess da = new DataAccessFacade();
        da.saveNewMember(member);
    }
    
    public void handleUpdateMember(String memberId, String aFirstName, String aLastName, String aPhone, String aStreet, String aCity, String aZip, String aState){
        DataAccess da = new DataAccessFacade();
        Address address = new Address(aStreet,aCity,aState,aZip);
        LibraryMember member = null;
        for(LibraryMember libMem:da.readMemberMap().values()){
            String memId = libMem.getMemberId();
            if(memId.equals(memberId)){
                libMem.setFirstName(aFirstName);
                libMem.setLastName(aLastName);
                libMem.setAddress(address);
                libMem.setTelephone(aPhone);
                member = libMem;
                break;
            }
        }
        updateNewMember(member);
    }
    
    @Override
    public void updateNewMember(LibraryMember member){
        DataAccess da = new DataAccessFacade();
        da.saveNewMember(member);
    }
    
    public LibraryMember searchLibraryMember(String memberId){
        DataAccess da = new DataAccessFacade();
        //Address address = null; //new Address(aStreet,aCity,aState,aZip);
        LibraryMember member = null;
        for(LibraryMember libMem:da.readMemberMap().values()){
            String memId = libMem.getMemberId();
            if(memId.equals(memberId)){
                member = libMem;
                break;
            }
        }
        return member;
    }
}
