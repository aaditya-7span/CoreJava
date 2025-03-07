package java8.lamdafunction;

class Book {
    String title;
    double price;

    Book(String title, double price) {
        this.title = title;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Book{" + "title='" + title + '\'' + ", price=" + price + '}';
    }
}