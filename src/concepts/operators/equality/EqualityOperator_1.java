package concepts.operators.equality;

public class EqualityOperator_1 {
    public static void main(String[] args) {

        System.out.println("-----------------||Property 1 ||-------------------------");
     /*Property 1:
        We can apply equality operators for every primitive type including Boolean type also;
    */
        System.out.println("10==20  :   "+(10==20));
        System.out.println("true==false    :    "+(true==false));
        System.out.println("true!=false    :    "+(true!=false));
        System.out.println("'A'!='B'    :   "+('A'!='B'));
        System.out.println("24.5==24.5  :   "+(24.5==24.5));

        System.out.println("-----------------||Property 2 ||-------------------------");
     /*   Property2:
            We can apply equality operator for object type also, for object references r1, r2 the r1== r2
            returns true if and only if both pointing same object ( This is called “reference comparison” or “address comparison”).
    */

     Thread t1=new Thread();
     Thread t2=new Thread();
     Thread t3=t1;
        System.out.println("t1==t2  :   "+(t1==t2));
        System.out.println("t1==t3  :   "+(t1==t3));
        System.out.println("t1!=t2  :   "+(t1!=t2));
        System.out.println("t1!=t3  :   "+(t1!=t3));

        System.out.println("-----------------||Property 3 ||-------------------------");
    /*   Property 3:
        If we apply equality operators for object types then compulsory there should be some relations
        between argument types( either child to parent or parent to child or same type)
        otherwise we will get compile time error saying “Incomparable types”:*/

    Thread t=new Thread();
    Object o=new Object();
    String s=new String("ABC");

        /*following is valid declaration as both s and t are subclass of o*/
        System.out.println("t==o    :   "+(t==o));
        System.out.println("s==o    :   "+(s==o));
       /*following are invalid declarion as s and t having no relationship*/
        /*System.out.println("s==t    :   "+(s==t));*/
    }
}
