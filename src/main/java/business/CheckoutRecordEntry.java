/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business;

import java.io.Serializable;
import java.time.LocalDate;

/**
 *
 * @author garit
 */
public class CheckoutRecordEntry implements Serializable {
    private LocalDate checkoutDate;
    private LocalDate dueDate;
    private BookCopy bookCopy;

    public CheckoutRecordEntry(LocalDate checkoutDate, LocalDate dueDate, BookCopy copy) {
        this.checkoutDate = checkoutDate;
        this.dueDate = dueDate;
        this.bookCopy = copy;
    }
    
    public LocalDate getCheckoutDate() {
        return checkoutDate;
    }

    public void setCheckoutDate(LocalDate checkoutDate) {
        this.checkoutDate = checkoutDate;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    public void setDueDate(LocalDate dueDate) {
        this.dueDate = dueDate;
    }

    public BookCopy getBookCopy() {
        return bookCopy;
    }

    public void setBookCopy(BookCopy bookCopy) {
        this.bookCopy = bookCopy;
    }

    @Override
    public String toString() {
        return "CheckoutRecordEntry{" + "checkoutDate=" + checkoutDate + ", dueDate=" + dueDate + ", bookCopy=" + bookCopy + '}';
    }
}
