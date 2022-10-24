package HomeWork2.Animals;

import HomeWork2.AbstractClasses.Bird;

public class Stork extends Bird {
    public Stork(int height, double weight, String eyesColor, int flightHeight) {
        super(height, weight, eyesColor, flightHeight);
    }

    public Stork() {
        super(70, 7, "Yellow", 200);
    }

    @Override
    public void playCry() {
        System.out.println("Glack glack!!");
    }

    @Override
    public void printAnimalInfo() {
        System.out.println("\nStork");
        System.out.printf("Eyes color: %s\n", this.eyesColor);
        System.out.printf("Height: %s\n", this.height);
        System.out.printf("Weight: %.3f\n", this.weight);
        System.out.printf("Flight's height: %s\n", this.flightHeight);
    }
}
