package _02_loop_in_java.practice.p2;

import java.util.Scanner;

public class LendingBank {
    public static void main(String[] args) {
        double money;
        int month;
        double interest_rate;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter investment amount: ");
        money = input.nextDouble();
        System.out.println("Enter number of months: ");
        month = input.nextInt();
        System.out.println("Enter annual interest rate in percentage: ");
        interest_rate = input.nextDouble();
        double interest_total= 0;
        for(int i = 0; i < month; i++){
            interest_total = money * (interest_rate/100)/12 * month;
        }

        System.out.println("Total of interset: " + interest_total);

    }
}
