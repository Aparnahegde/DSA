//https://leetcode.com/problems/find-peak-element/

/*This code will work if the either side of the peak element is sorted */

class Main{
    public static void main(String args[]){
        int[] nums={1,2,3,6,4,3,1};
        int max=findPeakElement(nums);
        System.out.println(max);
        
    }
    
    public  static int findPeakElement(int[] nums) {
        int start=0;
        int end=nums.length-1;
        while(start<end){
            int mid=start+(end-start)/2;
        if(nums[mid]>nums[mid+1]){
            end=mid;
        }
        else{
            start=mid+1;
        }
    }
    return start;
    }

}
