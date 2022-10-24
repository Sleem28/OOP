package HomeWork5;

import HomeWork5.Classes.CalcFactory;
import HomeWork5.Classes.Presenter;
import HomeWork5.Classes.View;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Presenter presenter = new Presenter(new View(new Scanner(System.in)), new CalcFactory());
        presenter.run();
    }
}
