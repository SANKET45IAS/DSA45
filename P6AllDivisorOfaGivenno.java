import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class P6AllDivisorOfaGivenno {
    public static void main(String[] args) {
        List<Integer> res=new ArrayList<>();
        int n=36;
        // for(int i=1;i<=n/2;i++){
        //     if(n%i==0) res.add(i);
        // }
        // res.add(n);
        // System.out.println(res);
        
        for(int i=1;i*i<=n;i++){
            if(n%i==0){ //Left
                res.add(i);
                if (i!=n/i) { //Right
                    res.add(n/i);
                }
            }
        }
        Collections.sort(res);
        System.out.println(res);
    }
}
