package _02_loop_in_java.practice.p3;

import java.util.Scanner;

public class GreatestCommonDivisor {
    public static void main(String[] args) {
        int a, b;
        Scanner nhap = new Scanner(System.in);
        System.out.println("Enter a: ");
        a = nhap.nextInt();
        System.out.println("Enter b: ");
        b = nhap.nextInt();

        a = Math.abs(a);
        b = Math.abs(b);
        System.out.println(gcd(a, b) > 0 ? "Greatest common divisor is: " + gcd(a, b) : "Nothing");
    }

    private static int gcd(int a, int b) {
        for (int i = a; i > 0; i--) {
            if(a%i==0 && b%i==0)
                return i;
        }
        return -1;

//        int min = Math.min(a,b);
//
//        for (int i = min; i > 0; i--) {
//            if(a%i==0 && b%i==0)
//                return i;
//        }
//        return -1;

        // improvement

        /*int min = Math.min(a, b);
        int max = Math.max(a, b);

        if(max%min==0)
            return min;

        int tmp= min/2;
        for (int i = tmp; i > 0; i--) {
            if(a%tmp== 0 && b%tmp==0)
                return tmp;
        }
        return -1;*/
    }
}
