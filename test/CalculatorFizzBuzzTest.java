import org.junit.jupiter.api.Test;

import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorFizzBuzzTest {

    @Test
    void checkFizzBuzz() {
        int number = 15;
        String expected = "fizzBuzz";
        String result = CalculatorFizzBuzz.checkFizzBuzz(number);
        assertEquals(expected, result);
    }
    @Test
    void checkFizz() {
//        Scanner scanner = new Scanner(System.in);
//        int number = scanner.nextInt();
            int number = 3;
            String expected = "fizz";
            String result = CalculatorFizzBuzz.checkFizzBuzz(number);
            assertEquals(expected, result);
    }
    @Test
    void checkBuzz() {
        int number = 5;
        String expected = "buzz";
        String result = CalculatorFizzBuzz.checkFizzBuzz(number);
        assertEquals(expected, result);
    }
    @Test
    public void checkKhac(){
        int number = 23;
        String expected = " hai ba";
        String result = CalculatorFizzBuzz.checkFizzBuzz(number);
        assertEquals(expected, result);
    }
    @Test
    public void checkHas3(){
        int number = 23;
        String expected = "fizz";
        String result = CalculatorFizzBuzz.checkFizzBuzz(number);
        assertEquals(expected, result);
    }
    @Test
    public void checkHas5(){
        int number = 53;
        String expected = "fizzBuzz";
        String result = CalculatorFizzBuzz.checkFizzBuzz(number);
        assertEquals(expected, result);
    }


}