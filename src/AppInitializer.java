public class AppInitializer {
    public static void main(String[] args) {
        Animal myAnimal;// that is a reappearance variable
        myAnimal=new Dog();
        myAnimal.makeSound();
        myAnimal= new Cat();
        myAnimal.makeSound();
//or
        Animal obj =new Dog();
        obj.makeSound();
    }
}
