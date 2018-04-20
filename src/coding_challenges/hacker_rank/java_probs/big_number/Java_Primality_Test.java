package coding_challenges.hacker_rank.java_probs.big_number;

import java.math.BigInteger;
import java.util.Scanner;
import java.util.function.Function;
import java.util.function.Supplier;

public class Java_Primality_Test {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        BigInteger n = in.nextBigInteger();
        in.close();


        System.out.println(n.isProbablePrime(0));
        Supplier<String> prime=() -> "prime";
        Supplier<String> not_prime=() -> "not prime";
        Function<Integer,String> isPrime=integer ->{

            Boolean flag=false;
            if(integer==0 ||integer==1)
                flag=true;
            else{
                int middle=integer/2;
                incrementer:
                for (int i = 2; i <= middle; i=i+1) {

                    if(integer%i==0){
                        flag=true;
                        break incrementer;
                    }
                }
            }

            return flag?not_prime.get():prime.get();
        };

       // System.out.println(isPrime.apply(n.intValue()));
    }
}
