package HomeWork1;
import HomeWork1.TClasses.*;
import HomeWork1.TClasses.GeneralClasses.Product;
import HomeWork1.TClasses.RealClasses.*;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Product> myProduct = new ArrayList<>();
        myProduct.add(new Bread("Батон", 1.02, 10,"шт", "30.10.2022", "Первый сорт"));
        myProduct.add(new Diapers("Pampers", 250, 48, "шт", 2, "M", 10, 15, "M"));
        myProduct.add(new Eggs("Золотые", 15, 10, "шт", "30.10.2022", 24));
        myProduct.add(new Masks("Маски", 22, 100, "шт", 5));
        myProduct.add(new Milk("ЭкоМилк", 10, 1, "литр", 1, 3.2, "30.10.2022"));
        myProduct.add(new Pacifier("Соска", 25, 1, "шт"));
        myProduct.add(new Soda("CocaCola", 10, 1, "литр", 1));
        myProduct.add(new ToiletPapper("Zewa", 60, 8, "шт", 24, 3));

        for(Product product: myProduct){
            Program.getProductInfo(product);
            System.out.println();
        }
    }
}
