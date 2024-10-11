package com.pluralsight;

public class Book {
    private int id;
    private String isbn;
    private String title;
    private boolean isCheckedOut;
    private String checkedOutTo;

    public Book(int id, String isbn, String title) {
        this.id = id;
        this.isbn = isbn;
        this.title = title;
        this.isCheckedOut = false;
        this.checkedOutTo = null;
    }

    public int getId()
    {
        return id;
    }

    public String getIsbn()
    {
        return isbn;
    }

    public String getTitle()
    {
        return title;
    }

    public boolean isCheckedOut()
    {
        return isCheckedOut;
    }

    public String getCheckedOutTo()
    {
        return checkedOutTo;
    }

    public void checkOut(String userName) {
        if (!isCheckedOut) {
            this.isCheckedOut = true;
            this.checkedOutTo = userName;
            System.out.println(title + " checked out to " + userName);
        } else {
            System.out.println(title + " is already checked out.");
        }
    }


    public void checkIn() {
        if (isCheckedOut) {
            this.isCheckedOut = false;
            this.checkedOutTo = "";
            System.out.println(title + " has been checked in.");
        } else {
            System.out.println(title + " is not checked out.");
    }
}
