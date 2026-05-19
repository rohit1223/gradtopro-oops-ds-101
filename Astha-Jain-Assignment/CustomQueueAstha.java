public class CustomQueueAstha {

    int[] arr;
    int front;
    int rear;
    int size;

    CustomQueueAstha(int size) {

        arr = new int[size];
        this.size = size;

        front = 0;
        rear = -1;
    }

    void enqueue(int element) {

        if(rear == size - 1) {
            System.out.println("Queue Full");
            return;
        }

        rear++;

        arr[rear] = element;

        System.out.println(element + " inserted");
    }

    int dequeue() {

        if(front > rear) {
            System.out.println("Queue Empty");
            return -1;
        }

        int removedElement = arr[front];

        front++;

        System.out.println(removedElement + " removed");

        return removedElement;
    }

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

    public static void main(String[] args) {

        CustomQueueAstha q = new CustomQueueAstha(4);

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