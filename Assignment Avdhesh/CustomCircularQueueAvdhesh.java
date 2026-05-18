public class CustomCircularQueueAvdhesh {

    private int[] arr;
    private int size;
    private int front;
    private int rear;
    private int count;

    // Constructor
    public CustomCircularQueueAvdhesh(int size) {

        this.arr = new int[size];
        this.size = size;

        this.front = 0;
        this.rear = -1;

        this.count = 0;
    }

    // Add element in circular queue
    public void enqueue(int element) {

        // Check queue full or not
        if (count == size) {
            System.out.println("Queue is full.");
            return;
        }

        // Move rear position in circular way
        rear = (rear + 1) % size;

        arr[rear] = element;

        count++;

        System.out.println("Element inserted " + element);
    }

    // Remove element from circular queue
    public int dequeue() {

        // Check queue empty or not
        if (count == 0) {
            System.out.println("Queue is empty.");
            return -1;
        }

        int removedElement = arr[front];

        // Move front position in circular way
        front = (front + 1) % size;

        count--;

        System.out.println("Removed element " + removedElement);

        return removedElement;
    }

    // Display queue elements
    public void displayQueue() {

        // Check queue empty or not
        if (count == 0) {
            System.out.println("Queue is empty.");
            return;
        }

        int i = front;

        // Print all elements
        for (int j = 0; j < count; j++) {

            System.out.print(arr[i] + " ");

            // Move index circularly
            i = (i + 1) % size;
        }

        System.out.println("\n");
    }
}



class Main {

    public static void main(String[] args) {

        CustomCircularQueueAvdhesh myQueue =
                new CustomCircularQueueAvdhesh(4);

        myQueue.enqueue(1);
        myQueue.enqueue(2);
        myQueue.enqueue(3);
        myQueue.enqueue(4);

        myQueue.displayQueue();

        myQueue.dequeue();
        myQueue.dequeue();

        myQueue.displayQueue();

        myQueue.enqueue(5);
        myQueue.enqueue(6);

        myQueue.displayQueue();
    }
}