package _08_clean_code_refactoring.practice.p2_split_variable;

public class FizzBuzzRefactoring {
    public static String fizzBuzz(int number){
        boolean isFizz = number % 3 == 0;
        boolean isBuzz = number % 5 == 0;

        if(isFizz && isBuzz)
            return "FizzBuzz";

        if(isFizz)
            return "Fizz";

        if(isBuzz)
            return "Buzz";

        return String.valueOf(number);
    }
}
