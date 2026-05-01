public class pat9 {
     public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=(n-i);j++){
                System.out.print(" ");
            }
            for(int t=1;t<=(2*i)-1;t++){ //Math Logic to find Odd
                System.out.print("*");
            }
            System.out.println();
        }
        
        for(int i=n-1;i>=1;i--){
            for(int j=1;j<=(n-i);j++){
                System.out.print(" ");
            }
            for(int t=1;t<=(2*i)-1;t++){ //Math Logic to find Odd
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
 
    