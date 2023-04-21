package com.pn;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Book[] books = new Book[20];


        books[0] = new Book(102, "429547", "Java Basics", false, "null");
        books[1] = new Book(051, "749521", "Java: For Dummies", true, "Pavel Nosarev");
        books[2] = new Book(102, "429547", "1 2 3 Java ", false, "null");
        books[3] = new Book(005, "429547", "Let Us Java", false, "null");
        books[4] = new Book(001, "429547", "Java: How to Code Like a Barista and Keep Your Programs Brewing Perfectly Every Time (Without Spilling the Beans)", false, "null");

    }
}


class Book {

///properties //

    private int  id;
    private String isbn;
    private String title;
    private boolean isCheckedOut;
    private String isCheckedOutTo;

        //constructor
     public Book (int id, String isbn, String title, boolean  isCheckedOut, String isCheckedOutTo) {
                this.id= id;
                this. isbn = isbn;
                this.title = title;
                this.isCheckedOut = isCheckedOut;
                this.isCheckedOutTo = isCheckedOutTo;
     }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean isCheckedOut() {
        return isCheckedOut;
    }

    public void setCheckedOut(boolean checkedOut) {
        isCheckedOut = checkedOut;
    }

    public String getIsCheckedOutTo() {
        return isCheckedOutTo;
    }

    public void setIsCheckedOutTo(String isCheckedOutTo) {
        this.isCheckedOutTo = isCheckedOutTo;
    }
}