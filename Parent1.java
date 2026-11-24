public class Parent1 {
    void name(){
        System.out.println("Hi");
    }
    
}
class Child extends Parent1{

}
class Parent{
    public static void main(String[] args) {
        Child c=new Child();
        c.name();
    }
}
