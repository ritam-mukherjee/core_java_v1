package design_patterns.creational.factory.animal_example;

/**
 * source : Ram N
 */

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

class AnimalFactory {
    Animal animal;

    public Animal createInstance(String animalType) {
        if (animalType == "lion")
            animal = new Lion();
        if (animalType == "dog")
            animal = new Dog();
        return animal;
    }


}

public class AnimalFactoryImplimentation {
    public static void main(String[] args) {
        AnimalFactory animalFactory = new AnimalFactory();
        Animal animal1 = animalFactory.createInstance("dog");
        System.out.println(animal1.speak());

        Animal animal2 = animalFactory.createInstance("lion");
        System.out.println(animal2.speak());

    }
}
