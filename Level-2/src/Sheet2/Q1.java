package Sheet2;

import java.util.Scanner;

/*
*
*   Author : Omar Sharif
*
*/

public class Q1 {
    // Method to Sort array Values
        public static void InsertationSort(int[] data)
        {
            int key;
            // loop for select values from the array
            for(int i = 1; i <data.length;i++)
            {
                // key= select the value of index [i]
                key = data[i];
                // select the value that is Previous of the key to compare with.
                int j = i -1 ;
                // loop for comparing and sort, change the order of the values.
                while(j >= 0 && key < data[j])
                {
                    data[j+1]=data[j];
                    j--;
                }
                data[j+1]=key;
            }
        }

        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.print("Enter Your Values: ");
            // take values in one line separated by [ , ] as a string
            String in = input.next();

            /*initialize a string array with out an actual size
            * split the values by the [ , ] count the values and but the sum as a size for the array
            * append splitted values to the  array
            */
            String[] value = ( in.split(","));

            /* initialize a second array by the size of the first string array
             * input must be like 14,15,16,13,11 separated by [ , ]
             */
            int[] data = new int[value.length];
            // loop for convert strings to Integer and append it to the second array
            for(int i = 0 ; i < value.length;i++){
                // converting the value of index i from string to Integer
                int j = Integer.parseInt(value[i]);
                data[i] = j;
            }
            InsertationSort(data);
            for(int i = 0 ;i< data.length;i++){
                System.out.print("Value "+(i+1)+": "+data[i]+" ");
            }
        }
}
