package HomeWork2.AbstractClasses;

import HomeWork2.Interfaces.Flight;

public abstract class Bird extends Animal implements Flight {
    public final int flightHeight;

    public Bird(int height, double weight, String eyesColor, int flightHeight) {
        super(height, weight, eyesColor);
        this.flightHeight = flightHeight;
    }
    @Override
    public void flight(){
        System.out.printf("Я лечу на %d метрах", this.flightHeight);
    }
}
