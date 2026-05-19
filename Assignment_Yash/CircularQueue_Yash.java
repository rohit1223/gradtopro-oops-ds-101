
class CircularQueue_Yash{
     private int [] arr;
     private int front;
     private int countNo;
     private int rear;
     private  int size;
     
     public CircularQueue_Yash(int size){
        this.arr =new int[size];
        this.front=0;
        this.rear=-1;
        this.size=size;
        this.countNo=0;

    }
     public void enqueue(int element){
        if(countNo==size){
            System.out.println("Queue is full");
            return;
        }
        rear=(rear+1)%size;
        arr[rear]=element;
        countNo++;
        System.out.println("enqueue :" +element);
    } 
     public int dequeue(){
        if(countNo== 0 ){
            System.out.println("Queue is Empty");
            return -1;
        }
        int RemovedElement=arr[front];
        countNo--;
        System.out.println("dequeue:" + RemovedElement);
        front=(front+1)%size;
        return RemovedElement;
    
    }
     public void Display(){
        int tmp=front;
        for(int i=0; i< countNo;i++){
            System.out.print(+arr[tmp]+" ");
            tmp=(tmp+1)%size;
    }
    System.out.println();
    }
}
class Main{
public static void main(String[] args){
    CircularQueue_Yash myQueue = new CircularQueue_Yash(5);
    
    myQueue.enqueue(20);
    myQueue.enqueue(30);
    myQueue.Display();
    myQueue.enqueue(10);
    myQueue.enqueue(40);
    myQueue.Display();
    myQueue.dequeue();
    myQueue.Display();


}
}