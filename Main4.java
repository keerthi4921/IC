class Device{
    String powerSource;
    void turnOn(){
        System.out.println("Device Powered on"+powerSource);
    }
}
class Mobile extends Device{
    double screenSize;
    void makeCall(){
        System.out.println(screenSize);
    }
}
class Android extends Mobile{
    void openPlayStore(){}
   
    }
    class Iphone extends Mobile{
        void openPlayStore(){}
}
public class Main4 {
    public static void main(String[] args) {
        
    
    Android a=new Android();
    Iphone i=new Iphone();
    a.makeCall();
    i.makeCall();
    a.turnOn();
    i.turnOn();

    
}
}

