package inheritance;

public class Animal {
    private int age;
    private int speed;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void eat(){
        System.out.println("animal eat");
    }

    @Override
    public String toString() {
        return "Animal{" +
                "age=" + age + ", spped=" + speed+
                '}';
    }
}
