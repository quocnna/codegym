package _01_introduction_java.exercise.e3;

import java.util.Scanner;

public class ConvertCurrency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input USD amount:");
        float usd = sc.nextFloat();
        System.out.printf("%f usd= %f vnd",usd,usd*23000);
    }
}
