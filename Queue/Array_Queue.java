class Queues{
    int[] arr;
    int f=-1,r=-1;
    int size;
    Queues(int size){
        this.size=size;
        arr=new int[size];
    }
    public void enqueue(int data){
        if(r==(size-1)){
            System.out.println("QUEUE FULL");
        }
        else{
            if(f==-1&& r==-1){
                f=0;
                r=0;
                arr[r]=data;
            }
            else{
                r++;
                arr[r]=data;
            }
        }
    }

    public void dequeue(){
        if(f==-1&& r==-1){
            System.out.println("Queue empty");
        }else{
            f++;
        }
    }
    public void display(){
        for(int i=f;i<=r;i++){
            System.out.print(arr[i]+"\t");
        }
    }
}
public class Array_Queue {
    public static void main(String[] args) {
        Queues q=new Queues(4);
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        q.enqueue(4);
        q.display();
        System.out.println();
        q.dequeue();
        q.dequeue();
        q.display();
    }
}
