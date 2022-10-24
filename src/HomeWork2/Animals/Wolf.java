package HomeWork2.Animals;

import HomeWork2.AbstractClasses.WildAnimal;
import HomeWork2.Interfaces.ToLeader;

public class Wolf extends WildAnimal implements ToLeader {
    private boolean leader;

    public Wolf(int height, double weight, String eyesColor, String habitat, String dateFinding, boolean leader) {
        super(height, weight, eyesColor, habitat, dateFinding);
        this.leader = leader;
    }

    public Wolf() {
        super(80, 20, "green", "russia", "20.08.2022");
        this.leader = false;
    }

    @Override
    public void playCry() {
        System.out.println("Awwwuuu!!!");
    }

    @Override
    public void printAnimalInfo() {
        System.out.println("\nWolf");
        System.out.printf("Eyes color: %s\n", this.eyesColor);
        System.out.printf("Height: %s\n", this.height);
        System.out.printf("Weight: %.3f\n", this.weight);
        System.out.printf("Habitat: %s\n", this.habitat);
        System.out.printf("Date of finding: %s\n", this.dateFinding);
        System.out.printf("Leader: %s\n", this.leader);
    }

    public boolean getLeader(){return this.leader;}

    @Override
    public boolean toLeader(Boolean leader) {
        this.leader = leader;
        return leader;
    }
}
