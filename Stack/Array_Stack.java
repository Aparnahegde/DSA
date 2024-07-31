public class Stack{
int[] arr;
  int top;

  public Stack(int size){
   arr=new int[size];
    top=-1;
  }
    public void push(int data){
        if(top==arr.length-1){
          System.out.println("Stack is full");
    }else{
      arr[++top]=data;
    }
      }

  public int pop(){
    if(top==-1){
    System.out.println("Empty stack");
      return -1;
    }
    else{
      return arr[top--];
    }  
  }  
}
