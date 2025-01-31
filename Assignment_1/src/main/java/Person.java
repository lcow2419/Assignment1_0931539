// Person.java - Represents a Person with an optional Dog
import java.util.Optional;

public class Person {
    private String sName; // Name of the person
    private int nAge; // Age of the person
    private Optional<Dog> pDog; // Optional Dog object

    // Constructor for person without a dog
    public Person(String sName, int nAge) {
        this(sName, nAge, null);
    }

    // Constructor for person with a dog
    public Person(String sName, int nAge, Dog pDog) {
        this.sName = sName;
        this.nAge = nAge;
        this.pDog = Optional.ofNullable(pDog);
    }

    // Method to check if person has an old dog (>=10 years)
    public boolean hasOldDog() {
        return pDog.map(d -> d.getNAge() >= 10).orElse(false);
    }

    // Method to change the dog's name if person has a dog
    public void changeDogsName(String sNewName) {
        pDog.ifPresentOrElse(
                d -> d.setSName(sNewName),
                () -> { throw new RuntimeException(sName + " does not own a dog!"); }
        );
    }

    //getter for name
    public String getName() {
        return sName;
    }

    // Setter for name
    public void setName(String sName) {
        this.sName = sName;
    }

    //getter for age
    public Integer getAge() {
        return nAge;
    }

    // Setter for age
    public void setAge(int nAge) {
        this.nAge = nAge;
    }

    //getter for dog if they have any
    public Optional<Dog> getDog() {
        return pDog;
    }
}