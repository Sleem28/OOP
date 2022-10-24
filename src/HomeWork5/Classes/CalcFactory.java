package HomeWork5.Classes;

import HomeWork5.Base.AbstractClasses.AExpressionProcessor;
import HomeWork5.Base.Interfaces.ICalcFactory;
import HomeWork5.Classes.Binary.BinaryDivisionOperation;
import HomeWork5.Classes.Binary.BinaryMultiplicationOperation;
import HomeWork5.Classes.Binary.BinarySubtractionOperation;
import HomeWork5.Classes.Binary.BinarySumOperation;
import HomeWork5.Classes.Complex.CNum;
import HomeWork5.Classes.Complex.ComplexMultiplicationOperation;
import HomeWork5.Classes.Complex.ComplexSubstractionOperation;
import HomeWork5.Classes.Complex.ComplexSumOperation;

import java.util.List;

public class CalcFactory implements ICalcFactory {


    @Override
    public String calculate(String expression) {
        AExpressionProcessor ep = new ExpressionProcessor(expression);
        ep.expressionHandler();
        List<CNum> cNums = ep.getCNumValues();
        List<Double> values = ep.getValues();
        List<String> signs = ep.getSigns();

        if (expression.contains("i")) {
            CNum tmp = null;
            for (int i = 0; i < cNums.size() - 1; i++) {
                switch (signs.get(i)) {
                    case ("+") -> {
                        if (i == 0)
                            tmp = new ComplexSumOperation(cNums.get(i), cNums.get(i + 1)).calculate();
                        else
                            tmp = new ComplexSumOperation(tmp, cNums.get(i + 1)).calculate();
                    }
                    case ("-") -> {
                        if (i == 0)
                            tmp = new ComplexSubstractionOperation(cNums.get(i), cNums.get(i + 1)).calculate();
                        else
                            tmp = new ComplexSubstractionOperation(tmp, cNums.get(i + 1)).calculate();
                    }
                    case ("*") -> {
                        if (i == 0)
                            tmp = new ComplexMultiplicationOperation(cNums.get(i), cNums.get(i + 1)).calculate();
                        else
                            tmp = new ComplexMultiplicationOperation(tmp, cNums.get(i + 1)).calculate();
                    }
                }
            }
            assert tmp != null;
            return tmp.getsExpression();
        } else {
            double tmp = 0;
            for (int i = 0; i < values.size() - 1; i++) {
                switch (signs.get(i)) {
                    case ("+") -> {
                        if (i == 0)
                            tmp = new BinarySumOperation(values.get(i), values.get(i + 1)).calculate();
                        else
                            tmp = new BinarySumOperation(tmp, values.get(i + 1)).calculate();
                    }
                    case ("-") -> {
                        if (i == 0)
                            tmp = new BinarySubtractionOperation(values.get(i), values.get(i + 1)).calculate();
                        else
                            tmp = new BinarySubtractionOperation(tmp, values.get(i + 1)).calculate();
                    }
                    case ("*") -> {
                        if (i == 0)
                            tmp = new BinaryMultiplicationOperation(values.get(i), values.get(i + 1)).calculate();
                        else
                            tmp = new BinaryMultiplicationOperation(tmp, values.get(i + 1)).calculate();
                    }
                    case ("/") -> {
                        if (i == 0)
                            tmp = new BinaryDivisionOperation(values.get(i), values.get(i + 1)).calculate();
                        else
                            tmp = new BinaryDivisionOperation(tmp, values.get(i + 1)).calculate();
                    }
                }
            }
            return Double.toString(tmp);
        }
    }
}
