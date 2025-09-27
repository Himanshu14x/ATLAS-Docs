package PracticeSet.atlaslearnings.day36.Test;

import PracticeSet.JUNITtesting.Calculator;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

import static org.junit.jupiter.api.Assertions.*;



public class CalculatorTest {

    Calculator calc = new Calculator();

    @ParameterizedTest(name="add({0},{1})={2}")
    @CsvSource({
            "1,2,3",
            "5,7,12",
            "-3,3,0",
            "-2,-4,-6"
    })
     void testAdd(int a, int b, int expected){
        assertEquals(expected, calc.add(a,b));
    }

    @Test
    public void testSquarePositiveNumber() {
        Calculator calc = new Calculator();
        int result = calc.square(5);
        assertEquals(25, result);
    }

    @Test
    public void testSquareZero() {
        Calculator calc = new Calculator();
        int result = calc.square(0);
        assertEquals(0, result);
    }

    @Test
    public void testSquareNegativeNumber() {
        Calculator calc = new Calculator();
        int result = calc.square(-3);
        assertEquals(9, result);
    }

    @Test
    public void shouldThrowExceptionForNegativeSquareRoot(){
        Calculator calc = new Calculator();
        assertThrows(IllegalArgumentException.class,()->{
            calc.squareRoot(-4);
        });

    }

    @Test
    public void shouldReturnCorrectSquareRootForPositiveNumber(){
        Calculator calc = new Calculator();
        double result = calc.squareRoot(9);
        assertEquals(3.0, result);
    }

    @Test
    public void testSquareRootZero(){
        assertEquals(0.0, calc.squareRoot(0),0.001);
    }

    @Test
    public void testSquareRootNegative(){
        assertThrows(IllegalArgumentException.class,()->calc.squareRoot(-4));
    }

    @Test
    public void testAdd(){
        assertEquals(10,calc.add(7,3));
    }

    @Test
    public void testAddNegative(){
        assertEquals(-2,calc.add(-5,3));
    }

    @Test
    public void testSubtract() {
        assertEquals(4, calc.subtract(10, 6));
    }

    @Test
    public void testSubtractNegativeResult() {
        assertEquals(-5, calc.subtract(3, 8));
    }

    @Test
    public void testMultiplyPositive() {
        assertEquals(20, calc.multiply(4, 5));
    }

    @Test
    public void testMultiplyWithZero() {
        assertEquals(0, calc.multiply(4, 0));
    }

    @Test
    public void testMultiplyNegative() {
        assertEquals(-12, calc.multiply(-3, 4));
    }

    @Test
    public void testDivideNormal() {
        assertEquals(3, calc.divide(9, 3));
    }

    @Test
    public void testDivideWithNegative() {
        assertEquals(-5, calc.divide(-10, 2));
    }

    @Test
    public void testDivideByZero() {
        assertThrows(ArithmeticException.class, () -> calc.divide(10, 0));
    }

    public static void main(String[] args) {


        Result res = JUnitCore.runClasses(CalculatorTest.class);
        for(Failure fobj : res.getFailures()){
            System.out.println(fobj.toString());
        }
        System.out.println(res.wasSuccessful());
    }

}

