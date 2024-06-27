/*O(logn) time complexity*/
public class SearchingElement {
    public static void main(String[] args) {
        int[] arr={12,24,35,47,78};
        int target=47;
        System.out.println(binary(arr,target));
    }
    static int binary(int[] arr,int target){

        int s=0;
        int e=arr.length-1;
        while(s<=e){
            int m=s+(e-s)/2;
            if(arr[m]==target){
                return m;
            }
            else if(arr[m]<target){
                s=m+1;
            }
            else{
                e=m-1;
            }
        }
        return -1;
    }
}
