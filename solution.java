class CircularQueue {

    int[] arr;
    int front = 0;
    int rear = 0;
    int size;

    CircularQueue(int size) {
        this.size = size;
        arr = new int[size];
    }

    void enqueue(int value) {

        if ((rear + 1) % size == front) {
            System.out.println("Queue Full");
            return;
        }

        arr[rear] = value;
        rear = (rear + 1) % size;
    }

    int dequeue() {

        if (front == rear) {
            System.out.println("Queue Empty");
            return -1;
        }

        int removed = arr[front];
        front = (front + 1) % size;

        return removed;
    }

    void display() {

        int i = front;

        while (i != rear) {
            System.out.print(arr[i] + " ");
            i = (i + 1) % size;
        }

        System.out.println();
    }
}

class Main {

    public static void main(String[] args) {

        CircularQueue q = new CircularQueue(5);

        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);

        q.display();

        q.dequeue();

        q.display();

        q.enqueue(4);
        q.enqueue(5);

        q.display();
    }
}
