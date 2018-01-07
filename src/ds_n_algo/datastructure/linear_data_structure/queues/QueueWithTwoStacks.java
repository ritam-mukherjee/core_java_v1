package ds_n_algo.datastructure.linear_data_structure.queues;

import java.util.Stack;


/**
Here two stacks are maintained
        1. Firstone keep all newes elements
        2. Second  one keeps all mnewse elements,
One helper method is there which shift elements from oldest to newest when stack oldest is empty

 */
public class QueueWithTwoStacks<T> {
    private Stack<T> stackNewestOnTop=new Stack<T>();
    private Stack<T> stackOldestOnTop=new Stack<T>();

    public void enQueue(T value){
        stackNewestOnTop.push(value);
    }

    public T peek(){
        shiftStacks();
        return stackOldestOnTop.peek();
    }

    public T deQueue(){
        shiftStacks();
       return stackOldestOnTop.pop();
    }

    public void shiftStacks(){
        if(stackOldestOnTop.isEmpty()){
            while(!stackNewestOnTop.isEmpty())
                stackOldestOnTop.push(stackNewestOnTop.pop());
        }
    }

    public static void main(String[] args) {
        QueueWithTwoStacks<Integer> queue=new QueueWithTwoStacks<Integer>();
        queue.enQueue(11);
        queue.enQueue(22);
        queue.enQueue(33);
        queue.enQueue(44);
        queue.enQueue(55);

        int size=queue.stackNewestOnTop.size();

        while(size>0) {
            System.out.println("Dequed elements :\t"+queue.deQueue());
            size--;
        }
    }
}
