import java.util.Scanner;
import java.util.Arrays;
public class SortedArray {
    // write code here
    public static int[] getIntegers(int number){
        Scanner scanner = new Scanner(System.in);
        int arr[]=new int[number];

        for(int i =0; i<number;i++){
            arr[i]=scanner.nextInt();
        }
        return arr;
    }

    public static void printArray(int[] arr){
        for(int i=0; i<arr.length; i++){
            System.out.println("Element "+ i  + " contents "+ arr[i]);
        }
    }

    public static int[] sortIntegers(int[] arr){
        Arrays.sort(arr);
        int length=arr.length;
        int[] sortedArray=new int[length];

        for(int i=0;i<arr.length;i++){
            sortedArray[i]=arr[length-1];
            length--;
        }

        return sortedArray;
    }
}