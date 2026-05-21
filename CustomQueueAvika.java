class CustomQueueAvika {

    int[] arr;
    int front = 0;
    int rear = -1;
    int size;

    CustomQueueAvika(int size) {
        this.size = size;
        arr = new int[size];
    }

    void enqueue(int value) {

        if (rear == size - 1) {
            System.out.println("Queue Full");
            return;
        }

        rear++;
        arr[rear] = value;
    }

    int dequeue() {

        if (front > rear) {
            System.out.println("Queue Empty");
            return -1;
        }

        int removed = arr[front];
        front++;

        return removed;
    }

    void display() {

        for (int i = front; i <= rear; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();
    }
}

class Main {

    public static void main(String[] args) {

        CustomQueueAvika q = new CustomQueueAvika(4);

        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);

        q.display();

        System.out.println(q.dequeue());

        q.display();
    }
}
