package ex14;

import java.util.Scanner;

public class main {
    public static void main(String[] args)
    {
        Scanner input = new Scanner (System.in);
        System.out.print(" How many elements ? ");
        int Size = input.nextInt();
        double [] array = new double [Size];
        System.out.print(" The array value ");
        for(int i =0 ; i <array.length; i++)
            array[i]= input.nextInt();
        System.out.println(" Average = "+ average(array));
        System.out.printf(" Average = %.2f \n", average(array));
    }
    public static int average (int [] array)
    {
        int sum=0;
        for(int i =0 ; i <array.length; i++)
            sum+=array[i];
        return sum/array.length;
    }
    public static double average( double [] array)
    {
        double sum =0;
        for(int i =0 ; i <array.length; i++)
            sum+=array[i];
        return sum/array.length;
    }
}
