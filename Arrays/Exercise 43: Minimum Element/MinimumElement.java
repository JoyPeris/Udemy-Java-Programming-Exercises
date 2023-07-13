import java.util.Scanner;
public class MinimumElement {
    // write code here
    private static int readInteger(){
        Scanner scanner=new Scanner(System.in);
        int element=scanner.nextInt();
        return element;

    }
    private static int[] readElements(int number){
        Scanner scanner = new Scanner(System.in);
        int arr[]=new int[number];
        for(int i=0;i<number;i++){
            arr[i]=scanner.nextInt();
        }
        return arr;
    }
    private static int findMin(int[] arr){
        int min=arr[0];

        for(int i=1; i<arr.length; i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }

        return min;
    }

}