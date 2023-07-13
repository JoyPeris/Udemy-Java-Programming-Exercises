public class NumberPalindrome {
    public static boolean isPalindrome(int number){
        int reverse = 0;
        int absNumber=Math.abs(number);

        while(absNumber>0){
            int lastDigit=absNumber%10;
            absNumber=absNumber/10;
            reverse=reverse*10+lastDigit;
        }

        if(reverse==Math.abs(number)){
            return true;
        }
        return false;
    };

}