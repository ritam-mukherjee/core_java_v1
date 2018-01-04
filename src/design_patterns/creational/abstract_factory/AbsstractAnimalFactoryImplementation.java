package design_patterns.creational.abstract_factory;


import java.util.function.Consumer;

interface Animal {
    public String speak();
}

class Lion implements Animal {

    @Override
    public String speak() {
        return this.getClass().getSimpleName() + "  :  " + "Roar";
    }
}

class Dog implements Animal {

    @Override
    public String speak() {
        return this.getClass().getSimpleName() + "  :  " + "Bark";
    }
}

class Shark implements Animal {

    @Override
    public String speak() {
        return this.getClass().getSimpleName() + "  :  " + "Can't speak";
    }
}

class Octopus implements Animal {

    @Override
    public String speak() { return this.getClass().getSimpleName() + "  :  " + "squawck"; }
}

/*Due to this "abstract class" the name of this design pattern is "Abstract Factory Pattern"*/
abstract class AnimalFactory {

    /*getAnimal() is the abstract factory method would be instantiated at child*/
    public abstract Animal getAnimal(String animalType);

    static AnimalFactory animalFactory;

    public static AnimalFactory getAnimalFactory(String factoryType) {
        if (factoryType.equalsIgnoreCase("sea"))
            animalFactory = new SeaAnimalFactory();
        if (factoryType.equalsIgnoreCase("land"))
            animalFactory = new LandAnimalFactory();

        return animalFactory;
    }

}

/*Both child class of abstract factory method have to override abstract method*/
class LandAnimalFactory extends AnimalFactory {

    Animal animal;

    @Override
    public Animal getAnimal(String animalType) {
        if (animalType.equalsIgnoreCase("lion"))
            animal = new Lion();
        if (animalType.equalsIgnoreCase("dog"))
            animal = new Dog();
        return animal;
    }

}

/*Both child class of abstract factory method have to override abstract method*/
class SeaAnimalFactory extends AnimalFactory {
    Animal animal;

    @Override
    public Animal getAnimal(String animalType) {
        if (animalType.equalsIgnoreCase("octopus"))
            animal = new Octopus();
        if (animalType.equalsIgnoreCase("shark"))
            animal = new Shark();
        return animal;
    }
}

/*This class is refer as client class*/
public class AbsstractAnimalFactoryImplementation {

    public static void main(String[] args) {

        Consumer<String> stringConsumer=System.out::println;

        stringConsumer.accept(AnimalFactory.getAnimalFactory("land").getAnimal("dog").speak());
        stringConsumer.accept(AnimalFactory.getAnimalFactory("land").getAnimal("lion").speak());
        stringConsumer.accept(AnimalFactory.getAnimalFactory("sea").getAnimal("shark").speak());
        stringConsumer.accept(AnimalFactory.getAnimalFactory("sea").getAnimal("octopus").speak());
    }
}
