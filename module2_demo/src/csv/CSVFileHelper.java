package csv;

import java.io.BufferedReader;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class CSVFileHelper {
    public void writeObjectsToCSVFile(String path, Person... persons) throws IOException {
        File file= new File("employees.csv");
        if(!file.exists())
            file.createNewFile();
        Path filePath = Paths.get(path);
        try(BufferedWriter buffer =
                    Files.newBufferedWriter(filePath,
                            Charset.defaultCharset(),
                            StandardOpenOption.APPEND)){
            for(Person person:persons){
                buffer.append(person.toCsv());
                buffer.newLine();
            }
        }
    }

    public List<String> readLinesFromCSVFile(String path) throws IOException {
        Path filePath = Paths.get(path);
        List<String> results = new ArrayList<>();

        try(BufferedReader buffer = Files.newBufferedReader(filePath, Charset.defaultCharset())){
            String line = "";
            while((line = buffer.readLine()) != null){
                results.add(line);
            }

        }
        return results;
    }
}
