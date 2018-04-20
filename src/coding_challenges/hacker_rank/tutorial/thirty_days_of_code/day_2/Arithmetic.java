package coding_challenges.hacker_rank.tutorial.thirty_days_of_code.day_2;

import java.util.*;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;

public class Arithmetic {


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double mealCost = scan.nextDouble(); // original meal price
        int tipPercent = scan.nextInt(); // tip percentage
        int taxPercent = scan.nextInt(); // tax percentage
        scan.close();

        // Write your calculation code here.
        BiFunction<Double,Integer,Double> calculatePercentage=(meal_cost, percent_value) -> (meal_cost*percent_value)/100;

        BiFunction<Double,Integer,Double> actual_tip=calculatePercentage;
        BiFunction<Double,Integer,Double> actual_tax=calculatePercentage;


        Function<Integer,String> output=integer -> "The total meal cost is "+integer+" dollars.";

        Consumer<String> print=System.out::println;

        // cast the result of the rounding operation to an int and save it as totalCost
        int totalCost = (int) Math.round(mealCost
                                        +(double)actual_tip.apply(mealCost,tipPercent)
                                        +(double)actual_tax.apply(mealCost,taxPercent));


        // Print your result
        print.accept(output.apply(totalCost));
    }
}