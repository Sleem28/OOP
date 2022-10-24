package HomeWork2.Animals;

import HomeWork2.AbstractClasses.WildAnimal;

public class Tiger extends WildAnimal {

    public Tiger(int height, double weight, String eyesColor, String habitat, String dateFinding) {
        super(height, weight, eyesColor, habitat, dateFinding);
    }

    public Tiger(){
        super(100, 60, "Yellow", "Africa", "05.06.2022");
    }

    @Override
    public void playCry() {
        System.out.println("RRRRR!!!!");
    }

    @Override
    public void printAnimalInfo() {
        System.out.println("\nTiger");
        System.out.printf("Eyes color: %s\n", this.eyesColor);
        System.out.printf("Height: %s\n", this.height);
        System.out.printf("Weight: %.3f\n", this.weight);
        System.out.printf("Habitat: %s\n", this.habitat);
        System.out.printf("Date of finding: %s\n", this.dateFinding);
    }
}
