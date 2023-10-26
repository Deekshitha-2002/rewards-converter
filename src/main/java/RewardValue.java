import java.util.*;
public class RewardValue {
    double cashval;
    int miles;
    public RewardValue(double cashval)
    {
        this.cashval = cashval;
    }
    public RewardValue(int miles)
    {
        this.miles = miles;
    }
    double getCashValue()
    {
        cashval = (double)miles * 0.0035;
        return cashval;
    }
    double getMilesValue()
    {
        miles = (int)(cashval/0.0035);
        return miles;
    }
}

