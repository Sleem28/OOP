package HomeWork2.Animals;

import HomeWork2.AbstractClasses.Pet;
import HomeWork2.Interfaces.ToTrain;

public class Dog extends Pet implements ToTrain {
    private static int dogNamesCounter = 1;
    private boolean training;

    public Dog(int height,
               double weight,
               String eyesColor,
               String name,
               String breed,
               boolean vaccinations,
               String woolColor,
               String birthday,
               boolean training) {
        super(height, weight, eyesColor, name, breed, vaccinations, woolColor, birthday);
        this.training = training;
    }

    public Dog() {
        super(70,
                5,
                "black",
                String.format("Dog %d", dogNamesCounter++),
                "cur",
                false,
                "dirty",
                "no info");
        this.training = false;
    }

    @Override
    public void playCry() {
        System.out.println("Whoof whoof!!!");
    }

    @Override
    public void printAnimalInfo() {
        System.out.println("\nDog");
        System.out.printf("Name: %s\n", this.name);
        System.out.printf("Breed: %s\n", this.breed);
        System.out.printf("Birthday: %s\n", this.birthday);
        System.out.printf("Wool color: %s\n", this.woolColor);
        System.out.printf("Eyes color: %s\n", this.eyesColor);
        System.out.printf("Height: %d\n", this.height);
        System.out.printf("Weight: %.3f\n", this.weight);
        System.out.printf("Vaccinations: %b\n", this.vaccinations);
        System.out.printf("Training: %b\n", this.training);
    }

    @Override
    public void showAffection() {
        System.out.println("I am happy dog!!! Auuu!!!");
    }

    public boolean getTraining(){return this.training;}
    @Override
    public final void toTrain(boolean toTrain){
        if(this.training){
            System.out.printf(" Dog with name %s already trained!!!", this.name);
        }else
            this.training = toTrain;
    }
}
