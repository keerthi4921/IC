class Vehicle{
    String brand;
    void honk(){
        System.out.println("Beep! Beep!");
    }

}
class Car extends Vehicle{
    String modelName;
    void dispalyDetails(){
        System.out.println("Brand="+brand);
        System.out.println("Modelname="+modelName);
    }
    

}
public class Main1 {
    public static void main(String[] args) {
        Car c=new Car();
        c.brand="Audi";
        c.modelName="es132";
        c.dispalyDetails();
        c.honk();
        
    }
    
}
