/*O(n) complexity*/

import java.util.*;

public class duplicate{
    public static void main(String[] args) {
        int[] arr = {2, 5, 2, 4, 2, 3, 5, 4};
        Set<Integer> duplicates = findDuplicates(arr);
        System.out.println(duplicates);
    }

    public static Set<Integer> findDuplicates(int[] arr) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> duplicates = new HashSet<>();

        for (int num : arr) {
            if (!set1.add(num)) {
                duplicates.add(num);
            }
        }

        return duplicates;
    }
}



// TC--O(n2)  SC--O(n)

// import java.util.*;
// public class duplicate {
//     public static void main(String[] args) {
//         int[] arr={2,5,2,4,2,3,5,4};
//        List<Integer> a=new ArrayList<>();

//         for(int j=0;j<arr.length;j++){
//             for(int i=1;i<arr.length-j;i++){
//                 if(arr[i]<arr[i-1]){
//                     int temp=arr[i];
//                     arr[i]=arr[i-1];
//                     arr[i-1]=temp;
//                 }
//             }

//         }
//         for(int i=0;i<arr.length-1;i++){
//             if(arr[i]!=arr[i+1]){
//              a.add(arr[i]);
//             }
//         }
//         System.out.println(a);
//     }
// }
