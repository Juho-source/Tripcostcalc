import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TripCostCalcTest {

    @Test
    void calculateCost() {
        TripCostCalc tripCostCalc = new TripCostCalc(100, 5, 1.5);
        assertEquals(7.5, tripCostCalc.calculateCost());

        tripCostCalc = new TripCostCalc(200, 10, 2);
        assertEquals(40, tripCostCalc.calculateCost());

        tripCostCalc = new TripCostCalc(300, 15, 2.5);
        assertEquals(112.5, tripCostCalc.calculateCost());
    }
}