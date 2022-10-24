package HomeWork1.TClasses.RealClasses;

import HomeWork1.TClasses.GeneralClasses.Food;

public class Bread extends Food {
    private final String flourType;

    /**
     * Класс "Хлеб"
     * @param productName    - Название
     * @param price          - Цена
     * @param amount         - Количество
     * @param unit           - Единицы измерения
     * @param bestBeforeDate - Срок годности
     * @param flourType      - Тип муки
     */
    public Bread(String productName, double price, int amount, String unit, String bestBeforeDate, String flourType) {
        super(productName, price, amount, unit, bestBeforeDate);
        this.flourType = flourType;
    }

    @Override
    public String toString() {
        return String.format("%s\nFlour's type: %s", super.toString(), this.flourType);
    }
}
