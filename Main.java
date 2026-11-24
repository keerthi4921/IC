class Student{
    private String name="Sneha";
    private int rollno=17;
    public void getter(){
        System.out.println(name);
        System.out.println(rollno);
    }
     public void setter( String s){
        name=s;


}
}
public class Main {
    public static void main(String[] args) {
        Student stu=new Student();
        stu.getter();
        stu.setter("priya");
        stu.getter();

    }
    
}
