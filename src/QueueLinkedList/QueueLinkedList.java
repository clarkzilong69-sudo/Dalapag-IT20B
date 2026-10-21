
package QueueLinkedList;


public class QueueLinkedList {
    
  private int[]stack;
  private int top;
  private int capacity;
  
  
  public QueueLinkedList(int size){
      capacity = size;
      stack = new int[capacity];
      top = -1;
  }
  
  public boolean isEmpty(){
  return top == -1;
  }
  
   public boolean isFull() {
        return top == capacity - 1;
   }
   public void push(int value) {
        if (isFull()) {
            System.out.println("Stack Overflow! Stack is full.");
            return;
        }

        top++;
        stack[top] = value;

        System.out.println(value + " pushed into the stack.");
    }

    // Remove an element from the stack
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow! Stack is empty.");
            return -1;
        }

        int value = stack[top];
        top--;

        return value;
    }

    // View the top element
    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty.");
            return -1;
        }

        return stack[top];
    }

    // Display all elements
    public void display() {
        if (isEmpty()) {
            System.out.println("Stack is empty.");
            return;
        }

        System.out.println("Stack elements:");

        for (int i = top; i >= 0; i--) {
            System.out.println(stack[i]);
        }
    }

    // Main method
    public static void main(String[] args) {

        // Create a stack with capacity 5
        QueueLinkedList  stack = new QueueLinkedList (5);

        // Push elements
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);

        // Check if empty or full
        System.out.println("Is empty? " + stack.isEmpty());
        System.out.println("Is full? " + stack.isFull());

        // Display stack
        stack.display();

        // View the top element
        System.out.println("Top element: " + stack.peek());

        // Remove an element
        System.out.println("Removed: " + stack.pop());

        // View the top element again
        System.out.println("Top element: " + stack.peek());

        // Display stack again
        stack.display();
    }
}




    
    
