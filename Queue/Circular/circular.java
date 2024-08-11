

    class Queues{
        int[] arr;
        int f=-1,r=-1;
        int size;
        Queues(int size){
            this.size=size;
            arr=new int[size];
        }
        public void enqueue(int data){//O(1)
            if(f==(r+1)%size){
                System.out.println("QUEUE FULL");
            }
            else{
                if(f==-1&& r==-1){
                    f=0;
                    r=0;
                    arr[r]=data;
                }
                else{
                    r=(r+1)%size;
                    arr[r]=data;
                }
            }
        }

        public void dequeue(){//O(1)
            if(f==-1&& r==-1){
                System.out.println("Queue empty");
            }
            else if(f==r){
                System.out.println("Queue empty");
                f=-1;
                r=-1;
            }

            else{
                f=(f+1)%size;
            }
        }
        public void display(){//O(n)
            for(int i=f;i!=r;i=(i+1)%size){
                System.out.print(arr[i]+"\t");
            }
            System.out.println(arr[r]);

        }
    }
    public class circular {
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
            q.enqueue(10);
            q.enqueue(11);
            q.display();
        }
    }


