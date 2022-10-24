package HomeWork1.TClasses.GeneralClasses;

public class Drink extends Product{
    private final double volume;
    public Drink(String productName, double price, int amount, String unit, double volume) {
        super(productName, price, amount, unit);
        this.volume = volume;
    }

    @Override
    public String toString() {
        return String.format("%s\nVolume: %s", super.toString(), this.volume);
    }
}
