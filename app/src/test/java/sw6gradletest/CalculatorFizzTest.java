package sw6gradletest;

import org.junit.jupiter.api.Test;
import org.assertj.core.api.Assertions;

public class CalculatorFizzTest {
    @Test
    public void testMultiply() {
        CalculatorFizz fizzBuzz = new CalculatorFizz();
        Assertions.assertThat(fizzBuzz.multiply(1, 9)).isEqualTo("Fizz");
        Assertions.assertThat(fizzBuzz.multiply(3, 7)).isEqualTo("FizzBuzz");
        Assertions.assertThat(fizzBuzz.multiply(8, 7)).isEqualTo("Buzz");
        Assertions.assertThat(fizzBuzz.multiply(1, 2)).isEqualTo("2");
        Assertions.assertThat(fizzBuzz.multiply(3, 9)).isEqualTo("Fizz");
        Assertions.assertThat(fizzBuzz.multiply(3, 7)).isEqualTo("FizzBuzz");
        Assertions.assertThat(fizzBuzz.multiply(2, 9)).isEqualTo("Fizz");
        Assertions.assertThat(fizzBuzz.multiply(6, 7)).isEqualTo("2");
        Assertions.assertThat(fizzBuzz.multiply(1, 7)).isEqualTo("Buzz");
        Assertions.assertThat(fizzBuzz.multiply(2, 2)).isEqualTo("4");
        Assertions.assertThat(fizzBuzz.multiply(4, 2)).isEqualTo("8");
    }
}