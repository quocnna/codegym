package _08_clean_code_refactoring.practice.p2;

import org.junit.Test;

import static org.junit.Assert.*;

public class FizzBuzzRefactoringTest {

    @Test
    public void fizzBuzz() {
      String result = FizzBuzz.fizzBuzz(30);
      String expected = "FizzBuzz";
      assertEquals(expected, result);
    }
}