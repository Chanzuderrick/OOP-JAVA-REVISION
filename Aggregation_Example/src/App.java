public class App {
    public static void main(String[] args) throws Exception {
        /*Aggregation
        Represents a "has-a" relationship between objects
        One object contains another object as part of its structure
        but the contained object can exist independently
        */

        Book book1 = new Book("Merchant of Venice", 230);
        Book book2 = new Book(" The pearl ", 400);
        Book book3 = new Book(" The two towers ", 154);

        //if I delete the library class the books can exist independently

        //aggregation starts from here

        Book[] books = { book1, book2, book3 };

        Library library = new Library("Kisumu Library", 1914, books);
        library.displayInfo();

 
        /*
         *        for (Book book : books) {
            System.out.println(book.displayInfo());

        }
         * 
        System.out.println(book1.displayInfo());
        System.out.println(book2.displayInfo());
        System.out.println(book3.displayInfo());
        */

    }
}
