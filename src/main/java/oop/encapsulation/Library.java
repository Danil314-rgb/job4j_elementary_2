package oop.encapsulation;

public class Library {

    public static void main(String[] args) {
        Book book1 = new Book("War and Peace", 605);
        Book book2 = new Book("Biology", 55);
        Book book3 = new Book("Bible", 666);
        Book book4 = new Book("Clean code", 764);
        Book[] books = new Book[4];
        books[0] = book1;
        books[1] = book2;
        books[2] = book3;
        books[3] = book4;
        for (int index = 0; index < books.length; index++) {
            Book book = books[index];
            System.out.println(book.getName() + " - " + book.getCount());
        }
        books[0] = book4;
        books[3] = book1;
        System.out.println("Replace book4 to book1");
        for (int index = 0; index < books.length; index++) {
            Book book = books[index];
            System.out.println(book.getName() + " - " + book.getCount());
        }
        System.out.println("Shown only name book = Clean code");

        for (int index = 0; index < books.length; index++) {
            Book book = books[index];
            if (book.getName().equals("Clean code")) {
                System.out.println(book.getName() + " - " + book.getCount());
            }
        }
    }
}
