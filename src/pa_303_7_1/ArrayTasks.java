package pa_303_7_1;

import java.util.Arrays;

public class ArrayTasks {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }

    /* Task 1: Write a program that creates an array of integers
     with a length of 3. Assign the values 1, 2, and 3 to the indexes.
     Print out each array element. */

    private static void task1() {
        int[] array3 = new int[3];
        array3[0] = 1;
        array3[1] = 2;
        array3[2] = 3;
        for (int item: array3) {
            System.out.print(item + " "); // 1 2 3
        }
        System.out.println("\n");
    }

    /* Task 2: Write a program that returns the middle element in an array.
    Give the following values to the integer array: {13, 5, 7, 68, 2}
    and produce the following output: 7 */

    private static int task2() {
        int[] array5 = {13, 5, 7, 68, 2};
        System.out.println(array5[2]); // 7
        return array5[2];
    }

    /* Task 3: Write a program that creates an array of String type and
    initializes it with the strings “red,” “green,” “blue,” and “yellow.”
    Print out the array length. Make a copy using the clone( ) method.
    Use the Arrays.toString( ) method on the new array to verify
    that the original array was copied. */

    private static void task3() {
        String[] str4 = {"red", "green", "blue", "yellow"};
        System.out.println("string has a length of " + str4.length); // 4
        String[] str4Copy = str4.clone();
        String str4str = Arrays.toString(str4);
        str4[3] = "purple";
        System.out.println("Array copy is: " + str4str);
        System.out.println("Original array is: " + Arrays.toString(str4));
    }



    /* Task 4: Write a program that creates an integer array with 5 elements.
     The numbers can be any integers.
     Print out the value at the first index and the last index using length - 1.
     Now try printing the value at index = length (e.g., myArray[myArray.length] ).
     Notice the type of exception which is produced.
     Now try to assign a value to the array index 5.
     You should get the same type of exception. */

    private static void task4() {

    }

    /* Task 5: Write a program where you create an integer array with a length of 5. Loop through the array and assign the value of the loop control variable (e.g., i) to the corresponding index in the array.

Task 6: Write a program where you create an integer array of 5 numbers. Loop through the array and assign the value of the loop control variable multiplied by 2 to the corresponding index in the array.

Task 7: Write a program where you create an array of 5 elements. Loop through the array and print the value of each element, except for the middle (index 2) element.

Task 8: Write a program that creates a String array of 5 elements and swaps the first element with the middle element without creating a new array.

Task 9:
Write a program to sort the following int array in ascending order: {4, 2, 9, 13, 1, 0}. Print the array in ascending order, and print the smallest and the largest element of the array. The output will look like the following:
Array in ascending order: 0, 1, 2, 4, 9, 13
The smallest number is 0
The biggest number is 13
Task 10: Create an array that includes an integer, 3 strings, and 1 double. Print the array.
Task 11: Write some Java code that asks the user how many favorite things they have. Based on their answer, you should create a String array of the correct size. Then ask the user to enter the things and store them in the array you created. Finally, print out the contents of the array.


Example
How many favorite things do you have?
7
*/
}
