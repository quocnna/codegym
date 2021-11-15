package csv;

import java.util.List;
import java.io.IOException;

public class Test {
    public static void main(String[] args) throws IOException {

        new CSVFileHelper().writeObjectsToCSVFile("employees.csv",
                new Person("Marta", 32, "Assistant"),
                new Person("Jessica", 35, "Actor"));

        List<String> lines = new CSVFileHelper().readLinesFromCSVFile("employees.csv");

//        lines.forEach(System.out::println);

//https://betterprogramming.pub/ways-to-java-string-formatting-d0aecc391cc9
//https://stackoverflow.com/questions/65032050/java-formatting-with-set-amount-of-spaces

        System.out.println("-----------------------------------------------------------------------------");
        System.out.printf("%-20s %25s %30s%n", "Name", "AGE", "TITLE");
//        System.out.println();
        System.out.println("-----------------------------------------------------------------------------");


        for (String s : lines
        ) {
            String[] row = s.split(",");
            System.out.format("%-20s %25s  %30s", row);
            System.out.println();
        }
        System.out.println("-----------------------------------------------------------------------------");
    }
}
