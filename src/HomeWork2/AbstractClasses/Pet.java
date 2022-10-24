package HomeWork2.AbstractClasses;

import HomeWork2.Interfaces.ShowAffection;

public abstract class Pet extends Animal implements ShowAffection {
    protected String name;
    protected String breed;
    protected boolean vaccinations;
    protected String woolColor;
    protected String birthday;

    public Pet(int height,
               double weight,
               String eyesColor,
               String name,
               String breed,
               boolean vaccinations,
               String woolColor,
               String birthday) {
        super(height, weight, eyesColor);
        this.name = name;
        this.breed = breed;
        this.vaccinations = vaccinations;
        this.woolColor = woolColor;
        this.birthday = birthday;
    }

    @Override
    public abstract void showAffection();
}
