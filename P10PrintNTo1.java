public class P10PrintNTo1 {
     //Forwand Recursion 
    static void printNo(int c){
        if (c<1) return;
        System.out.println(c);
        printNo(c-1);
    }

    //Backtrack Recursion
    static void printNoBackTrack(int c){
        if (c<1) return;
        printNoBackTrack(c-1);
        System.out.println(c);
    }

    public static void main(String[] args) {
        printNo(5);
        printNoBackTrack(5);
    }
}
