https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/

class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        ArrayList<Integer> List=new ArrayList<>();
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

        for(int index=0;index<nums.length;index++){
            if(nums[index]!=index+1){
                List.add(index+1);
            }
        }
        return List;
    }
}
