package ds_n_algo.datastructure.linear_data_structure.stacks.array_implementation;

public class Stack_Array<X> {
    private X[] data;
    public int head=0;

    public Stack_Array(int size) {
        data = (X[])new Object[size];
    }
    public Stack_Array() {
        this(10);
    }
    public void push(X item){

        data[head++]=item;
    }

    public X pop(){
           /*checking Queue is empty or not*/
        if(head==0)
            throw new IllegalStateException("UnderFlow");

        X item=data[--head];
        data[head]=null;
        return item;
    }

    public  boolean contains(X item){
        boolean found=false;

        for (int i = 0; i < head; i++) {
            if(data[i].equals(item)){
                found=true;
                break;
            }
        }
        return found;
    }

    public X access(X item){

        while(head>0){
            X temp=pop();
            if(item.equals(temp))
                return temp;

        }
        throw new IllegalArgumentException("Item not found:"+item);

    }
    public void display(){
        for (X x:data
                ) {
            System.out.print(x +"<->");
        }
        System.out.println("\n");
    }
    public static void main(String[] args) {
        Stack_Array<Integer> stack=new Stack_Array<>();

        stack.push(11);
        stack.push(22);
        stack.push(33);
        stack.push(44);
        stack.push(55);
        stack.display();
        stack.pop();
        stack.pop();
        stack.display();
        System.out.println(stack.contains(11));
        System.out.println(stack.access(22));

    }
}
