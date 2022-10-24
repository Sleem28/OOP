package HomeWork5.Base.AbstractClasses;

import HomeWork5.Base.Interfaces.IComplexAction;
import HomeWork5.Classes.Complex.CNum;

public abstract class AComplexOperation implements IComplexAction {
    protected CNum firstCnum;

    public AComplexOperation(CNum firstCnum, CNum secondCnum) {
        this.firstCnum = firstCnum;
        this.secondCnum = secondCnum;
    }

    protected CNum secondCnum;
}
