package HomeWork2.AbstractClasses;

public abstract class WildAnimal extends Animal{
    protected String habitat;
    protected String dateFinding;

    public WildAnimal(int height,
                      double weight,
                      String eyesColor,
                      String habitat,
                      String dateFinding) {
        super(height, weight, eyesColor);
        this.habitat = habitat;
        this.dateFinding = dateFinding;
    }
}
