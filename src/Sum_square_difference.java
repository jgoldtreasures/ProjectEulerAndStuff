public class Sum_square_difference {


    public static int sum_square_difference(int num){
        int sum_square = 0;
        int sum = 0;
        for(int i = 0; i <= num; i++){
            sum_square += (i*i);
            sum += i;
        }
        return (sum * sum) - sum_square;
    }


    public static void main(String args[]){
        System.out.println(sum_square_difference(100));
    }
}
