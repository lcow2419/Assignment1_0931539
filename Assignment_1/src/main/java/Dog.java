import java.util.Objects;

// Dog.java - Represents a Dog with name and age
public class Dog {
    private String sName; // Name of the dog
    private int nAge; // Age of the dog

    // Constructor to initialize Dog object
    public Dog(String sName, int nAge) {
        this.sName = sName;
        this.nAge = nAge;
    }

    // Getter for name
    public String getSName() {
        return sName;
    }

    // Setter for name
    public void setSName(String sName) {
        this.sName = sName;
    }

    // Getter for age
    public int getNAge() {
        return nAge;
    }

    // Setter for age
    public void setNAge(int nAge) {
        this.nAge = nAge;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Dog dog = (Dog) obj;
        return Objects.equals(sName, dog.sName) && Objects.equals(nAge, dog.nAge);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sName, nAge);
    }

    @Override
    public String toString() {
        return "Dog{name='" + sName + "', age=" + nAge + "}";
    }
}
