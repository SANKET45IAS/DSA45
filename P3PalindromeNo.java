public class P3PalindromeNo {
    public static boolean isPalindrome(int x) {
        return x==rev(x);
    }
    public static int rev(int x){
        int res=0;
        while(x>0){
            int digit = x % 10;

            res = res * 10 + digit;
            x /= 10;
        }
        return res;
    }
    public static void main(String[] args) {
        System.out.println(isPalindrome(-121));
        System.out.println(isPalindrome(454));
        System.out.println(isPalindrome(123));
    }
}
