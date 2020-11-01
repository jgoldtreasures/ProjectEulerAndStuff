public class Largest_palindrome_product {


    public static int findMaxPalindrome(int digit){
        int max = 0;
        StringBuilder top = new StringBuilder();
        for(int i = 1; i <= digit; i++){
            top.append("9");
        }
        int top1 = 999;
        for(int i = (int) Math.pow(10, digit - 1); i <= top1; i++){
            for(int j = i; j <= top1; j++){
                if(i * j >= max && isPalindrome(i * j)){
                    max = i * j;
                }
            }
        }
        return max;
    }

    public static boolean isPalindrome(int num){
        char[] chars = String.valueOf(num).toCharArray();
        for(int i = 0; i < chars.length / 2; i++){
            if(chars[i] != chars[chars.length - i - 1]){
                return false;
            }
        }
        return true;
    }

    public static void main(String args[]){
        System.out.println(findMaxPalindrome(3));
    }
}
