//https://leetcode.com/problems/valid-perfect-square/

class Solution {
    public boolean isPerfectSquare(int num) {
        int s=0;
        int e=num;
        while(s<=e){
            int mid=s+(e-s)/2;
            if(mid*mid>num){
                e=mid-1;
            }
            else if (mid*mid<num){
                s=mid+1;
            }
            else{
                return true;
            }
        }
        return false;
    }
}
