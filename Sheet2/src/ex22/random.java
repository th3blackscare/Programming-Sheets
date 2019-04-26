package ex22;
import java.util.Random;
/*
 * Author = Omar Sharif - Th3BlackScare
 */
public class random {
    public static void main(String[] args){
        Random random = new Random(1000);
        for(int i = 0 ; i < 50 ; i++){
            System.out.println(random.nextInt(100));
        }
    }
}
