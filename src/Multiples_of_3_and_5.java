public class Multiples_of_3_and_5 {

    public static int sum(int max){
        int sum = 0;
        for(int i = 0; i < max; i++){
            if (i % 3 == 0 || i % 5 == 0){
//                System.out.println(i);
                sum += i;
            }
        }
        return sum;
    }

    public static void main(String args[]){
        System.out.println(sum(1000));
    }
}
