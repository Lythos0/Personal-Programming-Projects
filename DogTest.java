

public class DogTest {
    // instance field
    String breed;
    String name;
    int age;
  
    // constructor method
    public DogTest(String dogBreed, int dogAge, String dogName) {
      /*
      value of parameter dogBreed
      assigned to instance field breed
      */
      breed = dogBreed;
      age = dogAge;
      name = dogName;
    }
    public static void main(String[] args) {
      /*
      create instance:
      use 'new' operator and invoke constructor
      */
      DogTest fido = new DogTest("poodle", 5, "Akisa");
      /*
      fields are accessed using:
      the instance name, `.` operator, and the field name.
      */
      System.out.println(fido.breed);
      System.out.println(fido.age);
      System.out.println(fido.name);
      // Prints "poodle"
    }
  }
  