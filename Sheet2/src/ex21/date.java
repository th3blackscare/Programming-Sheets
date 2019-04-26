package ex21;
import java.util.Date;
/*
 * Author = Omar Sharif - Th3BlackScare
 */
public class date {
    public static void main(String[] args){
        long time=1000;
        for(int i = 0 ; i < 8 ; time *= 100 ){
            Date date = new Date(time);
            System.out.println(date.toString());
        }
    }
}
