public class SharedDigit {
    // write your code here
    public static boolean hasSharedDigit(int firstNum, int secondNum){

        if(firstNum>=10&&firstNum<=99&&secondNum>=10&&secondNum<=99){

            if(firstNum%10==secondNum%10 || firstNum%10==secondNum/10){
                return true;
            }
            if(firstNum/10==secondNum%10 || firstNum/10==secondNum/10){
                return true;
            }
        }
        return false;
    }
}