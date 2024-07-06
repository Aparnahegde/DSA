/*Majority element means it should be more than 50% then it must be middle element*/ 

import java.util.*;
public class majority {
    public static void main(String[] args) {
        int[] arr={6,3,7,3,3};
        int ans=find(arr);
        System.out.println(ans);
    }

    static int find(int arr[]){
        Arrays.sort(arr);
        return arr[(arr.length-1)/2];
    }
}
