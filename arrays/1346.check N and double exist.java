//https://leetcode.com/problems/check-if-n-and-its-double-exist/
class Solution {
    public boolean checkIfExist(int[] arr) {
        for(int i=0;i<arr.length;i++){
            int index=search(arr,arr[i]*2);
            if(index>=0 && i!=index ){          //constraint i!=j
                   return true;
                }
             }
     return false;
    }
    int search(int[] arr,int k){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==k){
                return i;
            }
        }
        return -1;
    }
}


