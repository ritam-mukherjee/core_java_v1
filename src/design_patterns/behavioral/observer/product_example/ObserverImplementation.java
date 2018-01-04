package design_patterns.behavioral.observer.product_example;

import java.util.ArrayList;

interface Subject{

    public void registerObserver(Observer observer);
    public void removeObserver(Observer observer);
    public void notifyObservers();
}
interface Observer{

    public void update(boolean availability);
}


class Person implements Observer{

    Subject subject;
    String name;

    public Person(Subject subject, String name) {
        this.subject = subject;
        this.name = name;
        subject.registerObserver(this);
    }

    @Override
    public void update(boolean availability) {
        System.out.println("Hello "+name+" pruduct availability "+availability);
    }
}
class Product implements Subject{

    ArrayList<Observer> observers=new ArrayList<>();
    String productName;
    boolean availability=false;


    public boolean isAvailability() {
        return availability;
    }

    public void setAvailability(boolean availability) {
        this.availability = availability;
        notifyObservers();

    }

    public Product(String productName) {
        this.productName = productName;
        setAvailability(availability);
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        System.out.println("the "+productName + "is now availability :  "+availability);
        for (Observer observer:observers
             ) {
            observer.update(availability);
        }
    }
}
public class ObserverImplementation {
    public static void main(String[] args) {

        Product tv=new Product("Tv");

        Person person_ritam=new Person(tv,"Ritam");
        Person person_poulami=new Person(tv,"Poulami");
        Person person_astha=new Person(tv,"Astha");

        for (Observer observer:tv.observers
             ) {
            Person p=(Person)observer;
            System.out.println("rgister observers are:"+p.name  );
        }







    }
}
