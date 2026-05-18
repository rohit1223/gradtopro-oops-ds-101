 class Queue {
    private int[] arr;
    private int size;
    private int front;
    private int rear;
    public Queue(int size) {
        this.arr = new int[size];
        this.size = size;
        this.front = -1;
        this.rear = -1;
    }
    public void enqueue(int element) {
        if (rear == size - 1) {
            System.out.println("Queue is Full.");
            return;
        }

        if (front == -1) {
            front = 0;
        }
        rear++;
        arr[rear] = element;

        System.out.println("Element enqueued: " + element);
    }

    public int dequeue() {

       
        if (front == -1 || front > rear) {
            System.out.println("Queue is Empty.");
            return -1;
        }

        int removedElement = arr[front];
        front++;

        System.out.println("Element dequeued: " + removedElement);

        return removedElement;
    }

    public void displayQueue() {        
        if (front == -1 || front > rear) {
            System.out.println("Queue is Empty.");
            return;
        }

        System.out.print("Queue: ");

        for (int i = front; i <= rear; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();
    }
}
public class Main {
    public static void main(String[] args) {

        Queue myQueue = new Queue(5);

        myQueue.enqueue(10);
        myQueue.enqueue(20);
        myQueue.enqueue(30);

        myQueue.displayQueue();

        myQueue.dequeue();

        myQueue.displayQueue();

        myQueue.enqueue(40);
        myQueue.enqueue(50);

        myQueue.displayQueue();
    }
}
