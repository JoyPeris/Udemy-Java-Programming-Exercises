public class LastDigitChecker {
    // write your code here

    public static boolean hasSameLastDigit(int firstNum, int secondNum, int thirdNum){

        if(isValid(firstNum)&&isValid(secondNum)&&isValid(thirdNum)){

            return firstNum%10==secondNum%10||secondNum%10==thirdNum%10||thirdNum%10==firstNum%10;

        }
        return false;
    }

    public static boolean isValid(int number){
        return number>=10&&number<=1000;
    }
}