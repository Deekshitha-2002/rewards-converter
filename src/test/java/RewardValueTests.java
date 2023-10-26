import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RewardValueTests {

    @Test
    void create_with_cash_value() {
        double cashValue = 100;
        var rewardValue = new RewardValue(cashValue);
        assertEquals(cashValue, rewardValue.getCashValue());
    }

    @Test
    void create_with_miles_value() {
        int milesValue = 10000;
        var rewardValue = new RewardValue(milesValue);
        assertEquals(milesValue, rewardValue.getMilesValue());
    }

    @Test
    void convert_from_cash_to_miles() {
        double cashval = 10.18;
        var rewardValue = new RewardValue(cashval);
        int milesValue = 2908;
        assertEquals(milesValue, rewardValue.getMilesValue());
//        assert false;
    }

    @Test
    void convert_from_miles_to_cash() {

        int miles = 1000;
        var rewardValue = new RewardValue(miles);
        double cashval = 3.5;
        assertEquals(cashval, rewardValue.getCashValue());
    }
}
