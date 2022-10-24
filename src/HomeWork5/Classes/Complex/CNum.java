package HomeWork5.Classes.Complex;

import HomeWork5.Base.AbstractClasses.ACNum;

public class CNum extends ACNum {
    private String sExpression;

    public void setsExpression(String sExpression) {
        this.sExpression = sExpression;
    }

    public String getsExpression() {
        return sExpression;
    }
}
