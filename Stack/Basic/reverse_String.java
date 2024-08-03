import java.util.*;
public class reverse {
    public static void main(String[] args) {
        String str="Java programming";
        Stack<Character> s=new Stack<Character>();
        for(int i=0;i<str.length()-1;i++){
            s.push(str.charAt(i));
        }
        while(!s.isEmpty()){
            System.out.print( s.pop());
        }
    }
}
