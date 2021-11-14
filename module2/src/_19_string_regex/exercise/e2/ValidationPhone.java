package _19_string_regex.exercise.e2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidationPhone {
    public static void main(String[] args) {
        String regex= "";
        String phone= "";
        Pattern pattern= Pattern.compile(regex);
        Matcher matcher= pattern.matcher(phone);
        System.out.println(phone+ " is "+ matcher.matches());
    }
}
