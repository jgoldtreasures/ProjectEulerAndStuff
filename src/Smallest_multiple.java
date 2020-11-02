import java.util.ArrayList;
import java.util.List;

public class Smallest_multiple {

    public static List<Long> getPrimes(long num){
        List<Long> primes = new ArrayList<>();
        long counter = num;
        while (counter % 2 == 0)
        {
            primes.add((long) 2);
            counter /= 2;
        }

        for (int i = 3; i <= Math.sqrt(counter); i+= 2)
        {
            while (counter % i == 0)
            {
                primes.add((long) i);
                counter /= i;
            }
        }
        if(counter >= 2){
            primes.add(counter);
        }
        System.out.println(primes);
        return primes;
    }

    public static int findMultiple(int n){
        List<Long> primes = new ArrayList<>();
        for(int i = 1; i < n + 1; i++){
            List<Long> primes1 = getPrimes(i);
            List<Long> primes2 = new ArrayList<>(primes);
            int inst = 0;
            for(Long factor: primes1){
                if(primes2.contains(factor)){
                    primes2.remove(factor);
                }else{
                    primes.add(factor);
                }
            }
        }
        int val = 1;
        for(Long num:primes){
            val *= num;
        }
        System.out.println(primes);
        return val;
    }

    public static void main(String args[]){
        System.out.println(findMultiple(20));
    }

}
