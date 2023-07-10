package business;

import java.io.Serializable;
import java.time.LocalDate;


import dataaccess.DataAccess;
import dataaccess.DataAccessFacade;
import java.util.ArrayList;
import java.util.List;

final public class LibraryMember extends Person implements Serializable {
	private String memberId;
        private List<CheckoutRecord> records = new ArrayList<>();
	
	public LibraryMember(String memberId, String fname, String lname, String tel,Address add) {
		super(fname,lname, tel, add);
		this.memberId = memberId;
                
	}
	
	public String getMemberId() {
		return memberId;
	}

        public List<CheckoutRecord> getRecord() {
            return records;
        }

        public void addRecord(CheckoutRecord record) {
            this.records.add(record);
        }
	
	@Override
	public String toString() {
		return "Member Info: " + "ID: " + memberId + ", name: " + getFirstName() + " " + getLastName() + 
				", " + getTelephone() + " " + getAddress() + " " + getRecord();
	}

	private static final long serialVersionUID = -2226197306790714013L;
}
