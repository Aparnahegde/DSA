import java.util.*;
public class reverse {
    public static void main(String[] args) {

        System.out.println(reverse1("abscd"));
    }
    public static String reverse1(String s){
        char[] c=s.toCharArray();
        for(int i=0;i<=s.length()/2;i++){
          char t=c[i];
          c[i]=c[c.length-i-1];
            c[c.length-i-1]=t;
        }
        return new String(c);
    }
}
