package HomeWork1.TClasses.RealClasses;


import HomeWork1.TClasses.GeneralClasses.Drink;

public class Milk extends Drink {
    private final double percentFat;
    private final String bestBeforeDate;;

    /**
     * Класс "Молоко"
     * @param productName    - Название
     * @param price          - Цена
     * @param amount         - Количество
     * @param unit           - Единицы измерения
     * @param volume         - Объем
     * @param percentFat     - Процент жирности
     * @param bestBeforeDate - Срок Годности
     */
    public Milk(String productName,
                double price,
                int amount,
                String unit,
                double volume,
                double percentFat,
                String bestBeforeDate) {
        super(productName, price, amount, unit, volume);
        this.percentFat = percentFat;
        this.bestBeforeDate = bestBeforeDate;
    }

    @Override
    public String toString() {
        return String.format("%s\nPercent of fat: %s\nBest before price: %s", super.toString(),
                                                                              this.percentFat,
                                                                              this.bestBeforeDate);
    }
}
