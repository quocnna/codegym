package inheritance;

public class Cat extends Animal implements Comparable<Cat> {

    public Cat(int age, int speed){
        setAge(age);
        setSpeed(speed);
    }
    public void meow(){
        System.out.println("meo meo");
    }

    @Override
    public int compareTo(Cat o) {
//        int tmp= getAge()- o.getAge();
//        return tmp!=0? tmp: getSpeed()- o.getSpeed();
        return getSpeed()- o.getSpeed();
    }

    public static int aaa(Cat c1, Cat c2){
                    int tmp= c1.getAge()- c2.getAge();
            return tmp!=0? tmp: c1.getSpeed()- c2.getSpeed();
    }
}
