import java.util.Arrays;

public class P13ReverseArray {
    public static int[] rev(int a[]){//T2o Pointer Technique
     int i=0;
     int j=a.length-1;
     while (i<j) {
        int t=a[i];
        a[i]=a[j];
        a[j]=t;
        i++;
        j--;
     }
     return a;
    }
    public static void main(String[] args) {
        int a[]={1,2,3,4,5};
        int b[]={40,30,20,10};
        System.out.println(Arrays.toString(rev(a)));
        System.out.println(Arrays.toString(rev(b)));
    }
}
