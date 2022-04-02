package _03_array_and_method.exercise.e1;

import java.util.Scanner;

public class RemoveElement {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,3,7};

        System.out.print("Input value to remove: ");
        Scanner scanner= new Scanner(System.in);
        int val= scanner.nextInt();
        int[] tmp= remove(a,val);

        for (int i = 0; i < tmp.length; i++) {
            System.out.println(tmp[i]);
        }

//        int length= a.length;
//        int index_del=-1;
//        for (int i = 0; i < length; i++) {
//            if(val== a[i]){
//                index_del= i;
//                break;
//            }
//        }
//
//        if(index_del>=0){
//            for (int i = index_del; i < length-1; i++) {
//                a[i]= a[i+1];
//            }
//        }


//        for (int i = 0; i < length-1; i++) {
//            System.out.println(a[i]);
//        }
    }

    private static int[] remove(int[] arr, int val){
        int length= arr.length;
        int index=-1;
        for (int i = 0; i < length; i++) {
            if(arr[i]==val){
                index= i;
                break;
            }
        }

        if(index>=0){
            return removeByIndex(arr, index);
        }
        return null;
    }

    private static int[] removeByIndex(int[] arr, int index){
        int length= arr.length;
        int[] tmp= new int[length-1];
        for (int i=0 ,j = 0; i < length ; i++) {
            if(i!=index){
                tmp[j]= arr[i];
                j++;
            }
        }
        return tmp;
    }
}
