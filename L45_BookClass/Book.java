package L45_BookClass;

import java.util.Scanner;

public class Book {

    String title, author, publisher;
    int copyrightDate;

    Scanner scanner = new Scanner(System.in);

    public Book(String title, String author, String publisher, int copyrightDate) {
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.copyrightDate = copyrightDate;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public int getCopyrightDate() {
        return copyrightDate;
    }

    public void setCopyrightDate(int copyrightDate) {
        while (copyrightDate < 1900) {
            System.out.println("Copyright mus't be less than 1900");
            copyrightDate = scanner.nextInt();
        }
        this.copyrightDate = copyrightDate;
    }

    public void scannerClose() {
        scanner.close();
    }

    public String toString() {
        return "Title: " + getTitle() + "\nAuthor: " + getAuthor() + "\nPublisher: " + getPublisher() + "\nCopyright date: " + getCopyrightDate();
    }

}



