import java.util.*;

public class Main {
    public static void main(String[] args) {
        TreeMap<Character, Integer> res= new TreeMap<>();

        Scanner scanner= new Scanner(System.in);
        System.out.print("Input your string: ");
        String input= scanner.nextLine();

        String[] tmp=  input.toLowerCase().split("");

        int size= tmp.length;
        for (int i = 0; i < size; i++) {
            int count= 1;

            if(res.containsKey(tmp[i].charAt(0)))
                count++;

            res.put(tmp[i].charAt(0) , count);
        }

        System.out.println(res);
    }
}
