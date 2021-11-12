import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DolarTest {

    @Test
     public void testMultiplication() {
        var five = new Dolar(5);
        five.times(2);
        assertEquals(10, five.amount);

    }
}

class Dolar {
    int amount;
    Dolar(int amount) {
        this.amount = amount;
    }

    void times(int multiplier) {
        this.amount *= multiplier;
    }
}
