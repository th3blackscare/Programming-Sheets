/*
 * By Fatima Ibrahim.
 */
package ex23;

import java.util.Scanner;

public class TriangleTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner input = new Scanner (System.in);
        double []side = new double[3];
        for (int i=0; i<side.length; i++)
            side [i] = input.nextDouble();
        String color = input.next();
        boolean filled = input.nextBoolean();
        triangle t1= new triangle(side[0],side[1],side[2]);
        System.out.println(t1.getarea()+t1.getper());
    }
}