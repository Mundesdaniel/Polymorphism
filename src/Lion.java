
//Define a subclass Lion Define a subclass Cow
//achieve polymorphism by using method overriding on animalSound(),
// printing the right sounds Define a tester class where you:
//create an Animal object

public class Lion extends Animal{
    public Lion(String animalName){
        super(animalName);
    }

        public void animalSound(){
            System.out.println("Lion sound is Roar");
        }
}
