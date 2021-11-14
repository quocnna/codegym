package _19_string_regex.exercise.e1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidationClassName {
    public static void main(String[] args) {
        String regex= "";
        String className= "";
        Pattern pattern= Pattern.compile(regex);
        Matcher matcher= pattern.matcher(className);
        System.out.println(className+ " is "+ matcher.matches());
    }
}
