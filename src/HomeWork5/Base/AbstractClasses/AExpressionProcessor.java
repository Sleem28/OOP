package HomeWork5.Base.AbstractClasses;

import HomeWork5.Base.Interfaces.ExpressionHandler;
import HomeWork5.Base.Interfaces.GetCNumValues;
import HomeWork5.Base.Interfaces.GetSigns;
import HomeWork5.Base.Interfaces.GetValues;
import HomeWork5.Classes.Complex.CNum;

import java.util.ArrayList;
import java.util.List;

public abstract class AExpressionProcessor implements GetValues, GetSigns, ExpressionHandler, GetCNumValues {
    protected List<Double> values;
    protected List<String> signs;
    protected List<CNum>   cNums;
    protected String expression;

    public AExpressionProcessor(String expression) {
        this.expression = expression;
        this.values = new ArrayList<>();
        this.signs = new ArrayList<>();
        this.cNums = new ArrayList<>();
    }
}
