class Shape{
    String color;
    void displayColor(){
        System.out.println("Color="+color);
    }
}
class Circle extends Shape{
    int  r=5;
     void calculateArea(){
        System.out.println("Calculated area="+3.14*r*r);


     }
}
class Rectangle extends Shape{
    int l=5;
    int b=2;
    void calculateArea(){
        System.out.println("Calculated Area="+l*b);
    }
}
public class Main2 {
    public static void main(String[] args) {
        Circle c=new Circle();
        Rectangle r=new Rectangle();
        c.color="red";
        r.color="yellow";
        c.calculateArea();
        r.calculateArea();
        c.displayColor();
        r.displayColor();

        
    }
    
}
