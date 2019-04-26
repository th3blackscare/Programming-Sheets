package ex21;
import java.util.Random;
public class random {
    public static void main(String[] args){
    Random random = new Random(100);
    for(int i = 0 ; i < 50 ; i++){
        System.out.println(random.nextInt(100));
    }
 }
}
