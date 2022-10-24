package HomeWork2.AbstractClasses;

import HomeWork2.Interfaces.Animals.*;
import HomeWork2.Zoo.AnimalParamCreator;

public abstract class AAnimalCreator implements GetCat,
        GetDog,
        GetHen,
        GetStork,
        GetTiger,
        GetWolf{
    protected AAnimalParamCreator paramCreator;
}
