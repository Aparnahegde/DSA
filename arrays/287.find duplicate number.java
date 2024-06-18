https://leetcode.com/problems/find-the-duplicate-number/

class Solution {
    public int findDuplicate(int[] nums) {
       
        int i=0;
        while(i<nums.length){
            int c=nums[i]-1;
            if(nums[i]!=nums[c]){
                int temp=nums[i];
                nums[i]=nums[c];
                nums[c]=temp;
            }
            else{
                i++;
            }
        }
        int dup=-1;
        for(int index=0;index<nums.length;index++){
            
            if(nums[index]!=index+1){
              dup=nums[index];
            }
        }
        return dup;       
    }
}
