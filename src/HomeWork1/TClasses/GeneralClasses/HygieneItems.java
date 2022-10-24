package HomeWork1.TClasses.GeneralClasses;

public class HygieneItems extends Product{
    private final int quantityInPack;

    public HygieneItems(String productName, double price, int amount, String unit, int quantityInPack) {
        super(productName, price, amount, unit);
        this.quantityInPack = quantityInPack;
    }

    @Override
    public String toString() {
        return String.format("%s\nQuantityInPack: %s", super.toString(), this.quantityInPack);
    }
}
