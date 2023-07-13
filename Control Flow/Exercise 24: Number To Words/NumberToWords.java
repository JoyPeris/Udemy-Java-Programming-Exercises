public class NumberToWords {
    // write your code here
    public static void numberToWords(int number){
        if(number<0){
            System.out.println("Invalid Value");

        }else{
            int reversednumber=reverse(number);
            int zeros=getDigitCount(number)- getDigitCount(reversednumber);


            int count=0;
            do{
                count++;
                int lastDigit=reversednumber%10;
                reversednumber=reversednumber/10;
                switch (lastDigit){
                    case 0:
                        System.out.println("Zero");
                        break;
                    case 1:
                        System.out.println("One");
                        break;
                    case 2:
                        System.out.println("Two");
                        break;
                    case 3:
                        System.out.println("Three");
                        break;
                    case 4:
                        System.out.println("Four");
                        break;
                    case 5:
                        System.out.println("Five");
                        break;
                    case 6:
                        System.out.println("Six");
                        break;
                    case 7:
                        System.out.println("Seven");
                        break;
                    case 8:
                        System.out.println("Eight");
                        break;
                    case 9:
                        System.out.println("Nine");
                        break;
                }}while(reversednumber>0);

            while(zeros>0){
                System.out.println("Zero");
                zeros--;
            }
        }

    }



    public static int reverse(int number){

        int sign =1;
        if(number<0){
            sign=-1;
            number=number*sign;
        }
        int reversedDigit=0;

        while(number>0){
            reversedDigit=reversedDigit*10+number%10;
            number=number/10;

        }
        return reversedDigit*sign;


    }

    public static int getDigitCount(int number){
        if (number<0){
            return -1;
        }
        if(number<9){
            return 1;
        }

        int count=0;
        while(number>0){
            count++;
            number=number/10;
        }
        return count;
    }

}