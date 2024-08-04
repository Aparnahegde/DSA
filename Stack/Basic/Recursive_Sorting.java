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

  public void sortStack(){
    if(top==-1){
      return
    }
    int temp=pop();
    sortStack();
    insertCorrect(temp);
  }

  public void insertCorrect(int data){
if(top==-1||arr[top]<=data){
push(data);
}else{
int temp=pop()
insertCorrect(data);
push(temp);
}
  }
  public static void main (String args[]){

  }
}
