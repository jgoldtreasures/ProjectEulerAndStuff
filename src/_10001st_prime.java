import java.util.ArrayList;
import java.util.List;

public class _10001st_prime {

    public static List<Integer> findPrimes(int max){
        List<Integer> primes = new ArrayList<>();
        int i = 1;
        while(primes.size() < max){
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
            i+=2;
        }


        return primes;
    }
    public static void main(String[] args){
        System.out.println(findPrimes(10001).get(10000));
    }

    public static void print(String pr){
        System.out.println(pr);
    }
}
