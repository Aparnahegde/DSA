https://leetcode.com/problems/valid-anagram/
class Solution {
    public boolean isAnagram(String s, String t) {
        char[] c1=s.toCharArray();
        char[] c2=t.toCharArray();
     Arrays.sort(c1);
     Arrays.sort(c2);
    //   if(c1==c2){
    //     return true;
    //   }
    //   else{
    //     return false;
    //   }
return Arrays.equals(c1,c2);
    }
}
