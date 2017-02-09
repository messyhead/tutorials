
class Machine {
    public void start() {
        System.out.println("Machine started.");
    }
}

//This is a child of Machine i.e. subclass
class Camera extends Machine {
     public void start() {
         System.out.println("Camera started.");
     }

     public void snap() {
         System.out.println("Photo taken");
     }
}


public class App {
    public static void main(String[] args) {

        Machine machine1 = new Machine();
        Camera camera1 = new Camera();

        machine1.start();
        camera1.start();
        camera1.snap();

//        Upcasting
        Machine machine2 = camera1;
        machine2.start();
//        Doesn't work as Machine doesn't have a snap() method
//        machine2.snap();

//        Downcasting - casting a child class to it's parent - inherently unsafe
//        This works as the variable types being cast are the same type of object
//        e.g. machine3 contains a Camera() and you try to cast it to camera2 which is also a Camera()
        Machine machine3 = new Camera();
        Camera camera2 = (Camera)machine3;
        camera2.start();
        camera2.snap();

//        This doesn't work as you're trying to cast (change) one object into another i.e. a Machine into a Camera
        Machine machine4 = new Machine();
//        Camera camera3 = (Camera)machine4;
//        camera3.start();
//        camera3.snap();
    }
}
