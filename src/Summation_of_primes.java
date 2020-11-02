import java.util.ArrayList;
import java.util.List;

public class Summation_of_primes {

    public static long findPrimes(int max){
        long sum = 2;
        boolean bool;
        for(int i = 3; i <= max; i +=2){
            bool = true;
            for(int j = 2; j <= Math.sqrt(i); j++){
                if (i % j == 0) {
                    bool = false;
                    break;
                }
            }
            if(bool){
                sum += i;
            }
        }
        return sum;
    }

    public static void main(String[] args){
        System.out.println(findPrimes(2000000));
    }
}
