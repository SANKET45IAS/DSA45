public class P9Print1ToN {
    //Forwand Recursion 
    static void printNo(int c, int n){
        if (c>n) return;
        System.out.println(c);
        printNo(c+1, n);
    }

    //Backtrack Recursion
    static void printNoBackTrack(int c, int n){
        if (c>n) return;
        printNoBackTrack(c+1, n);
        System.out.println(c);
    }

    public static void main(String[] args) {
        printNo(1, 5);
        printNoBackTrack(1, 5);
    }
}
