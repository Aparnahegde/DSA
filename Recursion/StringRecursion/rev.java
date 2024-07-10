public class revString {
    public static void main(String[] args) {
        String s="dfhf";
        String r="";
       String re= reverse(s,r,s.length()-1);
        System.out.println(re);
    }

    public static String reverse(String s,String r,int i) {
        if(i<0){
            return r;
        }
        return reverse(s,r+s.charAt(i),i-1);
    }
}
