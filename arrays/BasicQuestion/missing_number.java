
/*IF THERE IS ONLY ONE MISSING NUMBER*/
/*O(N)==TC AND O(1)--SC*/
public class Missing_number {
    public static void main(String[] args) {
        int[] arr={1,3,4,5};
       int miss=find(arr);
        System.out.println(miss);
    }
    static int find(int[] arr){
        for(int i=0;i<arr.length;i++){
            if((i+1)!=arr[i]) {
                return i + 1;
            }

        }
        return arr.length-1;
    }
}


/*USING HASH SET    O(n)-- TC and SC*/
import java.util.*;
public class Missing_number{
    public static void main(String args[]){
       int[] arr={1,3,4,5,7};
       findmiss(arr,8);
    }
    static void findmiss(int[] arr,int n) {
        Set<Integer> s = new HashSet<>();
        for (int i = 1; i <= n; i++) {
            s.add(i);
        }

        for (int i = 0; i < arr.length; i++){
            s.remove(arr[i]);
        }
        System.out.println(s);
    }
}
