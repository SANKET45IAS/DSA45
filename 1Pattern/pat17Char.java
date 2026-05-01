public class pat17Char {
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++)System.out.print(" ");
            for(int k=0;k<i;k++) {
                System.out.print((char)('A'+k));
                if (k==(i-1)) {
                    for(int s=(i-2);s>=0;s--) System.out.print((char)('A'+s));
                }
            }
            System.out.println();
        }
        
    }
}
