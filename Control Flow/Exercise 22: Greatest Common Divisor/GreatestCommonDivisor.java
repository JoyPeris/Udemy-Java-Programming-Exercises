public class GreatestCommonDivisor {
    // write your code here
    public static int getGreatestCommonDivisor(int first, int second){
        if(first<10||second<10){
            return -1;
        }
        int divisor=1;
        int gdc=1;
        while(divisor<=first&&divisor<=second){
            if(first%divisor==0&&second%divisor==0){
                gdc=divisor;
            }
            divisor++;

        }
        return gdc;}
}

