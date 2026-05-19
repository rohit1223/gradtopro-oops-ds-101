public class CustomCircularQueueAstha {

    int[] arr;
    int front;
    int rear;
    int size;

    CustomCircularQueueAstha(int size) {

        arr = new int[size];
        this.size = size;

        front = -1;
        rear = -1;
    }

    void enqueue(int element) {

        if((rear + 1) % size == front) {
            System.out.println("Queue Full");
            return;
        }

        if(front == -1) {
            front = 0;
        }

        rear = (rear + 1) % size;

        arr[rear] = element;

        System.out.println(element + " inserted");
    }

    int dequeue() {

        if(front == -1) {
            System.out.println("Queue Empty");
            return -1;
        }

        int removed = arr[front];

        if(front == rear) {
            front = -1;
            rear = -1;
        }
        else {
            front = (front + 1) % size;
        }

        System.out.println(removed + " removed");

        return removed;
    }

    void displayQueue() {

        if(front == -1) {
            System.out.println("Queue Empty");
            return;
        }

        int i = front;

        while(true) {

            System.out.print(arr[i] + " ");

            if(i == rear) {
                break;
            }

            i = (i + 1) % size;
        }

        System.out.println();
    }

    public static void main(String[] args) {

        CustomCircularQueueAstha q = new CustomCircularQueueAstha(5);

        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);

        q.displayQueue();

        q.dequeue();

        q.displayQueue();

        q.enqueue(4);
        q.enqueue(5);

        q.displayQueue();
    }
}