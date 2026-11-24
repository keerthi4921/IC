class Employee{
    String name;
    double baseSalary;
    void displayBasicInfo(){
        System.out.println(name);
        System.out.println(baseSalary);
    }
}
class Developer extends Employee{
    String programmingLanguage;
    void writeCode(){
        System.out.println(programmingLanguage);
    }
}
class Tester extends Employee{
    String testingTool;
    void runTests(){
        System.out.println(testingTool);
    }
}
public class Main7 {
    public static void main(String[] args) {
        Developer d=new Developer();
        Tester t=new Tester();
    }
    
}
