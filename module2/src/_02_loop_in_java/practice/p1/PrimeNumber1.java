package _02_loop_in_java.practice.p1;

import java.util.Scanner;

public class PrimeNumber2 {
  public static void main(String[] args) {
    while(true){
      System.out.print("Enter the number:");
      Scanner scanner = new Scanner(System.in);
      int number = scanner.nextInt();

      System.out.print(number + " is ");
      System.out.println(isPrime(number) ? "prime" : "not prime");
    }
  }

  private static boolean isPrime(int num) {
    if (num < 2) {
      return false;
    }

    for (int i = 2; i < num /2; i++) {
      if (num % i == 0) {
        return false;
      }
    }

    return true;
  }
}
