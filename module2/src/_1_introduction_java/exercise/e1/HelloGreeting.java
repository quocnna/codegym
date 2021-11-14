package _1_introduction_java.exercise.e1;

import java.util.Scanner;

public class HelloGreeting {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = scanner.nextLine();

        System.out.println("Hello: " + name);
    }
}
