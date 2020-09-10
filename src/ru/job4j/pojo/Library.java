package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book book1 = new Book();
        Book book2 = new Book();
        Book book3 = new Book();
        Book book4 = new Book();
        Book[] books = new Book[] {book1, book2, book3, book4};
        book1.setTitle("Clean code");
        book1.setNumberOfPage(100);

        for (int index = 0; index < books.length; index++) {
            Book b = books[index];
            System.out.println(b.getTitle() + " - " + b.getNumberOfPage());
        }
        System.out.println();
        Book temp = books[0];
        books[0] = books[3];
        books[3] = temp;
        for (int index = 0; index < books.length; index++) {
            Book b = books[index];
            System.out.println(b.getTitle() + " - " + b.getNumberOfPage());
        }
        System.out.println();
        for (int index = 0; index < books.length; index++) {
            Book b = books[index];
            if (b.getTitle() != null && b.getTitle().equals("Clean code")) {
                System.out.println(b.getTitle() + " - " + b.getNumberOfPage());
            }
        }
    }
}
