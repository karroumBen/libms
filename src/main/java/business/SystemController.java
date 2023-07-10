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
    public void  addNewMember(LibraryMember member){
        DataAccess da = new DataAccessFacade();
        da.saveNewMember(member);
    }
}
