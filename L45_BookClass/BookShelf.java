package L45_BookClass;

import java.util.Scanner;

public class BookShelf {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        boolean quit = false;
        String title_;
        String author_;
        String publisher_;
        int copyrightDate_;
        String toQuit;

        Book book = new Book("", "", "", 0);


        while (!quit) {

            System.out.println("Please insert the \"TITLE\", \"AUTHOR\", \"PUBLISHER\", \"COPYRIGHT DATE\"");
            title_ = scanner.next();
            author_ = scanner.next();
            publisher_ = scanner.next();
            copyrightDate_ = scanner.nextInt();

            book.setTitle(title_);
            book.setAuthor(author_);
            book.setPublisher(publisher_);
            book.setCopyrightDate(copyrightDate_);

//            scanner.nextLine();

            System.out.println(book);

            System.out.println("Press any key to continue or press 'Q' to quit");
            toQuit = scanner.next();

            if (toQuit.equalsIgnoreCase("Q")) {
                quit = true;
            }
        }
        scanner.close();
        book.scannerClose();
        System.out.println("Good Bye!");
    }
}
