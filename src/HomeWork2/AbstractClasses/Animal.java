package HomeWork2.AbstractClasses;

import HomeWork2.Interfaces.PrintAnimalInfo;
import HomeWork2.Interfaces.PlayCry;

public abstract class Animal implements PlayCry, PrintAnimalInfo {
    protected int height;
    protected double weight;
    protected String eyesColor;

    protected Animal(int height, double weight, String eyesColor) {
        this.height = height;
        this.weight = weight;
        this.eyesColor = eyesColor;
    }
    protected Animal() {
    }
    @Override
    public abstract void playCry();
    @Override
    public abstract void printAnimalInfo();
}
