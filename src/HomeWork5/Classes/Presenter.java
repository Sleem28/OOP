package HomeWork5.Classes;

import HomeWork5.Base.AbstractClasses.AView;
import HomeWork5.Base.Interfaces.ICalcFactory;
import HomeWork5.Base.Interfaces.IRun;

public class Presenter implements IRun {
    AView view;
    ICalcFactory calcFactory;

    public Presenter(AView view, ICalcFactory factory){
        this.view = view;
        this.calcFactory = factory;
    }

    @Override
    public void run() {
        boolean work = true;
        while (work){
            String expr = this.view.getExpression();
            if(expr.equals("exit")) break;
            String result = this.calcFactory.calculate(expr);
            System.out.printf("Результат: %s\n", result);
        }
    }
}
