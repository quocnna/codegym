package _02_loop_in_java.practice.p1;

public class PrimeNumber {
    public static void main(String[] args) {
        System.out.println(checkPrimeNumber(97));
    }

    private static boolean checkPrimeNumber(int num) {
        if (num == 1 || num==0)
            return false;
        for (int i = 2; i < num; i++)
            if (num % i == 0)
                return false;
        return true;
    }
}
