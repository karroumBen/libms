package business;

import java.util.List;

import business.Book;
import dataaccess.DataAccess;
import dataaccess.DataAccessFacade;

public interface ControllerInterface {
	public void login(String id, String password) throws LoginException;
	public List<String> allMemberIds();
	public List<String> allBookIds();
        public void addNewBook(Book book);
        public void addBookCopy(Book book);
        public void addNewMember(LibraryMember member);
        public void updateNewMember(LibraryMember member);
}
