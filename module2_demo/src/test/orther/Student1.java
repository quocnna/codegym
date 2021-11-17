package test.orther;

import java.util.Arrays;

public class Student1 {
    private String name ="Quoc";
    private String classes = "A08";

    protected void setName(String name){
        this.name= name;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }

    @Override
    public String toString() {
        return "Student1{" +
                "name='" + name + '\'' +
                ", classes='" + classes + '\'' +
                '}';
    }
}

class TestStudent1{
    public static void main(String[] args) {
        int[] arr= {3,9,4,2,8,6};
        System.out.println("Before: ");
        System.out.println(Arrays.toString(arr));
        System.out.println("After: ");
//        selectionSort(arr);
        insertSort(arr);

//        bubbleSort(arr);
//        Student1 student1= new Student1();
//        System.out.println(student1);
//
//        student1.setName("Huy");
//        student1.setClasses("C04");
//        System.out.println(student1);

    }

    private static void insertSort(int[] arr){
        int length= arr.length;
        for (int i = 1; i < length; i++) {
            int tmp= arr[i];
            int pos= i-1;

            while (pos>=0 && arr[pos]> tmp){
                arr[pos+1]= arr[pos];
                pos--;
            }

            arr[pos+1]= tmp;

            System.out.println(Arrays.toString(arr));
        }


//        int length = arr.length;
//        for (int i = 1; i < length; i++) {
//            int tmp = arr[i];
//            int pos = i - 1;
//
//            while (pos >= 0 && arr[pos] > tmp) {
//                arr[pos + 1] = arr[pos];
//                pos--;
//            }
//
//            arr[pos + 1] = tmp;
//        }
    }

    private static void selectionSort(int[] arr){
        int length= arr.length;

        for (int i = 0; i < length; i++) {
            int min_pos=i;

            for (int j = i; j < length; j++) {
                if(arr[min_pos]> arr[j]) min_pos= j;
            }

            if(min_pos!= i){
                int tmp= arr[min_pos];
                arr[min_pos]= arr[i];
                arr[i]= tmp;
            }

            System.out.println(Arrays.toString(arr));
        }



        //        int length = arr.length;
//        for (int i = 0; i < length; i++) {
//            int min_pos = i;
//            for (int j = i; j < length; j++) {
//                if (arr[min_pos] > arr[j])
//                    min_pos = j;
//            }
//
//            if (min_pos != i) {
//                int tmp = arr[min_pos];
//                arr[min_pos] = arr[i];
//                arr[i] = tmp;
//            }
//
//            System.out.printf("Loop %d: ", i + 1);
//            display(arr);
//            System.out.println();
//        }
    }

    private static void bubbleSort(int[] arr){
        int length= arr.length;

        for (int i = 0; i < length; i++) {
            boolean isSorted= true;
            for (int j = 0; j < length -i-1; j++) {
                if(arr[j]> arr[j+1]){
                    isSorted= false;
                    int tmp= arr[j];
                    arr[j]= arr[j+1];
                    arr[j+1]= tmp;

                }
            }
            if(isSorted)
                break;
            System.out.println(Arrays.toString(arr));
        }




        //        for (int i = 0; i < length; i++) {
//            boolean isSorted = true;
//
//            for (int j = 0; j < length - i - 1; j++) {
//                if (arr[j] > arr[j + 1]) {
//                    isSorted = false;
//                    int tmp = arr[j];
//                    arr[j] = arr[j + 1];
//                    arr[j + 1] = tmp;
//                }
//            }
//
//            if (isSorted) break;
//
//            System.out.printf("Loop %d: ", i + 1);
//            display(arr);
//            System.out.println();
    }
}
