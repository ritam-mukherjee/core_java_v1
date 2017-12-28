package concepts.operators.relational;

public class RelationalOperator_1 {
    public static void main(String[] args) {
        System.out.println("-----------------||Property 1 ||-------------------------");
/*
Property 1:
    We can apply relational operators for every primitive type except Boolean.
*/
        System.out.println("10<20   :   " + (10 < 20));
        System.out.println("'a'<=97 :   " + ('a' <= 97));
        System.out.println("'A'>=65 :   " + ('A' >= 65));
        System.out.println("'A'<65 :   " + ('A' < 65));
        System.out.println("'a'>=97.5 :   " + ('a' >= 97.5));

/*
        Following declaration is not possible, will thow compile time exception
        System.out.println("true<false"+(true<false));
*/

        System.out.println("-----------------||Property 2 ||-------------------------");
/*
Property 2:
        We can’t apply relational operators for object types. As String is also an object we cann’t apply it over any String.
        System.out.println("ritam123"<"ritam456"+("ritam123"<"ritam456"));
*/

        System.out.println("-----------------||Property 3 ||-------------------------");
/*Property 3 :
        Nesting of relational operators is not allowed otherwise we will get compile time exception.
        System.out.println("10<20<30   :   "+(10<20,30));
        */


    }
}
