public class P8RecPrintNameNtime {
    public static void NnamePr(String nm,int ntm){
        if (ntm==0) {
            return;
        }
        System.out.println(nm);
        NnamePr(nm, ntm-1);        
    }
    public static void main(String args[]){
    NnamePr("Sanket", 10);
    }
}
