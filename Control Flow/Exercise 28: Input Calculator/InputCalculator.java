import java.util.Scanner;

public class InputCalculator {
    // Write your code here


    public static void inputThenPrintSumAndAverage(){
        double sum=0;
        double count=0;

        Scanner scanner = new Scanner(System.in);

        while(true){


            try {
                int numberInt=scanner.nextInt();
                sum=sum+numberInt;
                count++;


            } catch(Exception e) {
                double avg= sum/count;

                System.out.println("SUM = "+Math.round(sum)+" AVG = " + Math.round(avg));
                break;
            }



        }
    }
}