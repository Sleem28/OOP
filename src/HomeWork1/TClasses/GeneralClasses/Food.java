package HomeWork1.TClasses.GeneralClasses;

public class Food extends Product{
    private final String bestBeforeDate;

    /** Класс продукты питания
     *
     * @param productName - Название продукта
     * @param price - Цена
     * @param amount - Количество
     * @param unit - Единицы измерения
     * @param bestBeforeDate - Срок годности
     */
    public Food(String productName, double price, int amount, String unit, String bestBeforeDate) {
        super(productName, price, amount, unit);
        this.bestBeforeDate = bestBeforeDate;
    }

    @Override
    public String toString() {
        return String.format("%s\nBest before price: %s", super.toString(), this.bestBeforeDate);
    }
}
