//Brennan Cheatwood
//CSD 402 | Java Programming Assignment M4
//1/18/2026


//Follow the directions below:
//Write four overloaded methods that return the average of an array with the following headers:

//public static short average (short [ ] array)
//public static int average (int [ ] array)
//public static long average (long [ ] array)
//public static double average (double [ ] array)

//Write a test program that invokes each of these methods and then displays the average value 
//returned along with a display of the original array elements. 
// Ensure the display is easy to read and understandable. 
// Lastly, each array sent into the methods must be of different sizes to ensure the method code is correctly written.


public class OverloadedAveragesTest {
    

    // Overloaded average methods

    public static short average(short[ ] array) {
        long sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }

        //return type is short, so rounding to nearest whole

        double avg = (double) sum / array.length;
        return (short) Math.round(avg);
    }

    public static int average (int[ ] array) {
        long sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }
        double avg = (double) sum / array.length;
        return (int) Math.round(avg);
    }

    public static long average(long[ ] array) {
        double sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }
        double avg = sum / array.length;
        return Math.round(avg);
    }

    public static double average(double[ ] array) {
        double sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }
        return sum / array.length;
    }

    public static void main(String[] args) {

        //each array is a different size
        short[] shortArray = {10, 20, 30}; //size 3
        int[] intArray = {4, 8, 15, 16, 23}; //size 5
        long[] longArray = {100L, 200L, 300L, 400L}; //size 4
        double[] doubleArray = {2.5, 3.75, 9.0, 1.25, 6.5, 4.0}; //size 6

        //print SHORT array and avg
        System.out.println("--- SHORT ARRAY ---");
        System.out.println("Elements: ");
        for (int i = 0; i < shortArray.length; i++) {
            System.out.print(shortArray[i]);
            if (i < shortArray.length - 1) {
                System.out.print(", ");
            }
        }

        System.out.println();
        System.out.println("Average: " + average(shortArray));
        System.out.println();

        //Print INT array and avg
        System.out.println("--- INT ARRAY ---");
        System.out.print("Elements: ");
        for (int i = 0; i < intArray.length; i++) {
            System.out.print(intArray[i]);
            if (i < intArray.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
        System.out.println("Average: " + average(intArray));
        System.out.println();

        //print LONG array and average
        System.out.println("--- LONG ARRAY ---");
        System.out.print("Elements: ");
        for (int i = 0; i < longArray.length; i++) {
            System.out.print(longArray[i]);
            if (i < longArray.length - 1) {
                System.out.print(", ");
            }
        }

        System.out.println();
        System.out.println("Average: " + average(longArray));
        System.out.println();


        //print DOUBLE array and avg
        System.out.println("--- DOUBLE ARRAY ---");
        System.out.println("Elements: ");
        for (int i = 0; i < doubleArray.length; i++) {
            System.out.print(doubleArray[i]);
            if (i < doubleArray.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
        System.out.println("Average: " + average(doubleArray));
    }
}
