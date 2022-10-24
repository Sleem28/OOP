package HomeWork5.Classes.Binary;

import HomeWork5.Base.AbstractClasses.ABinaryOperation;

public class BinaryDivisionOperation extends ABinaryOperation {

    public BinaryDivisionOperation(double firstOperand, double secondOperand) {
        super(firstOperand, secondOperand);
    }

    @Override
    public double calculate() {
        return this.firstOperand/this.secondOperand;
    }
}
