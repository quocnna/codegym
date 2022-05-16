package _03_array_and_method.exercise.e1;

import java.util.Arrays;
import java.util.Scanner;

public class RemoveElement1 {
  public static void main(String[] args) {
    int[] a = {10, 4, 5, 6, 7, 8, 6};

    System.out.print("Enter value to remove:");
    Scanner scanner = new Scanner(System.in);
    int value = scanner.nextInt();

    int index = 0;
    for (int i = 0; i < a.length; i++) {
      if (a[i] == value) {
        index = i;
        break;
      }
    }

    for (int i = index; i < a.length - 1; i++) {
      a[i] = a[i + 1];
    }

    // System.out.println(Arrays.toString(a));
    // then last index or create b[] = a[length -1]

    for (int i = 0; i < a.length - 1; i++) {
      System.out.println(a[i]);
    }
  }
}
