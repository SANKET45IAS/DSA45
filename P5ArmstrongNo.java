public class P5ArmstrongNo {
    public static boolean ArmS(int n){
        int org = n;
        int deg = (int)Math.log10(n) + 1;
        int res = 0;

        while(n > 0){
            int digit = n % 10;
            res = res + (int)Math.pow(digit, deg);
            n /= 10;
        }

        return res == org;
    }

    public static void main(String[] args) {
        System.out.println(ArmS(153));   // true
        System.out.println(ArmS(371));   // true
        System.out.println(ArmS(123));   // false
    }
}