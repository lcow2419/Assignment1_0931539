# Assignment 1: Dog and Person Classes in Java

## Student Name: Sherin Farjana Sirajudeen Sait
## Student ID: C0931539

### Assignment Title: Dog and Person Class Implementation with Unit Testing

---

### Assignment Description

In this assignment, we were required to implement two classes, `Dog` and `Person`, with the following specifications:

1. **Dog Class**:
   - Attributes:
     - `String name`
     - `Integer age`
   - Constructor:
     - `public Dog(String name, Integer age)`
   
2. **Person Class**:
   - Attributes:
     - `String name`
     - `Integer age`
     - `Optional<Dog> dog`
   - Constructors:
     - `public Person(String name, Integer age)`
     - `public Person(String name, Integer age, Dog dog)`
   - Methods:
     - `public boolean hasOldDog()` – Returns `true` if the person has a dog and the dog's age is greater than or equal to 10. No `if` statement should be used.
     - `public void changeDogsName(String newName)` – Changes the dog's name if the person owns a dog. If the person does not own a dog, it should throw a `RuntimeException` with the message: `"PersonName does not own a dog!"`. No `if` statement should be used.

3. **Java Application**:
   - The main class initializes a `Person` object without a dog, attempts to change the dog's name, catches the exception, and outputs: `"Unable to change dog's name: exceptionMessage"`.

4. **Unit Tests**:
   - Unit tests for both `Dog` and `Person` classes are written to ensure correctness. Each test includes assertions to validate the expected behavior.
   - The `Person` class will be tested for cases where it has a dog and where it does not have a dog.

---

### Instructions to Run the Code and Unit Tests in IntelliJ IDEA

#### Prerequisites:
- **IntelliJ IDEA** installed
- Java Development Kit (JDK) 11 or later
- JUnit for testing (can be managed by IntelliJ automatically)

#### 1. Clone the Repository
To get started, clone the repository using the following command:


#### 2. Open the Project in IntelliJ IDEA
1. Open **IntelliJ IDEA**.
2. Select **Open** and navigate to the project directory you just cloned.
3. Select the project and click **OK** to open it.

#### 3. Run the Application:
1. In the **Project** view, locate the **Main.java** file.
2. Right-click the file and select **Run 'Main.main()'**.

Alternatively, you can also use the **Run** button (green triangle) at the top-right corner of IntelliJ IDEA.

#### 4. Run Unit Tests:
1. In the **Project** view, locate the **PersonTest.java** file.
2. Right-click the file and select **Run 'PersonTest'**.
   
IntelliJ IDEA will automatically detect JUnit and run the unit tests. The results will be displayed in the **Run** window.

---


