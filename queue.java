public class CustomQueue {

    private int[] arr;
    private int size;

    
    private int front;
    private int rear;



    public CustomQueue(int size) {

        this.arr = new int[size];
        this.size = size;

        this.front = -1;
        this.rear = -1;
    }



    
    public void enqueue(int element) {

       
        if (rear == size - 1) {
            System.out.println("Queue Full, cant add more");
            return;
        }

        
        if (front == -1) {
            front = 0;
        }

        
        rear = rear + 1;

        
        arr[rear] = element;

        System.out.println("Element added " + element);
    };



    

    public int dequeue() {


      

        if (front == -1 || front > rear) {

            System.out.println("Queue is empty.");
            return -1;

        }

        
        int removedItem = arr[front];


        

        front++;


        System.out.println("Removed Element " + removedItem);

        return removedItem;
    };





   
    public void displayQueue() {

     
        if (front == -1 || front > rear) {

            System.out.println("Queue is empty.");
            return;

        }

        

        for (int i = front; i <= rear; i++) {
            System.out.println(arr[i] + " ");
        }


        System.out.println("\n");
    };


}





class Main {


    public static void main(String[] args) {


        CustomQueue myQueue = new CustomQueue(4);

        myQueue.enqueue(1);
        myQueue.enqueue(2);

        myQueue.enqueue(3);

        myQueue.displayQueue();


        myQueue.dequeue();

        myQueue.displayQueue();

        myQueue.enqueue(4);


        myQueue.displayQueue();



        // Queue Output:

        // [2,3,4]


      

    }

}
