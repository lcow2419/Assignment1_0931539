public class Main {
    public static void main(String[] args) {
        // Person without a dog
        Person cPersonWithoutDog = new Person("Alice", 25);

        // Attempt to change dog's name and handle exception
        try {
            cPersonWithoutDog.changeDogsName("Max");
        } catch (RuntimeException e) {
            System.out.println("Unable to change dog's name: " + e.getMessage());
        }

        // Person with a dog
        Dog cBuddy = new Dog("Buddy", 12);
        Person cPersonWithDog = new Person("Bob", 30, cBuddy);

        // Checking if Bob has an old dog
        System.out.println(cPersonWithDog.getName() + " has old dog: " + cPersonWithDog.hasOldDog());

        // Changing Bob's dog's name
        cPersonWithDog.changeDogsName("Rocky");
        System.out.println("Updated dog's name: " + cPersonWithDog.getDog().get().getSName());
    }
}
