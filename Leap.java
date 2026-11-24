import java.util.*;
public class Leap {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a year");
        int year=sc.nextInt();
        if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) {
            System.out.println("It is a Leap Year");
        }
        else {
            System.out.println("It is Not a Leap Year");
        }

        sc.close();
    }
}
    
    

