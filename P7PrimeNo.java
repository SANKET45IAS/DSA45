public class P7PrimeNo {
    public static boolean isPrime(int n){
        int c=0;
        for(int i=1;i<=Math.sqrt(n);i++){
            if (n%i==0) {
                c++;
                if (n%i!=i) {
                    c++;
                }
            }
        }
        return c==2;
    }
    public static void main(String[] args) {
        System.out.println(isPrime(5));
        System.out.println(isPrime(9));
    }
}
