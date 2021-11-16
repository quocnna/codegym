package _10_dsa_list.exercise.e1;

import java.util.ArrayList;
import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        CustomArrayList<Integer> arrayList= new CustomArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(6);
        arrayList.add(2,23);

        arrayList.remove(2);



        try{
            CustomArrayList<Integer>  dffdf =( CustomArrayList<Integer>) arrayList.clone();
            for (int i = 0; i < dffdf.size(); i++) {
                System.out.println(dffdf.get(i));
            }
        }
        catch (Exception e){
           e.printStackTrace();
        }

//        Arrays.asList(arrayList).forEach(System.out::println);
    }
}
