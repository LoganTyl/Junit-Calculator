import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void add() {
        //arrange
        Calculator calc = new Calculator(2.3, 10.49);
        double expected = 12.79;
        //act
        double actual = calc.Add();
        //assert
        assertEquals(expected, actual);
    }

    @Test
    void subtract() {
        //arrange
        Calculator calc = new Calculator(33.5, 25.25);
        double expected = 8.25;
        //act
        double actual = calc.Subtract();
        //assert
        assertEquals(expected, actual);
    }

    @Test
    void multiply() {
        //arrange
        Calculator calc = new Calculator(5, 4);
        double expected = 20;
        //act
        double actual = calc.Multiply();
        //assert
        assertEquals(expected, actual);
    }

    @Test
    void divide() {
        //arrange
        Calculator calc = new Calculator(53, 5);
        double expected = 10.6;
        //act
        double actual = calc.Divide();
        //assert
        assertEquals(expected, actual);
    }
}