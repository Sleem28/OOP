package HomeWork2.Zoo;

import HomeWork2.AbstractClasses.AAnimalCreator;
import HomeWork2.AbstractClasses.AZoo;
import HomeWork2.AbstractClasses.AZooManager;
import HomeWork2.AbstractClasses.Animal;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ZooManager extends AZooManager {
    public ZooManager(AAnimalCreator creator, AZoo zoo) {
        this.creator = creator;
        this.zoo = zoo;
        this.reader = new BufferedReader(new InputStreamReader(System.in));
    }

    @Override
    public void playAllCry() {
        System.out.println("Play cry all animals in the zoo");
        Animal[] animals = this.zoo.getZoo();
        for (int i = 0; i < animals.length; i++) {
            if(animals[i] != null) {
                animals[i].playCry();
                System.out.println();
            }
        }
        System.out.println();
    }

    @Override
    public void playCry() throws IOException {
        System.out.println("Enter animal index to play cry");
        this.zoo.getZoo()[Integer.parseInt(reader.readLine())].playCry();
    }

    @Override
    public void printAllInfo() {
        System.out.println("Show info about all animals in the zoo");
        Animal[] animals = this.zoo.getZoo();
        for (int i = 0; i < animals.length; i++) {
            if(animals[i] != null) {
                animals[i].printAnimalInfo();
                System.out.println();
            }
        }
        System.out.println();
    }

    @Override
    public void printInfo() throws IOException {
        System.out.println("Enter animal index to get info");
        this.zoo.getZoo()[Integer.parseInt(reader.readLine())].printAnimalInfo();
    }

    @Override
    public void addAnimal(String type) throws IOException {
        switch (type){
            case ("Cat") -> this.zoo.addAnimal(getIndex(type), creator.getCat());
            case ("Dog") -> this.zoo.addAnimal(getIndex(type), creator.getDog());
            case ("Hen") -> this.zoo.addAnimal(getIndex(type), creator.getHen());
            case ("Stork") -> this.zoo.addAnimal(getIndex(type), creator.getStork());
            case ("Tiger") -> this.zoo.addAnimal(getIndex(type), creator.getTiger());
            case ("Wolf") -> this.zoo.addAnimal(getIndex(type), creator.getWolf());
        }
    }

    @Override
    public int getIndex(String type) throws IOException {
        System.out.printf("Enter %s place in zoo.\n", type);
        boolean isTrue = false;
        int result = 0;
        while (!isTrue){
            result = Integer.parseInt(this.reader.readLine());
            if(result >= 0) isTrue = true;
            else
                System.out.printf("The place in zoo must be equals or more than zero.\nEnter %s place in zoo.\n", type);
        }
        return result;
    }

    @Override
    public void delAnimal() throws IOException {
        System.out.println("Enter the animal's index to delete");
        this.zoo.delAnimal(Integer.parseInt(reader.readLine()));
    }
}
