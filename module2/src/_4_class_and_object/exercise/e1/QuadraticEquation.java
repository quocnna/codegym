package _4_class_and_object.exercise.e1;

import java.util.Scanner;

public class QuadraticEquation {
    private double a;
    private double b;
    private double c;
    private double delta;

    QuadraticEquation(double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
        this.delta = Math.pow(b,2) - (4*a*c);
    }

    double getDiscriminant(){
        return delta;
    }

    double getRoot1() {
        return (-b + Math.sqrt(delta))/2* a;
    }
    double getRoot2() {
        return (-b - Math.sqrt(delta))/2* a;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input a:");
        double a = sc.nextDouble();
        System.out.println("Input b:");
        double b = sc.nextDouble();
        System.out.println("Input c:");
        double c = sc.nextDouble();

        QuadraticEquation q = new QuadraticEquation(a,b,c);
        double delta= q.getDiscriminant();

        if(delta>0)
            System.out.printf("x1 = %.2f, x2 = %.2f", q.getRoot1(), q.getRoot2());
        else if(delta==0)
            System.out.printf("x= "+q.getRoot1());
        else
            System.out.println("The equation has no roots");
    }
}
