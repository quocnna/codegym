package test;

import com.company.inheritance.Animal;
import com.company.inheritance.Cat;

public class NewTest<T,V, E, Edfdd> {
    private T val;

    public V read(T val, V v){
        System.out.println(val);
        return v;
    }
}

class NewMain{
    public static void main(String[] args){
        NewTest newTest= new NewTest();
        newTest.read(new Cat(1,3));
        newTest.read(new Animal());
        newTest.read(4);
    }
}