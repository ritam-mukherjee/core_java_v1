package design_patterns.creational.builder;

public class LunchOrderBuildingApp {
    public static void main(String[] args) {
        LunchOrder.Builder builder=new LunchOrder.Builder();
        builder.bread("Wheat").condiments("Lettuce").dressing("Mayo").meat("Turkey");

        LunchOrder lunchOrder=builder.buid();
        System.out.println(lunchOrder.getBread());
        System.out.println(lunchOrder.getBread());
        System.out.println(lunchOrder.getBread());
        System.out.println(lunchOrder.getBread());
    }


}
