package overloading;

//Changing the Order of the Parameters of Methods
public class BookStoreService {

    public void purchaseBook(String title, String author, int quantity) {
        System.out.println("Purchasing " + quantity + " copies of " + title + " by " + author + ".");
    }

    public void purchaseBook(int quantity, String title, String author) {
        System.out.println("Purchasing " + quantity + " copies of " + title + " by " + author + ".");
    }

    public static void main(String[] args) {
        BookStoreService bookstoreService = new BookStoreService();
        bookstoreService.purchaseBook("rich dad poor dad", "ram lakhan", 3);
        bookstoreService.purchaseBook(20, "maths text book", "mukeshbhai pathak");
    }
}
