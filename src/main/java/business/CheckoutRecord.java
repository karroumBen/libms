/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business;

import java.io.Serializable;

/**
 *
 * @author garit
 */
public class CheckoutRecord implements Serializable {
    private String checkoutRecordId;
    private CheckoutRecordEntry recordEntry;
    public CheckoutRecord(String checkoutRecordId) {
        this.checkoutRecordId = checkoutRecordId;
    }

    public String getCheckoutRecordId() {
        return checkoutRecordId;
    }

    public void setCheckoutRecordId(String checkoutRecordId) {
        this.checkoutRecordId = checkoutRecordId;
    }

    public CheckoutRecordEntry getRecordEntry() {
        return recordEntry;
    }

    public void setRecordEntry(CheckoutRecordEntry recordEntry) {
        this.recordEntry = recordEntry;
    }
    

    @Override
    public String toString() {
        return "CheckoutRecord{" + "recordEntries=" + recordEntry + '}';
    }
}
