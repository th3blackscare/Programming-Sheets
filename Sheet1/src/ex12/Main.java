package ex12;
import java.util.Scanner;
/*
 * Write a Program that Reads ten Integers and
 * displays them in the reverse order in which
 * they were read
 * author : Omar Sharif - Th3BlackScare
 */
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Array to Store numbers
        int[] numbers = new int[10];
        // a loop to take and append numbers to the array
        for (int i = 0; i < numbers.length; i++){
            System.out.print("Enter Number: ");
            // array appending statement
            numbers[i]=input.nextInt();
        }
        // loop to print the numbers in the reverse order
        for(int i = numbers.length-1;i>=0;i--){
            System.out.print(numbers[i]+" ");
        }
    }
}
