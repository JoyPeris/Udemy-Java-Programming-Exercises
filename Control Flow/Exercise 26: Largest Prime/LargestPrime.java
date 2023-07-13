public class LargestPrime {
    // write your code here
    public static int  getLargestPrime(int number){
        if(number<2){
            return -1;
        }
        int largetPrime=2;

        while (largetPrime<number){
            if(number%largetPrime==0){
                number=number/largetPrime;
                largetPrime--;
            }
            largetPrime++;
        }


        return number;
    }
}