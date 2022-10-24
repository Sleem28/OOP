package HomeWork1.TClasses.GeneralClasses;

public class ChildrenFood extends Product{
    private final int minAge;
    private final boolean hypoallergenic;

    public ChildrenFood(String productName, double price, int amount, String unit, int minAge, boolean hypoallergenic) {
        super(productName, price, amount, unit);
        this.minAge = minAge;
        this.hypoallergenic = hypoallergenic;
    }

    @Override
    public String toString() {
        return String.format("%s\nMinimal Age: %s\nHypoallergenic:%s", super.toString(),
                                                                       this.minAge,
                                                                       this.hypoallergenic);
    }
}
