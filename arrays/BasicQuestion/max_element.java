/*find max element in array*/
/* O(n)-TIME COMPLEXITY and O(1)-SPACE COMPLEXITY*/
public class MaxNum {
    public static void main(String[] args){
        int[] arr={4,7,2,9,55,34};
        int max=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println("largest element "+max);
    }
}

/* O(nlogn)-TIME COMPLEXITY and O(1)-SPACE COMPLEXITY*/

/*
import java.util.*;
public class MaxNum {
    public static void main(String[] args){
        int[] arr={4,7,2,9,55,34};
        Arrays.sort(arr);

        System.out.println("largest element "+arr[arr.length-1]);
    }
}
*/


