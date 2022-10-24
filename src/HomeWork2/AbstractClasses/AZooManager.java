package HomeWork2.AbstractClasses;

import HomeWork2.Interfaces.Params.GetIndex;
import HomeWork2.Interfaces.ZooManager.*;

import java.io.BufferedReader;

public abstract class AZooManager implements PlayAllCry, PlayCry, PrintAllInfo, PrintInfo, AddAnimal, GetIndex, DelAnimal {
    protected AAnimalCreator creator;
    protected AZoo zoo;
    protected BufferedReader reader;
}
