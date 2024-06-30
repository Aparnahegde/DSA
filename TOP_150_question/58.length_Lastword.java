https://leetcode.com/problems/length-of-last-word/
class Solution {
    public int lengthOfLastWord(String s) {
      int l=0;
      s=s.trim();
      for(int i=s.length()-1;i>=0;i--){
        if(s.charAt(i)==' '){
            return l;
        }
        else{
            l++;
        }
      }
      return l;  
    }
}
