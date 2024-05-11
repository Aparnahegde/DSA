//https://leetcode.com/problems/count-negative-numbers-in-a-sorted-matrix/
/* Brute force method
class Solution {
    public int countNegatives(int[][] grid) {
      int count =0;
      for(int i=0;i<grid.length;i++){
        for(int j=0;j<grid[0].length;j++){
            if(grid[i][j]<0){
                count++;
            }
        }
      }  
      return count;
    }
}
*/

class Solution {
    public int countNegatives(int[][] grid) {
      int r=0;
      int count=0;
      int c=grid[0].length-1;
      while(c>=0 && r<grid.length){
        if(grid[r][c]<0){
             count+=(grid.length-r);      //it will add row containing -ve numbers including 
            c--;
        }
        else {
           r++;
        }
      }
        return count;

    }
}
