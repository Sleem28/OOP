package HomeWork1.TClasses.RealClasses;

import HomeWork1.TClasses.GeneralClasses.Product;

public class Pacifier extends Product {
    /**
     * Класс "Соска"
     * @param productName - Название
     * @param price       - Цена
     * @param amount      - Количество
     * @param unit        - Единицы измерения
     */
    public Pacifier(String productName, double price, int amount, String unit) {
        super(productName, price, amount, unit);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
