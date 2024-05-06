//https://leetcode.com/problems/guess-number-higher-or-lower/

public class Solution extends GuessGame {
    public int guessNumber(int n) {
        int s=0;
        int e=n;
        while(s<=e){
            int mid=s+(e-s)/2;
            int g=guess(mid);  //predefined
            if(g==0){      //guessed number =pick
                return mid;
            }
            else if(g<1){  //guessed number<pick
                e=mid-1;
            }
            else{
                s=mid+1;        //guessed number greater than pick
            }
        }
        return e;  
    }
}
