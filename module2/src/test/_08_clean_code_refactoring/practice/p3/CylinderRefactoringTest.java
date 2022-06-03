package _08_clean_code_refactoring.practice.p3;

import org.junit.Test;

import static org.junit.Assert.*;

public class CylinderRefactoringTest {

    @Test
    public void getVolume() {
      double result = Cylinder.getVolume(10, 5);
      assertEquals("12", result);
    }
}