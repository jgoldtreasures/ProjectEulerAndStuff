import java.util.ArrayList;
import java.util.List;

public class Even_Fibonacci_numbers {

    public static List<Integer> fib(int numTerms){
        List<Integer> terms = new ArrayList<>();
        terms.add(0, 1);
        terms.add(1, 1);
        int term = terms.get(terms.size()-1) + terms.get(terms.size()-2);
        while(term <= 4000000) {
            terms.add(term);
            term = terms.get(terms.size()-1) + terms.get(terms.size()-2);
        }
        return terms;
    }
    public static int sum(List<Integer> terms){
        int sum = 0;
        for(int term: terms){
            if(term % 2 == 0){
                sum += term;
            }
        }
        return sum;
    }

    public static void main(String args[]){
        System.out.println(sum(fib(1000)));
    }
}
