public class CircularQueue {
    int arr[];
    int front;
    int rear;
    int size;
    int count;

    CircularQueue(int size) {
        this.size = size;
        arr = new int[size];
        front = 0;
        rear = -1;
        count = 0;
    }

    void enqueue(int val) {
        if (count == size) {
            System.out.println("Queue is full");
            return;
        }
        rear = (rear + 1) % size;
        arr[rear] = val;
        count++;
    }

    int dequeue() {
        if (count == 0) {
            System.out.println("Queue is empty");
            return -1;
        }
        int val = arr[front];
        front = (front + 1) % size;
        count--;
        return val;
    }

    void displayQueue() {
        if (count == 0) {
            System.out.println("Queue is empty");
            return;
        }
        int i = front;
        int c = 0;
        while (c < count) {
            System.out.print(arr[i] + " ");
            i = (i + 1) % size;
            c++;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        CircularQueue q = new CircularQueue(4);

        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        q.enqueue(4);
        q.displayQueue();        
        q.dequeue();             
        q.dequeue();             
        q.displayQueue();        
    }
}