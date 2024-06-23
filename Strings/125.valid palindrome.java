https://leetcode.com/problems/valid-palindrome/
class Solution {
    public boolean isPalindrome(String s) {
        s=s.toLowerCase().replaceAll("[^A-Za-z0-9]","");
        int start=0;
        int end=s.length()-1;
        if(s==null||s.length()==0){
            return true;
        }
        while(start<=end){
            if(s.charAt(start)!=s.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}
