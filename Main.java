class CustomQueue {

    int[] arr;
    int front;
    int rear;
    int size;

    // Constructor
    CustomQueue(int size) {

        arr = new int[size];
        this.size = size;

        front = 0;
        rear = -1;
    }

    // Enqueue -> Add Element
    void enqueue(int element) {

        // Queue Full Check
        if(rear == size - 1) {
            System.out.println("Queue Full");
            return;
        }

        rear++;

        arr[rear] = element;

        System.out.println(element + " inserted");
    }

    // Dequeue -> Remove Element
    int dequeue() {

        // Queue Empty Check
        if(front > rear) {
            System.out.println("Queue Empty");
            return -1;
        }

        int removedElement = arr[front];

        front++;

        System.out.println(removedElement + " removed");

        return removedElement;
    }

    // Display Queue
    void displayQueue() {

        if(front > rear) {
            System.out.println("Queue Empty");
            return;
        }

        System.out.print("Queue: ");

        for(int i = front; i <= rear; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();
    }
}

class Main {

    public static void main(String[] args) {

        CustomQueue q = new CustomQueue(4);

        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);

        q.displayQueue();

        q.dequeue();

        q.displayQueue();

        q.enqueue(4);

        q.displayQueue();
    }
}
