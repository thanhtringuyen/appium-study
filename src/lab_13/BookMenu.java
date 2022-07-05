package lab_13;

import java.util.Scanner;

public class BookMenu {
    public static void bookMenu() {
        System.out.println(
                "======= Book Management Program (CRUD)============\n" +
                        "1. New book\n" +
                        "2. Find a book(ISBN)\n" +
                        "3. Update a book\n" +
                        "4. Delete a book\n" +
                        "5. Print the book list\n" +
                        "0. Exit\n" +
                        "Please enter your selection\n");
    }
        public static void main(String[] args) {
            BookMenu BookManagement = new BookMenu();
            BookRecord record = new BookRecord();
            Scanner input = new Scanner(System.in);
            int option;
            do {
                bookMenu();
                option = input.nextInt();
                switch (option) {
                    case 1:
                        System.out.print("Please input the ISBN ? ");
                        int ISBN = input.nextInt();

                        System.out.print("Please input the Year of Published? ");
                        int year = input.nextInt();
                        input.nextLine();

                        System.out.print("Please input the Book Title ? ");
                        String title = input.nextLine();

                        System.out.print("Please input the Book Author ? ");
                        String author = input.nextLine();

                        record = new BookRecord(ISBN, title, author, year);
                        BookManagement.add(record);
                        System.out.println(record.toString());
                        break;

                    case 2:
                        System.out.print("What is the Book ISBN ? ");
                        int bookISBN = input.nextInt();
                        BookManagement.delete(bookISBN);
                        break;

                    case 3:
                        System.out.print("What is the Book ISBN? ");
                        int recordISBN = input.nextInt();
                        BookManagement.update(recordISBN, input);
                        break;

                    case 4:
                        System.out.print("What is the Book ISBN ? ");
                        int bookId = input.nextInt();
                        if (!BookManagement.find(bookId)) {
                            System.out.println("ISBN does not exist\n");
                        }
                        break;

                    case 5:
                        BookManagement.display();
                        break;

                    case 0:
                        System.out.println("\nThank you for using the program!\n");
                        System.exit(0);
                        break;

                    default:
                        System.out.println("\nInvalid input\n");
                        break;
                }
            }
            while (option != 0);
        }
    }