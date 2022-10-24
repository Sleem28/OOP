package HomeWork1.TClasses.RealClasses;

import HomeWork1.TClasses.GeneralClasses.HygieneItems;

public class ToiletPapper extends HygieneItems {
    private final int layers;

    /**
     * Класс "Туалетная бумага"
     * @param productName    - Название
     * @param price          - Цена
     * @param amount         - Количество
     * @param unit           - Единицы измерения
     * @param quantityInPack - Количество в упаковке
     * @param layers         - Количество слоев
     */
    public ToiletPapper(String productName, double price, int amount, String unit, int quantityInPack, int layers) {
        super(productName, price, amount, unit, quantityInPack);
        this.layers = layers;
    }

    @Override
    public String toString() {
        return String.format("%s\nNumbers of layers: %s", super.toString(), this.layers);
    }
}
