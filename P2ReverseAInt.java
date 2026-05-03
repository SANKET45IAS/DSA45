class P2ReverseAInt {
    public static int reverse(int x) {
    if(x<0){
        x=x*(-1);
        int res=actualrev(x)*(-1);
        return res;
    }
    return actualrev(x);
    }
    public static int actualrev(int x){
       int rev = 0;

        while (x > 0) {
            int digit = x % 10;

            if (rev > Integer.MAX_VALUE / 10 || 
               (rev == Integer.MAX_VALUE / 10 && digit > 7)) {
                return 0;
            }

            rev = rev * 10 + digit;
            x /= 10;
        }
        return rev;
    }

    public static void main(String[] args) {
        // int n = 1234;
        int n=-123;
        System.out.println(reverse(n));
    }
}