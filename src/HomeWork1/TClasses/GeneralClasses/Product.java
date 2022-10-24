package HomeWork1.TClasses.GeneralClasses;

public class Product {
    private String productName;
    private double price;
    private int amount;
    private String unit;

    public Product(String productName, double price, int amount, String unit) {
        this.productName = productName;
        this.price = price;
        this.amount = amount;
        this.unit = unit;
    }

    public Product() {
    }

    @Override
    public String toString() {
        return String.format("Name: %s\nPrice: %.2f\nAmount: %d\nUnit: %s", this.productName,
                                                                          this.price,
                                                                          this.amount,
                                                                          this.unit);
    }
}
