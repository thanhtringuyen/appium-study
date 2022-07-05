package lab_13;

import java.util.LinkedList;
import java.util.Scanner;

public class BookManagement {
    LinkedList<BookRecord> list;

    public BookManagement()
    {
        list = new LinkedList<>();
    }

    public void add(BookRecord record)
    {
        if (!find(record.getISBN())) {
            list.add(record);
        }
        else {
            System.out.println("Record already exists in the Record list");
        }
    }

    public boolean find(int ISBN)
    {
        for (BookRecord list : list) {
            if (list.getISBN() == ISBN) {
                System.out.println(list);
                return true;
            }
        }
        return false;
    }

    public void delete(int recordISBN)
    {
        BookRecord recordDel = null;
        for (BookRecord list : list) {
            if (list.getISBN() == recordISBN) {
                recordDel = list;
            }
        }

        if (recordDel == null) {
            System.out.println("Invalid record ISBN");
        }
        else {
            list.remove(recordDel);
            System.out.println("Successfully removed record from the list");
        }
    }

    public void update(int id, Scanner input)
    {
        if (find(id)) {
            BookRecord record = findRecord(id);
            System.out.print("Please input the new ISBN ? ");
            int ISBN = input.nextInt();

            System.out.print("Please input the new Year of Published");
            int year = input.nextInt();
            input.nextLine();

            System.out.print("Please input the new Book Title ? ");
            String title = input.nextLine();

            System.out.print("Please input the new Book Author ? ");
            String author = input.nextLine();

            record.setTitle(title);
            record.setISBN(ISBN);
            record.setAuthor(author);
            record.setYear(year);
            System.out.println("Record Updated Successfully");
        }
        else {
            System.out.println("Record Not Found in the Book list");
        }
    }

    public BookRecord findRecord(int ISBN)
    {
        for (BookRecord list : list) {
            if (list.getISBN() == ISBN) {
                return list;
            }
        }
        return null;
    }

    public void display()
    {
        if (list.isEmpty()) {
            System.out.println("The list has no records\n");
        }
        for (BookRecord record : list) {
            System.out.println(record.toString());
        }
    }
}
