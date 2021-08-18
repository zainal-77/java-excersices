public class LinkedListQueue implements Queue{
    
    LinkedList queue;
    
    public LinkedListQueue(){
        queue = new LinkedList();
    }

    public Object enqueue(Object o){
        queue.addAtEnd(new Node(o,null));
        return o;
    }
    
    public Object peek(){
        return queue.header.value;
    }
    
    public Object dequeue(){
        Object o = queue.header.value;
        queue.deleteAtFront();
        return o;
    }
    public int search(Object o){
        int i=-1;
        for (Node c=queue.header;c!=null;c=c.next){
            if (c.value.equals(o)){
                return i+1;
            }
        }
        return i;
    }
    
    public boolean isEmpty(){
        if (queue.header==null){
            return true;
        }
        return false;
    }

}