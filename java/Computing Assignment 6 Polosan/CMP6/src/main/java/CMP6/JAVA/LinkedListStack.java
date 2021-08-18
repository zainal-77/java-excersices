package CMP6.JAVA;
//complete your code here

/**
 *
 * @author ZainalAbidin
 */
public class LinkedListStack implements Stack{
    LinkedList  stack;
    Node top;

    public LinkedListStack() {
        this.top = null;
        stack    =new LinkedList(); 
    }

    @Override
    public boolean isEmpty() {
        if (stack.header==null) {
            return true;
        }
        return false;
    }

    @Override
    public Object push(Object item) {
        stack.addAtEnd(new Node(item,null));
        return item;
    }

    @Override
    public Object peek() {
      return stack.header.value;
    }

    @Override
    public Object pop() {
        Node first=stack.header;
        Node second=first.next;
        while(second!=null){
            first=second;
            second=first.next;
            
        }
        stack.deleteAtEnd();
        return first.value;
    }

    @Override
    public int search(Object o) {
        return 0;
    }
    
}