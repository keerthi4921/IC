class Animal{
    String name="Milky";
    void eat(){
        System.out.println("Milky is Eating");
    }
}
class Dog extends Animal{
    String breed="Poodle";
    void bark(){
        System.out.println("Milky the poodle is barking");
    }

}

public class Main5 {
    public static void main(String[] args) {
        Dog d=new Dog();
        d.name="Scoopy";
        d.breed="pug";
        d.eat();
        d.bark();

    }
    
}
