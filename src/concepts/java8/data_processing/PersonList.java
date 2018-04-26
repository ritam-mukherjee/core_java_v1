package concepts.java8.data_processing;



import java.util.ArrayList;
import java.util.List;

public class PersonList {
    List<Person> persons;


    public PersonList() {
        persons=new ArrayList<>();

        Person kutu=new Person("Kutu","Mukherjee", 28);
        Person astha=new Person("Astha","Kharoo", 29);
        Person tina=new Person("Tina","Roy", 33);
        Person ramisha=new Person("Ramisha","Samanta", 30);
        Person sneha=new Person("Sneha","Agarwal", 25);

        persons.add(kutu);
        persons.add(tina);
        persons.add(astha);
        persons.add(sneha);
        persons.add(ramisha);
    }

    public List<Person> getPersons() {
        return persons;
    }

    public void setPersons(List<Person> persons) {
        this.persons = persons;
    }
}
