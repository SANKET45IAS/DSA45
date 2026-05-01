public class pat8 {
    public static void main(String[] args) {
          int n=5;
        for(int i=n;i>=1;i--){
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
