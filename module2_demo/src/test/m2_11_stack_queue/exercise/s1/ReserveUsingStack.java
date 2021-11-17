package test.m2_11_stack_queue.exercise.s1;

import java.util.Arrays;
import java.util.Stack;

public class ReserveUsingStack {
    public static void main(String[] args){
//        int[] arrays= new int[10];
//        arrays[0]=1;
//        arrays[1]=2;
//        arrays[2]=3;
//        arrays[3]=4;
//        arrays[4]=5;

//        for (int i = 0; i < arrays.length; i++) {
//            System.out.println(arrays[i]);
//        }

//        range without last
//        int[] intArray = IntStream.range(1, 11).toArray();
//        range with last
//        int[] intArray = IntStream.rangeClosed(1, 10).toArray()
        Integer[] a= new Integer[3];
        a[0]=1;
        a[1]=2;
        a[2]=4;
//        int[] arr= IntStream.of(1,2,3,4,8,9).toArray();
        System.out.println("Arrays before inserve:");
        Arrays.asList(a).forEach(System.out::println);

        Stack<Integer> stack= new Stack<>();
        Arrays.asList(a).forEach(e->stack.push(e));

        int size= stack.size();
        for (int i = 0; i < size; i++) a[i]= stack.pop();
        System.out.println("Arrays after inserve:");
        Arrays.asList(a).forEach(System.out::println);


        Stack<String> stringStack= new Stack<>();
        String hello= "Hello World";
        Arrays.asList(hello.split("")).forEach(e-> stringStack.push(e));
        StringBuilder stringBuilder= new StringBuilder();
        int sizeStringStack= stringStack.size();
        for (int i = 0; i < sizeStringStack; i++) {
            stringBuilder.append(stringStack.pop());
        }
        hello= stringBuilder.toString();
        System.out.println(hello);

        StringBuilder stringBuilder1= new StringBuilder(hello);
        stringBuilder1.reverse();
        System.out.println(stringBuilder1);

    }

}
