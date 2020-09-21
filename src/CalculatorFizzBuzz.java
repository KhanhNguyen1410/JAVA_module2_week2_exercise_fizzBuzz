public class CalculatorFizzBuzz {
    public static String checkFizzBuzz(int number){

        if (number % 3 == 0 && number % 5 == 0){
            return "fizzBuzz";
        }
        else if (number % 3 == 0){
            return "fizz";
        } else if (number % 5 == 0){
            return "buzz";
        }else
           return readNumber(number);

    }
    public static String readNumber(int number){

        if (number < 100){
            int unit = number % 10;
            String readUnit = "";
            int tens = number / 10;
            String readTens =  "";
            if (unit == 3 || tens ==3 && unit == 5 || tens ==5){
                return "fizzBuzz";
            }
            else if (unit == 3 || tens ==3){
                return "fizz";
            } else if (unit == 5 || tens ==5){
                return "buzz";
            } else {
                switch (unit) {
                    case 0:
                        readUnit = "";
                        break;
                    case 1:
                        readUnit = " mot";
                        break;
                    case 2:
                        readUnit = " hai";
                        break;
                    case 3:
                        readUnit = " ba";
                        break;
                    case 4:
                        readUnit = " bon";
                        break;
                    case 5:
                        readUnit = " nam";
                        break;
                    case 6:
                        readUnit = "sau";
                        break;
                    case 7:
                        readUnit = " bay";
                        break;
                    case 8:
                        readUnit = " tam";
                        break;
                    case 9:
                        readUnit = " chin";
                        break;
                }
                switch (tens) {
                    case 0:
                        readTens = "";
                        break;
                    case 1:
                        readTens = " mot";
                        break;
                    case 2:
                        readTens = " hai";
                        break;
                    case 3:
                        readTens = " ba";
                        break;
                    case 4:
                        readTens = " bon";
                        break;
                    case 5:
                        readTens = " nam";
                        break;
                    case 6:
                        readTens = "sau";
                        break;
                    case 7:
                        readTens = " bay";
                        break;
                    case 8:
                        readTens = " tam";
                        break;
                    case 9:
                        readTens = " chin";
                        break;

                }
                return readTens + readUnit;
            }
        }
        return "";

    }

}
