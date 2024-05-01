    class Dog {


    int age;
    String name;
    String breed;

    public Dog (String dogName, int dogAge, String dogBreed){
    age = dogAge;
    name = dogName;
    breed = dogBreed;
    }
    public void bark(){
    System.out.println("Woof! Woof!");
    }
    public int getAge() {
    return age;
    }
    public String getName() {
    return name;
    }
    public int getAgeinHumanYears(){
    return age*7;
    }

    public String getAgeCategory() {
        if (age <= 1) {
            return " Puppy";
        } else if (age < 4 && age > 1) {
            return " Young";
        } else if (age >= 4 && age <= 10) {
            return " Adult";
        } else {
            return " Elderly";
        }
    }
    
};
public class DogHw {
public static void main( String [] args )
{
Dog d1 = new Dog("Spike", 4, "Labrador");
Dog d2 = new Dog("Max", 1, "Chihuahua");
Dog d3 = new Dog("Bolt", 2, "Corgi");
Dog d4 = new Dog("Torgal", 8, "Husky");
System.out.println(d1);
System.out.println(d2);
System.out.println(d3);
System.out.println(d4);
}
}