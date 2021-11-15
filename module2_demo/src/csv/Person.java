package csv;

public class Person {
    String name;
    int age;
    String jobTitle;

    Person(String name, int age, String jobTitle){
        this.name = name;
        this.age = age;
        this.jobTitle = jobTitle;
    }

    String toCsv(){
        return name + "," + age + "," + jobTitle;
    }
}
