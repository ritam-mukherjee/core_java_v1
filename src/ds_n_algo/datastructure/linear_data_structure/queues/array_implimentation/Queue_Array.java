package ds_n_algo.datastructure.linear_data_structure.queues.array_implimentation;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Queue_Array<X> {

    private X[] data;
    private int front;
    private int rear;

    public Queue_Array(int size) {
        this.front=-1;
        this.rear=-1;
       data = (X[])new Object[size];
    }

    public Queue_Array() {
        this(10);
    }

    public void enQueue(X item) {
       /* Check if Queue is full*/
        if ((rear + 1) % data.length == front)
            throw new IllegalStateException("OverFlow");

         /*if the queue is empty then add the element as an first element*/
        if (size() == 0) {
            front++;
            rear++;
            data[rear]=item;
        }
        else {
            rear++;
            data[rear] = item;
        }

    }
    public X deQueue(){

        X item=null;

        /*checking Queue is empty or not*/
        if(size()==0)
            throw new IllegalStateException("UnderFlow");
        else if(front==rear){
            item=data[front];
            front=-1;
            rear=-1;
            data[front]=null; /*optional assignment for GC*/
        }else{
            item=data[front];
            data[front]=null; /*optional assignment for GC*/
            front++; /* Front move forward*/
        }
        return item;
    }


    public int size(){
        if (front==-1 && rear==-1)
            return 0;
        else
            return rear-front+1; //for getting inclusive count add 1 needed
    }

    public  boolean contains(X item){
        boolean found=false;
        if(size()==0)
            return found;

            for (int i = front; i <rear; i++) {
                if(data[i]==item){
                    found=true;
                    break;
                }
            }
        return found;
    }

        public void display(){
            for (X x:data
                 ) {
                System.out.print(x +"<->");
            }
            System.out.println("\n");
        }
    public X access(int position){
        if(size()==0||position>=size())
            throw new IllegalStateException("Invalid Position");
        
        int trueIndex=0;
        for (int i = front; i <=rear ; i++) {
            if(trueIndex==position)
                return data[i];

            trueIndex++;
        }
       throw new IllegalStateException("Item not found");
    }

    public static void main(String[] args) {
        Queue_Array<Integer> array=new Queue_Array<>();
        array.enQueue(11);
        array.enQueue(22);
        array.enQueue(33);
        array.enQueue(44);
        array.enQueue(55);
        array.display();
        array.deQueue();
        array.deQueue();
        array.display();
        System.out.println(array.contains(55));
        System.out.println(array.access(2));



    }
}
