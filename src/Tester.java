//Define a class Animal that has:
//
//an instance variable animalName
//a constructor that instantiate animalName
//a method animalSound() that prints default animal sound Define a subclass Lion Define a subclass Cow
//achieve polymorphism by using method overriding on animalSound(), printing the right sounds Define a tester class where you:
//create an Animal object
//create a Lion object
//create a Cow object
//executes the animalSound() method on all the 3 objects

public class Tester extends Animal{


    public Tester(String name) {
        super(name);
    }

    public static void main(String[] args) {

        Lion lion = new Lion("Bonhu");
        Cow cow = new Cow("Bagara");


        lion.animalSound();
        cow.animalSound();


}
}