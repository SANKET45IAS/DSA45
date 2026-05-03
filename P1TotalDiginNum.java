import java.util.Scanner;

public class P1TotalDiginNum {
    public static void main(String[] args) {
        try (Scanner sa = new Scanner(System.in)) {
            System.out.print("Enter a no. to check no. of digits present in it : ");
            int n=sa.nextInt();
            System.out.println();
            System.out.println("No of digits in " +n+ " is "+ (int)(Math.log10(n)+1));
        }
    }
}
