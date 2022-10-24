package HomeWork2.Zoo;

import HomeWork2.AbstractClasses.AZoo;
import HomeWork2.AbstractClasses.Animal;

public class Zoo extends AZoo {
    public Animal[] getZoo() {
        return zoo;
    }
    private Animal[] zoo;
    
    public Zoo(){
        this.zoo = new Animal[10];
    }
    @Override
    public void addAnimal(int index, Animal animal){
        if(index < 0) index = 0;

        int size = (this.zoo.length-1 >= index)? this.zoo.length+1: index+1;
        Animal[] tmp = new Animal[size];

        for (int i = 0; i < tmp.length; i++) {
            if(i<index){
                tmp[i] = this.zoo[i];
            } else if (i == index) {
                tmp[i] = animal;
            }else 
                tmp[i] = this.zoo[i-1];
        }
        this.zoo = tmp;
    }

    public void addAnimal(Animal animal){
        this.addAnimal(0,animal);
    }
    @Override
    public void delAnimal(int index){
        if(index > this.zoo.length-1){
            System.out.println("Index out of bonds");
            return;
        }
        Animal[] tmp = new Animal[this.zoo.length-1];

        for (int i = 0; i < this.zoo.length; i++) {
            if(i<index)
                tmp[i] = zoo[i];
            else if (i>index)
                tmp[i-1] = zoo[i];
        }
        this.zoo = tmp;
    }
}
