// Importing required libraries for the test cases
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

// Test class for the Person and Dog classes
class PersonTest {

    // Test case to verify the initialization of a Dog object
    @Test
    void testDogInitialization() {
        // Creating a Dog object with the name "Max" and age 5
        Dog cDog = new Dog("Max", 5);

        // Asserting that the dog's name is "Max"
        assertEquals("Max", cDog.getSName());

        // Asserting that the dog's age is 5
        assertEquals(5, cDog.getNAge());
    }

    // Test case to verify the setName method for the Dog object
    @Test
    void testSetName() {
        // Creating a Dog object with the name "Charlie" and age 7
        Dog cDog = new Dog("Charlie", 7);

        // Setting the dog's name to "Rocky"
        cDog.setSName("Rocky");

        // Asserting that the dog's name is now "Rocky"
        assertEquals("Rocky", cDog.getSName());
    }

    // Test case to verify the setAge method for the Dog object
    @Test
    void testSetAge() {
        // Creating a Dog object with the name "Buddy" and age 3
        Dog cDog = new Dog("Buddy", 3);

        // Setting the dog's age to 4
        cDog.setNAge(4);

        // Asserting that the dog's age is now 4
        assertEquals(4, cDog.getNAge());
    }

    // Test case to verify that a Person without a dog returns an empty Optional
    @Test
    void testPersonWithoutDog() {
        // Creating a Person object without a dog
        Person cPerson = new Person("Alice", 25);

        // Asserting that the Person does not have a dog (the result should be an empty Optional)
        assertFalse(cPerson.getDog().isPresent());
    }

    // Test case to verify that a Person with a dog returns the correct dog
    @Test
    void testPersonWithDog() {
        // Creating a Dog object named "Buddy" with age 12
        Dog cDog = new Dog("Buddy", 12);

        // Creating a Person object named "Bob" with age 30, who owns the dog
        Person cPerson = new Person("Bob", 30, cDog);

        // Asserting that the Person has a dog (the result should be a non-empty Optional)
        assertTrue(cPerson.getDog().isPresent());

        // Asserting that the dog's name is "Buddy"
        assertEquals("Buddy", cPerson.getDog().get().getSName());
    }

    // Test case to verify that a Person with an old dog returns true for hasOldDog
    @Test
    void testHasOldDog() {
        // Creating a Dog object with age 12, which is considered an old dog
        Dog cOldDog = new Dog("Buddy", 12);

        // Creating a Person object with age 40, who owns the old dog
        Person person = new Person("Charlie", 40, cOldDog);

        // Asserting that the Person has an old dog
        assertTrue(person.hasOldDog());
    }

    // Test case to verify that a Person can change their dog's name
    @Test
    void testChangeDogsName() {
        // Creating a Dog object with the name "Buddy" and age 5
        Dog cDog = new Dog("Buddy", 5);

        // Creating a Person object named "David" with age 28, who owns the dog
        Person cPerson = new Person("David", 28, cDog);

        // Changing the dog's name to "Rocky"
        cPerson.changeDogsName("Rocky");

        // Asserting that the dog's name is now "Rocky"
        assertEquals("Rocky", cPerson.getDog().get().getSName());
    }

    // Test case to verify that trying to change a dog's name when the Person doesn't own a dog throws an exception
    @Test
    void testChangeDogsNameThrowsException() {
        // Creating a Person object named "Eve" with age 22, who does not own a dog
        Person cPerson = new Person("Eve", 22);

        // Asserting that a RuntimeException is thrown when trying to change a dog's name
        RuntimeException exception = assertThrows(RuntimeException.class, () -> cPerson.changeDogsName("Max"));

        // Asserting that the exception message is correct
        assertEquals("Eve does not own a dog!", exception.getMessage());
    }
}

