package HomeWork1.TClasses.RealClasses;

import HomeWork1.TClasses.GeneralClasses.Drink;

public class Soda extends Drink {
    /**
     * Класс "Лимонад"
     * @param productName - Название
     * @param price       - Цена
     * @param amount      - Количество
     * @param unit        - Единицы измерения
     * @param volume      - Объем
     */
    public Soda(String productName, double price, int amount, String unit, double volume) {
        super(productName, price, amount, unit, volume);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
