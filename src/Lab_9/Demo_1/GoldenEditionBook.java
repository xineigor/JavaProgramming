package Lab_9.Demo_1;

public class GoldenEditionBook extends Book {
    public GoldenEditionBook(String title, String author, Double price) {
        super(title, author, price);
    }

    @Override
    public Double getPrice() {
        return super.getPrice() * 1.3;
    }
}
