
package singlylinkedlist;


public class singlylinkedlist {
    
    class Node { 
        
        int data;
        Node next;
        
        Node(int data){
            this.data = data;
            this.next = null;
          
        }
    }
    Node head;
    
    
    void add(int data) {
        Node newNode = new Node (data);
        if (head == null) {
            head = newNode;
            return;          
        }
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;        
    }
    
    void display() {
        Node current = head;
        
        while (current != null){
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
        
    }
    
   
        
    
    
    
    public static void main (String [] args){
        singlylinkedlist list = new singlylinkedlist();
        
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        
        list.display();
       
         
        
    }
}
