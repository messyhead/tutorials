public class MyFirstClass {
    public static void main(String[] args) {
//        // Chapter 3
//        String make;
//        String model;
//
//        double engineSize;
        byte gear;
//
//        make = "Aston Martin";
//        model = "DB11";
//        engineSize = 5.4;
        gear = 6;
//        short speed;
//
//        speed = (short) (gear*20);
//
//        int revs = ((speed * gear)*10);
//        float oilPressure = (float)((speed * revs)/1.3);
//
//        System.out.println("The car is " + make + " " + model);
//        System.out.println("The engine size is " + engineSize);
//        System.out.println("The gear is " + gear);
//        System.out.println("Speed is " + speed);
//        System.out.println("The revs are " + revs);
//        System.out.println("The Oil Pressure is " + oilPressure);
//
//        // Chapter 4 - Part 1: If/Else
//        if (engineSize <= 1.3) {
//            System.out.println("This car has a small engine");
//        }
//
//        if (gear == 6) {
//            System.out.println("Speed should be over 60");
//        } else if (gear == 5) {
//            System.out.println("Speed should be over 50");
//        } else if (gear == 4) {
//            System.out.println("Speed should be over 40");
//        } else if (gear == 3) {
//            System.out.println("Speed should be over 30");
//        } else if (gear == 2) {
//            System.out.println("Speed should be over 20");
//        } else if (gear == 1) {
//            System.out.println("Speed should be less than 10");
//        }

        // Chapter 4 - Part 2: Loops
        int startYear1 = 1900;
        int endYear1 = 2000;

        while(startYear1<endYear1) {
            System.out.println("Leap years between 1900 and 2000 were: " + startYear1);
            startYear1 = startYear1 + 4;
        }

        System.out.println();

        int startYear2 = 1900;
        int leapYears = 0;

        do {
            System.out.println("Leap years between 1900 and 2000 were: " + startYear2);
            startYear2 = startYear2 + 4;
            leapYears++;
        }
        while (leapYears<5);

        System.out.println("Finished");

        // Chapter 4 - Part 3: Switch/case
        switch(gear) {
            case 6:
                System.out.println("Speed should be over 60");
                break;
            case 5:
                System.out.println("Speed should be over 50");
                break;
            case 4:
                System.out.println("Speed should be over 40");
                break;
            case 3:
                System.out.println("Speed should be over 30");
                break;
            case 2:
                System.out.println("Speed should be over 20");
                break;
            case 1:
                System.out.println("Speed should be less than 10");
                break;
        }

        System.out.println();
        // Chapter 4 - Optional section - Using arrays

        int[] years = new int[10];

        int startYear3 = 1900;
        int i = 0;

        do {
            years[i] = startYear3;
            startYear3 = startYear3 + 4;
            i++;
        }
        while (i<=9);

        for (int year : years) {
            System.out.println(year);
        }
        }
    }
