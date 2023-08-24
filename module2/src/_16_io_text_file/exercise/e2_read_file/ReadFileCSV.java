package _16_io_text_file.exercise.e2_read_file;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFileCSV {
    private static final String path="src\\_16_io_text_file\\exercise\\e2_read_file\\test.csv";
    public static void main(String[] args) {
        try {
            readCSV(path);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    private static void readCSV(String source) throws IOException {
        BufferedReader bf= new BufferedReader(new FileReader(path));
        String line="";
        while ((line=bf.readLine())!=null){
            String[] country = line.split(",");
            System.out.println("Country [code= " + country[4] + " , name=" + country[5] + "]");
        }
    }
}
