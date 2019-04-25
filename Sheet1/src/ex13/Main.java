package ex13;
import java.util.Scanner;
/*
 * write a program that reads an unspecified number of
 * scores and determines how many scores are above or
 * equal to the average and how many scores are below
 * the average. Enter a negative number to signify the
 * end of the input. Assume that the maximum numbers
 * of scores is 100.
 * Author : Omar Sharif - Th3BlackScare
 */
public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int[] score = new int[100];
        int grades;
        int count = 0;
        for(int i =0 ; i<score.length;i++){
            System.out.print("Enter The Score: ");
            grades = input.nextInt();
            if(grades<0){
                break;
            }
            score[i]=grades;
            count++;
        }
        double avg=average(score,count);
        double above_avg=above(score,avg);
        System.out.println("Total: "+count);
        System.out.println("average: "+avg);
        System.out.println("Above: "+above_avg);
        System.out.println("Below Average: "+(count-above_avg));
    }
    public static double average(int[] score, int count){
        int sum = 0;
        for(int i = 0; i<score.length;i++){
            sum+= score[i];
        }
        double avg = sum/count;
        return avg;
    }
    public static int above(int[] score,double avg){
        int count = 0;
        for(int i =0;i<score.length;i++){
            if(score[i]>=avg){
                count++;
            }
        }
        return count;
    }
}
