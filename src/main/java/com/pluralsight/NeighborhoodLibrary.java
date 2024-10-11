package com.pluralsight;

import java.util.Scanner;

public class NeighborhoodLibrary {
    private Book[] books;

    public NeighborhoodLibrary() {
        books = new Book[20];
        books[0] = new Book(1, "978-0452284241", "The Alchemist");
        books[1] = new Book(2, "978-0062315007", "To Kill a Mockingbird");
        books[2] = new Book(3, "978-0307277671", "The Road");
        books[3] = new Book(4, "978-0307387899", "The Catcher in the Rye");
        books[4] = new Book(5, "978-0439139601", "Harry Potter and the Goblet of Fire");
        books[5] = new Book(6, "978-0143127741", "Grit: The Power of Passion and Perseverance");
        books[6] = new Book(7, "978-0349413686", "The Confidence Code");
        books[7] = new Book(8, "978-0374533557", "Flow: The Psychology of Optimal Experience");
        books[8] = new Book(9, "978-1982134488", "Atomic Habits");
        books[9] = new Book(10, "978-1524763138", "Dare to Lead");
        books[10] = new Book(11, "978-0062316097", "The Subtle Art of Not Giving a F*ck");
        books[11] = new Book(12, "978-0143127550", "Drive: The Surprising Truth About What Motivates Us");
        books[12] = new Book(13, "978-0062839091", "Educated: A Memoir");
        books[13] = new Book(14, "978-0525538174", "The Infinite Game");
        books[14] = new Book(15, "978-0375714832", "Outliers: The Story of Success");
        books[15] = new Book(16, "978-1451639612", "The 7 Habits of Highly Effective People");
        books[16] = new Book(17, "978-1476746586", "The Power of Now");
        books[17] = new Book(18, "978-0062457714", "You Are a Badass");
        books[18] = new Book(19, "978-0804139298", "Start with Why");
        books[19] = new Book(20, "978-0399590504", "Becoming");
    }

    public void showAvailableBooks() {
        System.out.println("Currently available books:");
        for (Book book : books) {
            if (!book.isCheckedOut()) {
                System.out.println("ID: " + book.getId() + ", Title: " + book.getTitle() + ", ISBN: " + book.getIsbn());
            }
        }
    }

    public void showCheckedOutBooks() {
        System.out.println("Checked out books:");
        for (Book book : books) {
            if (book.isCheckedOut()) {
                System.out.println("ID: " + book.getId() + ", Title: " + book.getTitle() + ", Checked out to: " + book.getCheckedOutTo());
            }
        }
    }

    public void checkOutBook(int bookId, String userName) {
        for (Book book : books) {
            if (book.getId() == bookId) {
                book.checkOut(userName);
                return;
            }
        }
        System.out.println("Book has not been found.");
    }

    public void checkInBook(int bookId) {
        for (Book book : books) {
            if (book.getId() == bookId) {
                book.checkIn();
                return;
            }
        }
        System.out.println("Book has not been found.");
    }

    public static void main(String[] args) {
        NeighborhoodLibrary library = new NeighborhoodLibrary();
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            System.out.println("Hello dear reader welcome to the Neighborhood Library!");
            System.out.println("1. Show available books");
            System.out.println("2. Show checked out books");
            System.out.println("3. Check out a book");
            System.out.println("4. Check in a book");
            System.out.println("5. Exit");
            System.out.print("Please choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();


            switch (choice) {
                case 1:
                    library.showAvailableBooks();
                    break;
                case 2:
                    library.showCheckedOutBooks();
                    break;
                case 3:
                    System.out.print("Dear reader enter the book ID to check out: ");
                    int checkOutId = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter your name: ");
                    String userName = scanner.nextLine();
                    library.checkOutBook(checkOutId, userName);
                    break;
                case 4:
                    System.out.print("Dear reader enter the book ID for check in: ");
                    int checkInId = scanner.nextInt();
                    library.checkInBook(checkInId);
                    break;
                case 5:
                    exit = true;
                    System.out.println("Exiting the library system.");
                    break;
                default:
                    System.out.println("Invalid option reader. Please try again.");
            }
        }

        scanner.close();
    }
}