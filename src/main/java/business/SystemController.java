package business;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import dataaccess.Auth;
import dataaccess.DataAccess;
import dataaccess.DataAccessFacade;
import dataaccess.User;

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
    
    public void handleNewMemberCreation(String aFirstName, String aLastName, String aPhone, String aStreet, String aCity, String aZip, String aState) {
        String memberId = "1005";
        Address address = new Address(aStreet,aCity,aState,aZip);
        LibraryMember member = new LibraryMember(memberId, aFirstName, aLastName,aPhone, address);
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
