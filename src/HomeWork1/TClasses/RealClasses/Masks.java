package HomeWork1.TClasses.RealClasses;

import HomeWork1.TClasses.GeneralClasses.HygieneItems;

public class Masks extends HygieneItems {
    /**
     * Класс "Маски"
     * @param productName    - Название
     * @param price          - Цена
     * @param amount         - Количество
     * @param unit           - Единицы измерения
     * @param quantityInPack - Количество в упаковке
     */
    public Masks(String productName,
                 double price,
                 int amount,
                 String unit,
                 int quantityInPack) {
        super(productName, price, amount, unit, quantityInPack);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
