/*REVERSE ARRAY*/
//O(n)--TC  and O(1)--SC
/*Using merge sort we can optimise it as O(nlogn) but Space complexity will become O(n)*/
import java.util.*;
public class ReverseArray {
    public static void main(String[] args) {
        int[] arr={22,44,55,66,77};
        for(int i=0;i<=arr.length/2;i++){
            int temp=arr[i];
            arr[i]=arr[arr.length-1-i];
            arr[arr.length-1-i] =temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}

/* O(n) Complexity
import java.util.Arrays; 
class GFG { 
    public static void main (String[] args) { 
      String[] arr = {"Hello", "World"}; 
      StringBuilder reversed = new StringBuilder(); 
  
      for (int i = arr.length; i > 0; i--) { 
          reversed.append(arr[i - 1]).append(" "); 
      }; 
        
      String[] reversedArray = reversed.toString().split(" "); 
        
      System.out.println(Arrays.toString(reversedArray));
    } 
}
*/
