package test.orther;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexTest {
    public static void main(String[] args) {
        Pattern pattern= Pattern.compile("^\\d{2}C?-\\d{3}.\\d{2}$");
        Matcher matcher= pattern.matcher("43C-012.34");
        boolean res= matcher.matches();
        System.out.println(res);
    }
}
