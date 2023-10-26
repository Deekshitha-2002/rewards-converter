import java.util.*;
public class RewardValue {
    double cashval;
    boolean iscash=false;
    double prevcash;
    boolean ismiles=false;
    int miles;
    public RewardValue(double cashval)
    {
        this.cashval = cashval;
        this.iscash = true;
    }
    public RewardValue(int miles)
    {
        this.miles = miles;
        this.ismiles=true;
    }
    double getCashValue()
    {
        if(this.iscash==false) {
            cashval = (double) miles * 0.0035;
        }
        this.iscash = false;
        return cashval;
    }
    int getMilesValue()
    {
        if(this.ismiles==false) {
            miles = (int)(cashval/ 0.0035);
        }
        this.ismiles=false;
        return miles;
    }
}

