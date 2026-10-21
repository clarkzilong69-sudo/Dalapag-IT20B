
package QueueArray;

public class QueueArray {

    private int[] stack;
    private int top;
    private int capacity;

    
    public QueueArray(int capacity) {
        this.capacity = capacity;
        stack = new int[capacity];
        top = -1;
    }

   
    public void push(int value) {
        if (top == capacity - 1) {
            System.out.println("Stack Overflow! Cannot push " + value);
            return;
        }

        stack[++top] = value;
    }

    
    public int pop() {
        if (top == -1) {
            System.out.println("Stack Underflow! Stack is empty.");
            return -1;
        }

        return stack[top--];
    }

    
    public int peek() {
        if (top == -1) {
            System.out.println("Stack is empty.");
            return -1;
        }

        return stack[top];
    }

    
    public void display() {
        if (top == -1) {
            System.out.println("Stack is empty.");
            return;
        }

        System.out.println("Stack elements (top to bottom):");
        for (int i = top; i >= 0; i--) {
            System.out.println(stack[i]);
        }
    }

    
    public static void main(String[] args) {

        
        QueueArray stack = new QueueArray(5);

        
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);

        System.out.println();

        
        stack.display();

        System.out.println();

        
        System.out.println("Top element: " + stack.peek());

        System.out.println();

        
        System.out.println("Removed: " + stack.pop());

        System.out.println();

        
        System.out.println("Top element: " + stack.peek());

        System.out.println();

        
        stack.display();
    }
}