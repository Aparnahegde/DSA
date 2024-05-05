//https://leetcode.com/problems/arranging-coins/
//TIME COMPLEXITY O(logN)
class Solution {
    public int arrangeCoins(int n) {
        int s=0;
        int e=n;
        while(s<=e){
            int mid=s+(e-s)/2;
            if(mid*(mid+1)/2==n){
                return mid;
            }
            else if(mid*(mid+1)/2<n){
                s=mid+1;
            }
            else{
                e=mid-1;
            }
        }
        return e;
    }
}

/* FOR THE TIME COMPLEXITY O(1)

class Solution {
    public int arrangeCoins(int n) {
        if(n<=0) return 0;
       int count=1;
       while(n>0){
        n=n-count;

        if(n<0) break;
       
       count++;
    }
     return count-1;
    }
}

   
*/
