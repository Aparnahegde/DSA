public class TowerOfHanoi {
    public static void main(String[] args) {
        hanoi(3,'A','B','C');
    }
    public static void hanoi(int n,char src,char aux,char dest){
        if(n==1){
            System.out.println(src+ " --> "+dest);
            return;
        }
        hanoi(n-1,src,dest,aux);      // upper disk from a to b
        hanoi(1,src,aux,dest);        //last disk a to c
        hanoi(n-1,aux,src,dest);      //disk which are in b to c
    }
}
