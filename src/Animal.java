//Define a class Animal that has:
//
//an instance variable animalName
//a constructor that instantiate animalName
//a method animalSound() that prints default animal sound
//
public class Animal {
    private String animalName;

    public String getName() {
        return animalName;
    }

    public Animal(String name){
        this.animalName = animalName;
    }

    public void animalSound(){
        System.out.println("This is the sound of" + animalName);
    }

}
