public class pat22 {
    public static void main(String[] args) {
        int n = 4, l = 0, r = (2*n)-2, k = 0;

        for (int i = 0; i < (2*n)-1; i++) {
            int cur = 0;

            for (int j = 0; j < (2*n)-1; j++) {

                if (j >= l && j <= r) {
                    System.out.print(n-k + " ");
                    cur = n-k+1;   // fixed here
                } 
                else if (j > r) {
                    System.out.print(cur++ + " ");
                } 
                else {
                    System.out.print(n-j + " ");
                }
            }

            System.out.println();

            // fixed update logic
            if (i < ((2*n)-1)/2) {
                l++;
                r--;
                k++;
            } else {
                l--;
                r++;
                k--;
            }
        }
    }
}