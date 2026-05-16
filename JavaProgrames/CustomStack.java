public class CustomStack {
    private int[] arr;
    private int size;
    private int currentPosition;


    // Constructor
    // Empty array of declared size & set correct current position and set size.
    public CustomStack(int size) {
        this.arr = new int[size];
        this.size = size;
        this.currentPosition = -1;
    }


    public void push(int element){
        if (currentPosition == size -1) {
            System.out.println("Stack Full, cant add more");
            return;
        }

        currentPosition = currentPosition + 1; 
        arr[currentPosition] = element;

        System.out.println("Element pushed " + element);
    };




    public int pop(){
        if (currentPosition == -1) {
            System.out.println("Stack is empty.");
            return -1;
        }
        int poppedItem = arr[currentPosition];
        currentPosition--;
        System.out.println("Elemet" +poppedItem);
        return poppedItem;
    };

    public void displayStack(){
        if (currentPosition == -1) {
            System.out.println("Stack is empty.");
            return;
        }

        for(int i=0; i<=currentPosition; i++) {
            System.out.println(arr[i] + " ");
        }
        System.out.println("\n");
    };
}


class Main {
    public static void main(String[] args) {
        CustomStack myStack = new CustomStack(4);

        myStack.push(0);
        myStack.push(1);
        myStack.push(2);
        myStack.pop();

        myStack.displayStack();

        myStack.push(4);

        myStack.displayStack(); 

        // [0,1,4]

        // myStack.displayStack();

        // myStack.pop();
        // myStack.pop();
        // myStack.pop();
        // myStack.pop();

        // myStack.displayStack();

        // myStack.pop();
        // myStack.displayStack();


    }
    
}