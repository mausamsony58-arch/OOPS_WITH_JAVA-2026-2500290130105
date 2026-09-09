abstract class Device{  // Abstracct class;
    String brand ="Samsung";
    abstract void  turnOn(); //Abstract Method
     // concreate method
     void showbrand (){
        System.out.println("Brand :"+ brand);
     }
}
//INTERFACE
interface Camera{
    int MAX_ZOOM =10; // public ,static and final;
    void takePhoto(); // abstract and public method
    default void cameraInfo(){ // static or default in concrete method;
         System.out.println("Camera is ready");

    }
}
interface MusicPlayer{
    String TYPE  = "Digital";
    void playMusic();
    default void musicInfo(){
        System.out.println("Music player is ready");
    }

}

class SmartPhone extends Device implements Camera ,MusicPlayer{
 // multiple inheritance
 // Implement abstract method of device
 void turnOn(){
    System.out.println("Smartphone is turned on");
 }   
public void takePhoto(){
     System.out.println("Taking photo");
}
public void playMusic(){
 System.out.println("Playing music");
}

}
public class Abstract_Interface{
    public static void main(String[] args) {
        SmartPhone s = new SmartPhone();
        s.turnOn();
        s.showbrand();
        s.takePhoto();
        s.playMusic();
        
    }
}