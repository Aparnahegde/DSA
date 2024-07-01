Input 1:
    A = "the sky is blue"
Output 1:
    "blue is sky the"

      public class Solution {
    public String solve(String A) {

        String[] w=A.trim().split(" ");
        int left=0;
        int right=w.length-1;
        
        while(left<right){
        String temp=w[left];
        w[left]=w[right];
        w[right]=temp;
        
        left++;
        right--;
            
        }
        String reversed=String.join(" ",w);
       return reversed; 
    }
}


      
      
