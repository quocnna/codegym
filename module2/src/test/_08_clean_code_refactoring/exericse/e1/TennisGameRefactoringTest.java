package _08_clean_code_refactoring.exericse.e1;

import org.junit.Test;

import static org.junit.Assert.*;

public class TennisGameRefactoringTest {

    @Test
    public void getScore() {
      String result = TennisGameRefactoring.getScore("John", "David", 6, 5);
      assertEquals("Advantage John", result);
    }
}