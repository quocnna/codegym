package test.number_to_letter;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        System.out.print("Input a number:");
        int num = new Scanner(System.in).nextInt();
        String display = "";

        if(num >= 0 && num <= 10){
            display= oneDigitToNumber(num);
            System.out.println(display);
        }
        else if(num > 10 && num < 100){
            System.out.println(twoDigitToNumber(num));
        }
        else{
            System.out.println(threeDigitToNumber(num));
        }

/*        //region one letter
        if (num > 0 && num < 10) {
            switch (num) {
                case 1:
                    display = "One";
                    break;
                case 2:
                    display = "Two";
                    break;
                case 3:
                    display = "Three";
                    break;
                case 4:
                    display = "Four";
                    break;
                case 5:
                    display = "Five";
                    break;
                case 6:
                    display = "Six";
                    break;
                case 7:
                    display = "Seven";
                    break;
                case 8:
                    display = "Eight";
                    break;
                case 9:
                    display = "Nine";
                    break;
                case 10:
                    display = "Ten";
                    break;
            }

        }
        //endregion
        // region two letter
        else if (num < 20) {
            switch (num) {
                case 11:
                    display = "Eleven";
                    break;
                case 12:
                    display = "Twelve";
                    break;
                case 13:
                    display = "Thirteen";
                    break;
                case 14:
                    display = "Fourteen";
                    break;
                case 15:
                    display = "Fifteen";
                    break;
                case 16:
                    display = "Sixteen";
                    break;
                case 17:
                    display = "Seventeen";
                    break;
                case 18:
                    display = "Eighteen";
                    break;
                case 19:
                    display = "Nineteen";
                    break;
            }
        } else if (num < 100) {
            int tens = num / 10;
            int ones = num % 10;
            switch (tens) {
                case 2:
                    display = "Twenty";
                    break;
                case 3:
                    display = "Thirty";
                    break;
                case 4:
                    display = "Fourty";
                    break;
                case 5:
                    display = "Fifty";
                    break;
                case 6:
                    display = "Sixty";
                    break;
                case 7:
                    display = "Seventy";
                    break;
                case 8:
                    display = "Eighty";
                    break;
                case 9:
                    display = "Ninety";
                    break;
            }

            switch (ones) {
                case 1:
                    display += " One";
                    break;
                case 2:
                    display += " Two";
                    break;
                case 3:
                    display += " Three";
                    break;
                case 4:
                    display += " Four";
                    break;
                case 5:
                    display += " Five";
                    break;
                case 6:
                    display += " Six";
                    break;
                case 7:
                    display += " Seven";
                    break;
                case 8:
                    display += " Eight";
                    break;
                case 9:
                    display += " Nine";
                    break;

            }
        }
        //endregion
        //region three letter
        else if (num < 1000) {
            int hundreds = num / 100;
            int spec = num % 100;
            int tens = (num - (hundreds * 100)) / 10;
            int ones = (num - (hundreds * 100) - (tens * 10));

            switch (hundreds) {
                case 1:
                    display = "One hundred";
                    break;
                case 2:
                    display = "Two hundred";
                    break;
                case 3:
                    display = "Three hundred";
                    break;
                case 4:
                    display = "Four hundred";
                    break;
                case 5:
                    display = "Fine hundred";
                    break;
                case 6:
                    display = "Six hundred";
                    break;
                case 7:
                    display = "Seven hundred";
                    break;
                case 8:
                    display = "Eight hundred";
                    break;
                case 9:
                    display = "Nine hundred";
                    break;

            }
            switch (tens) {
                case 1:
                    switch (spec) {
                        case 11:
                            display += " and eleven";
                            break;
                        case 12:
                            display += " and twelve";
                            break;
                        case 13:
                            display += " and thirteen";
                            break;
                        case 14:
                            display += " and fourteen";
                            break;
                        case 15:
                            display += " and fifteen";
                            break;
                        case 16:
                            display += " and sixteen";
                            break;
                        case 17:
                            display += " and seventeen";
                            break;
                        case 18:
                            display += " and eighteen";
                            break;
                        case 19:
                            display += " and  nineteen";
                            break;
                    }
                    break;
                case 2:
                    display += " and twenty";
                    break;
                case 3:
                    display += " and thirty";
                    break;
                case 4:
                    display += " and fourty";
                    break;
                case 5:
                    display += " and fifty";
                    break;
                case 6:
                    display += " and sixty";
                    break;
                case 7:
                    display += " and seventy";
                    break;
                case 8:
                    display += " and eighty";
                    break;
                case 9:
                    display += " and ninety";
                    break;
            }
            if (tens > 1) {
                switch (ones) {
                    case 1:
                        display += " one";
                        break;
                    case 2:
                        display += " two";
                        break;
                    case 3:
                        display += " three";
                        break;
                    case 4:
                        display += " four";
                        break;
                    case 5:
                        display += " five";
                        break;
                    case 6:
                        display += " six";
                        break;
                    case 7:
                        display += " seven";
                        break;
                    case 8:
                        display += " eight";
                        break;
                    case 9:
                        display += " nine";
                        break;
                }
            }
        }
        //endregion*/

        System.out.println(display);
    }

    private static String oneDigitToNumber(int num) {
        switch (num) {
            case 1:
                return "One";
            case 2:
                return "Two";
            case 3:
                return "Three";
            case 4:
                return "Four";
            case 5:
                return "Five";
            case 6:
                return "Six";
            case 7:
                return "Seven";
            case 8:
                return "Eight";
            case 9:
                return "Nine";
            case 10:
                return "Ten";
        }

        return "Zero";
    }

    private static String twoDigitToNumber(int num) {
        String display= "";

        if(num < 20){
            switch(num){
                case 11:
                    return "Eleven";
                case 12:
                    return "Twelve";
                case 13:
                    return "Thirteen";
                case 14:
                    return "Fourteen";
                case 15:
                    return "Fifteen";
                case 16:
                    return "Sixteen";
                case 17:
                    return "Seventeen";
                case 18:
                    return "Eighteen";
                case 19:
                    return "Nineteen";
            }
        }
        else {
            int tens = num / 10;
            int ones = num % 10;
            switch (tens) {
                case 2:
                    display = "Twenty";
                    break;
                case 3:
                    display = "Thirty";
                    break;
                case 4:
                    display = "Fourty";
                    break;
                case 5:
                    display = "Fifty";
                    break;
                case 6:
                    display = "Sixty";
                    break;
                case 7:
                    display = "Seventy";
                    break;
                case 8:
                    display = "Eighty";
                    break;
                case 9:
                    display = "Ninety";
                    break;
            }

            switch (ones) {
                case 1:
                    display += " One";
                    break;
                case 2:
                    display += " Two";
                    break;
                case 3:
                    display += " Three";
                    break;
                case 4:
                    display += " Four";
                    break;
                case 5:
                    display += " Five";
                    break;
                case 6:
                    display += " Six";
                    break;
                case 7:
                    display += " Seven";
                    break;
                case 8:
                    display += " Eight";
                    break;
                case 9:
                    display += " Nine";
                    break;
            }
        }

        return display;
    }

    private static String threeDigitToNumber(int num) {
        String display = "";

        int hundreds= num / 100;
        int tens= num - (hundreds * 100);
        switch(hundreds){
            case 1:
                display = "One hundred";
                break;
            case 2:
                display = "Two hundred";
                break;
            case 3:
                display = "Three hundred";
                break;
            case 4:
                display = "Four hundred";
                break;
            case 5:
                display = "Fine hundred";
                break;
            case 6:
                display = "Six hundred";
                break;
            case 7:
                display = "Seven hundred";
                break;
            case 8:
                display = "Eight hundred";
                break;
            case 9:
                display = "Nine hundred";
                break;
        }
        display += " and " + twoDigitToNumber(tens);
        return display;
    }
}
