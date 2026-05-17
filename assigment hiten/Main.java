
public class Main {
    int arr[];
    int front;
    int rear;
    int size;

    Main(int size) {
        this.size = size;
        arr = new int[size];
        front = 0;
        rear = -1;
    }

    void enqueue(int val) {
        if (rear == size - 1) {
            System.out.println("Queue is full");
            return;
        }
        rear = rear + 1;
        arr[rear] = val;
    }

    int dequeue() {
        if (front > rear) {
            System.out.println("Queue is empty");
            return -1;
        }
        int val = arr[front];
        front = front + 1;
        return val;
    }

    void displayQueue() {
        if (front > rear) {
            System.out.println("Queue is empty");
            return;
        }
        for (int i = front; i <= rear; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Main q = new Main(4);

        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);

        q.displayQueue();

        System.out.println(q.dequeue());

        q.displayQueue();
    }
}