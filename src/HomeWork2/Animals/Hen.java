package HomeWork2.Animals;

import HomeWork2.AbstractClasses.Bird;

public class Hen extends Bird {

    public Hen(int height, double weight, String eyesColor, int flightHeight) {
        super(height, weight, eyesColor, flightHeight);
    }

    public Hen() {
        super(30, 3, "Yellow", 0);
    }

    @Override
    public void playCry() {
        System.out.println("Co co co co");
    }

    @Override
    public void printAnimalInfo() {
        System.out.println("\nHen");
        System.out.printf("Eyes color: %s\n", this.eyesColor);
        System.out.printf("Height: %s\n", this.height);
        System.out.printf("Weight: %.3f\n", this.weight);
        System.out.printf("Flight's height: %s\n", this.flightHeight);
    }
}
