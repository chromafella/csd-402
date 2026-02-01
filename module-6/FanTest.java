//Brennan Cheatwood
//M6 Programming Assignment - CSD402
//https://github.com/brengeware/csd-402
//2/1/26


public class FanTest {
    //Fan Class
    static class Fan {

        //Constants
        public static final int STOPPED = 0;
        public static final int SLOW = 1;
        public static final int MEDIUM = 2;
        public static final int FAST = 3;

        //private (data)
        private int speed = STOPPED; //default stopped
        private boolean on = false; //default off
        private double radius = 6; //default 6
        private String color = "white"; //default being white

        //No argument constructor (sets the defaults)
        public Fan() {
            this.speed = STOPPED;
            this.on = false;
            this.radius = 6;
            this.color = "white";
        }

        //Constructor with arguments (sets custom values)
        public Fan(int speed, boolean on, double radius, String color) {
            this.speed = speed;
            this.on = on;
            this.radius = radius;
            this.color = color;
        }

        //Getters (returns values)
        public int getSpeed() {
            return speed;
        }

        public boolean isOn() {
            return on;
        }

        public double getRadius() {
            return radius;
        }

        public String getColor() {
            return color;
        }


        //Setters (changes values)
        public void setSpeed(int speed) {
            this.speed = speed;
        }

        public void setOn(boolean on) {
            this.on = on;
        }

        public void setRadius(double radius) {
            this.radius = radius;
        }

        public void setColor(String color) {
            this.color = color;
        }

        //helper that turns the speed numbers into words
        private String speedToText() {
            if (speed == STOPPED) return "STOPPED";
            if (speed == SLOW) return "SLOW";
            if (speed == MEDIUM) return "MEDIUM";
            if (speed == FAST) return "FAST";
            return "UNKNOWN"; // in case a wrong number is read
        }

        public String toString() {
            String status = on ? "ON" : "OFF";

            //if fan is OFF, speed doesn't matter, so we can mention that
            if (!on) {
                return "Fan status: " + status +
                    ", color: " + color +
                    ", radius: " + radius +
                    ", speed: STOPPED (fan is off)";
            }

            return "Fan status: " + status +
                ", color: " + color +
                ", radius: " + radius +
                ", speed: " + speedToText();
        }
    }

    //test code
    public static void main(String[] args) {

        //id
        System.out.println("\n\n");
        System.out.println("----------- Running FanTest.java - M6 Assignment -----------");
        System.out.println("----------- Brennan Cheatwood | CSD402 -----------");
        System.out.println("\n\n");

        // 1 Fan using default constructor
        Fan fan1 = new Fan();

        //2 fan using argument constructor
        Fan fan2 = new Fan(Fan.FAST, true, 10, "blue");

        // print both fans (calls toString)
        System.out.println("=== Fan 1 (default constructor) ===");
        System.out.println(fan1);

        System.out.println("\n=== Fan 2 (argument constructor) ===");
        System.out.println(fan2);

        //showing Getters working
        System.out.println("\n=== Using getters on Fan 2 ===");
        System.out.println("Speed (number): " + fan2.getSpeed());
        System.out.println("Is on?: " + fan2.isOn());
        System.out.println("Radius: " + fan2.getRadius());
        System.out.println("Color: " + fan2.getColor());

        //show setters working by changing Fan 1
        System.out.println("\n=== Changing Fan 1 using setters ===");
        fan1.setOn(true);
        fan1.setSpeed(Fan.MEDIUM);
        fan1.setRadius(8);
        fan1.setColor("red");

        System.out.println("Fan 1 after changes:");
        System.out.println(fan1);

        //turn fan 2 off and show how toString changes
        System.out.println("\n=== Turning Fan 2 off ===");
        fan2.setOn(false);
        System.out.println(fan2);
    }
}

