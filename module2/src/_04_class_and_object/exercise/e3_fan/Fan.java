package _04_class_and_object.exercise.e3_fan;

public class Fan {
    private final int SLOW= 1;
    private final int MEDIUM=2;
    private final int FAST=3;
    private int speed = SLOW;
    private boolean isOn= false;
    private double radius= 5;
    private String color= "blue";

    public void setMaxSpeed(){
        speed = FAST;
    }
    public void setMediumSpeed(){
        this.speed = this.MEDIUM;
    }

    public boolean isOn() {
        return isOn;
    }

    public void setOn(boolean on) {
        isOn = on;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return this.isOn? String.format("Speed: %d, Color: %s, Radius: %.1f. Fan is On",speed,color,radius):String.format("Color: %s, Radius: %.1f. Fan is Off",color,radius);
    }

    public static void main(String[] args) {
        Fan f1 = new Fan();
        f1.setMaxSpeed();
        f1.setRadius(10);
        f1.setColor("yellow");
        f1.setOn(true);

        Fan f2= new Fan();
        f2.setMediumSpeed();
        f2.setRadius(5);

        System.out.println("Fan1: "+ f1);
        System.out.println("Fan2 "+ f2);
    }
}

