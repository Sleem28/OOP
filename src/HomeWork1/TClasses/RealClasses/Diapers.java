package HomeWork1.TClasses.RealClasses;

import HomeWork1.TClasses.GeneralClasses.HygieneItems;

public class Diapers extends HygieneItems {
    private final String size;
    private final double minWeight;
    private final double maxWeight;
    private final String sexType;

    /**
     *  Класс "Подгузники"
     * @param productName    - Название
     * @param price          - Цена
     * @param amount         - Количество
     * @param unit           - Единицы измерения
     * @param quantityInPack - Количество в упаковке
     * @param size           - Размер
     * @param minWeight      - Минимальный вес
     * @param maxWeight      - Максимальный вес
     * @param sexType        - Тип
     */
    public Diapers(String productName,
                   double price,
                   int amount,
                   String unit,
                   int quantityInPack,
                   String size,
                   double minWeight,
                   double maxWeight,
                   String sexType) {
        super(productName, price, amount, unit, quantityInPack);
        this.size = size;
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;
        this.sexType = sexType;
    }

    @Override
    public String toString() {
        return String.format("%s\nSize: %s\nMin weight: %f\nMax weight: %f\nSex type: %s", super.toString(),
                                                                                           this.size,
                                                                                           this.minWeight,
                                                                                           this.maxWeight,
                                                                                           this.sexType);
    }
}
