public class FirstLastDigitSum {
    // write your code here
    public static int sumFirstAndLastDigit(int number){
        if(number<0){
            return -1;
        }
        int lastDigit=number%10;
        while(number>9){
            number=number/10;
        }
        return number+lastDigit;
    };
}