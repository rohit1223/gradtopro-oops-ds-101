public class CustomQueue {

    private int[] arr;
    private int size;
    private int frontPosition;
    private int rearPosition;

    // Constructor
    // Create array and set front & rear position
    public CustomQueue(int size) {
        this.arr = new int[size];
        this.size = size;
        this.frontPosition = 0;
        this.rearPosition = -1;
    }

    // Add element in queue
    public void enqueue(int element) {

        if (rearPosition == size - 1) {
            System.out.println("Queue is full.");
            return;
        }

        rearPosition = rearPosition + 1;
        arr[rearPosition] = element;

        System.out.println("Element inserted " + element);
    }

    // Remove element from queue
    public int dequeue() {

        if (frontPosition > rearPosition) {
            System.out.println("Queue is empty.");
            return -1;
        }

        int removedElement = arr[frontPosition];
        frontPosition++;

        System.out.println("Removed element " + removedElement);

        return removedElement;
    }

    // Display queue elements
    public void displayQueue() {

        if (frontPosition > rearPosition) {
            System.out.println("Queue is empty.");
            return;
        }

        for (int i = frontPosition; i <= rearPosition; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println("\n");
    }
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
    }
}
