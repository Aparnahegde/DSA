import java.util.*;
public class Max_num_stack {
    Stack<Integer> s=new Stack<>();
    Stack<Integer> maxStack=new Stack<>();

    public void push(int data){
        int max=data;
        while(!maxStack.isEmpty()&&max<maxStack.peek()){
            max=maxStack.peek();
        }
        s.push(data);
        maxStack.push(max);
    }

    public void pop(){
        s.pop();
        maxStack.pop();
    }

    public int getMax(){
        return maxStack.peek();
    }

    public static void main(String[] args) {
        Max_num_stack m= new Max_num_stack();
        m.push(4);
        m.push(3);
        m.push(9);
        m.push(2);
        m.push(8);
        System.out.println(m.s);
        System.out.println(m.maxStack);
        System.out.println("Max element "+ m.getMax());
        m.pop();
        m.pop();
        m.pop();
        System.out.println(m.s);
        System.out.println(m.maxStack);
        System.out.println("After 3 pop opertion max element "+m.getMax());
    }



}
