import java.util.ArrayList;
import java.util.List;

public class PrimeNumbers {
    static int upTo = 2000000;
    public static List<Integer> findPrimes(int max){
        List<Integer> primes = new ArrayList<>();
        for(int i = 1; i < max; i +=2){
            boolean bool = true;
            for(int j = 2; j < i / 2; j++){
                if (i % j == 0) {
                    bool = false;
                    break;
                }
            }
            if(bool){
                primes.add(i);
            }

        }


        return primes;
    }
    public static void main(String[] args){
        System.out.println(findPrimes(upTo));
    }

    public static void print(String pr){
        System.out.println(pr);
    }
}

