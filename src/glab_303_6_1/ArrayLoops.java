package glab_303_6_1;
import java.util.Scanner;
public class ArrayLoops {

    public static void main(String[] args) {
        accessArrayElements();
        usingForLoop();
        iteratingWithEnhancedForLoop();
        computeSumAndAverage();
        calculateMeanAndStandardDeviation();
        insertElementAtEnd();
    }

    /*  Example 1: Access Array Elements
        Using the index number to access each element of the array.
        Can use loops to access all array elements at once. */
    public static void accessArrayElements() {
        // create an array
        int[] age = {12, 4, 5, 2, 5};
        // access each array element
        System.out.println("Accessing Elements of an Array:");
        System.out.println("First Element: " + age[0]); // "12"
        System.out.println("Second Element: " + age[1]); // "4"
        System.out.println("Third Element: " + age[2]); // "5"
        System.out.println("Fourth Element: " + age[3]); // "2"
        System.out.println("Fifth Element: " + age[4]); // "5"
    }

    /*  Example 2: Using for Loop
        Using the for Loop in Java to iterate through each element of the array.
        Notice the expression inside the loop, age.length */
    public static void usingForLoop() {
        // create an array
        int[] age = {12, 4, 5};
        // loop through the array using for loop
        System.out.println("Using for Loop:");
        for (int i = 0; i < age.length; i++) {
            System.out.println(age[i]); // 12 4 5
        }
    }

    /*  Example 3: Iterating Over an Array using Enhanced For Loop
        Using the enhanced for loop to iterate over an array of strings.
        Simpler and more concise for iterating through elements. */
    public static void iteratingWithEnhancedForLoop() {
        String[] names = {"New York", "Dallas", "Las Vegas", "Florida"};
        for (String name : names) {
            System.out.println(name); // New York Dallas Las Vegas Florida
        }
    }

    /*  Example 4: Compute the Sum and Average of Array Elements
        Created an array of named numbers. Used the for-each loop to access each array element.
        Inside the loop, calculated the sum of each element.
        Notice the line: int arrayLength = number.length;
        Using the length attribute of the array to calculate the size of the array.
        Then calculated the average using: average = ((double)sum / (double)arrayLength);
        Converted the int value into a double. This is called 'type casting' in Java. */
    public static void computeSumAndAverage() {
        int[] numbers = {2, -9, 0, 5, 12, -25, 22, 9, 8, 12};
        int sum = 0;
        double average;

        // access all elements using for each loop
        // add each element in sum
        for (int number : numbers) {
            sum += number;
        }

        // get the total number of elements
        int arrayLength = numbers.length;
        // calculate the average
        // convert the average from int to double
        average = ((double) sum / (double) arrayLength);
        System.out.println("Sum = " + sum); // Sum = 36
        System.out.println("Average = " + average); // Average = 3.6
    }

    /*  Example 5: Mean and Standard Deviation
        Demonstrates how to find the mean and std dev of array of numbers
        Computes the sum and sum of squares of the elements
        and then uses these to calculate the mean and standard deviation. */
    public static void calculateMeanAndStandardDeviation() {
        // Declare variable
        int[] marks = {74, 43, 58, 60, 90, 64, 70};
        int sum = 0, sumSq = 0;
        double mean, stdDev;
        // Compute sum and square-sum using loop
        for (int mark : marks) {
            sum += mark;
            sumSq += mark * mark;
        }
        mean = (double) sum / marks.length;
        stdDev = Math.sqrt((double) sumSq / marks.length - mean * mean);
        // Print results
        System.out.printf("Mean is: %.2f%n", mean); // Mean is: 65.57
        System.out.printf("Standard deviation is: %.2f%n", stdDev); // Standard deviation is: 13.56
    }

    /* Example 6: Insert an Element at the End of an Array in Java
        Inserting a new element at the end of an array.

        Taking input from the user for array elements and the new element to be added
        Then adding this new element at the end of the array.

        Ex:
        Enter 10 Elements: 10
        20
        30
        40
        50
        60
        70
        80
        90
        100
        Enter an Element to Insert: 500

        Now the new array is:
        10 20 30 40 50 60 70 80 90 100 500 */
    public static void insertElementAtEnd() {
        Scanner scan = new Scanner(System.in);
        int[] arr = new int[11];
        System.out.print("Enter 10 Elements: ");
        for (int i = 0; i < 10; i++)
            arr[i] = scan.nextInt();
        System.out.print("Enter an Element to Insert: ");
        int element = scan.nextInt();
        arr[10] = element;
        System.out.println("\nNow the new array is: ");
        for (int i : arr)
            System.out.print(i + " "); // Prints each element of arr
        scan.close();
    }
}
