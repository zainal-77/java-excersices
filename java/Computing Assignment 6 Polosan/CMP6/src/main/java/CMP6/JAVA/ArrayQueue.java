package CMP6.JAVA;
//complete your code here
public class ArrayQueue implements Queue{
    int top=-1;
    int down=0;
    Object [] data;
    
    ArrayQueue(){
        data= new Object[100];
    }

    @Override
    public boolean isEmpty() {
       if(top==-1){
           return true;
       }
       return false;
    }

    @Override
    public Object enqueue(Object item) {
        top++;
        data[top]=item;
        return item;
    }

    @Override
    public Object peek() {
        return data[top];
    }

    @Override
    public Object dequeue() {
        Object baru=data[down];
        top--;
        down++;
        return baru;
        
    }

    @Override
    public int search(Object o) {
       for(int i=0;i<=top;i++){
           if(data[i].equals(o)){
               return i;
           }
       }
       return -1;
    }
}