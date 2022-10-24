package HomeWork1.TClasses.RealClasses;

import HomeWork1.TClasses.GeneralClasses.Food;

public class Eggs extends Food {
    private final int quantityInPack;

    /**
     * Класс "Яйца"
     * @param productName    - Название
     * @param price          - Цена
     * @param amount         - Количество
     * @param unit           - Единицы измерения
     * @param bestBeforeDate - Срок годности
     * @param quantityInPack - Количество в упаковке
     */
    public Eggs(String productName, double price, int amount, String unit, String bestBeforeDate, int quantityInPack) {
        super(productName, price, amount, unit, bestBeforeDate);
        this.quantityInPack = quantityInPack;
    }

    @Override
    public String toString() {
        return String.format("%s\nКоличество в упаковке: %s", super.toString(), this.quantityInPack);
    }
}
