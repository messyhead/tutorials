public class tut6App {
    public static void main(String[] args) {

//        int myInt = 25;
//
//        if(myInt < 10) {
//            System.out.println("Yes, it's true.");
//        }
//        else if(myInt > 20) {
//            System.out.println("No, its false.");
//        }
//        else {
//            System.out.println("None of the above");
//        }

        int loop = 0;

        while(true) {
            System.out.println("Looping " + loop);

            if(loop == 5) {
                break;
            }

            loop++;

            System.out.println("Running");
        }
    }
}
