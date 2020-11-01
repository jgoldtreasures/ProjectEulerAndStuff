import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Largest_prime_factor {

    public static Set<Long> getPrimes(long num){
        Set<Long> primes = new HashSet<>();
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
        return primes;
    }

    public static void main(String args[]){
        System.out.println(Collections.max(getPrimes(600851475143L)));
    }
}
