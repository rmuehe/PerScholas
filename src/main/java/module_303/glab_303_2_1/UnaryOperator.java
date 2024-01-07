package glab_303_2_1;

public class UnaryOperator {

    // Plus operator:  unboxes and promotes numbers to int.
    // Keeps the same value. Equivalent to prepending with (int).

    // Increment Operator - It will increment the value by 1.
    // This operator can be used as a post-increment and as a pre-increment.
    // Post increment: uses the current value and then perform the incrementation.
    // Pre-increment: performs the incrementation and then use the value.

    /* Decrement Operator - It will decrement the value by 1
    This operator also has two use cases.
    The first is post-decrement, the second is pre-increment.
    Post-decrement: value is first used, then the computation is performed.
    Pre-decrement:  the computation or the value is first decremented, then used.*/

    public static void main(String[] args)
    {
        byte originalByte = 1;
        int promotedValue = +originalByte; // Unary plus operator applied

        System.out.println("Original byte value: " + originalByte);
        System.out.println("Promoted int value: " + promotedValue);

        try {
            // Using reflection to get the class of the variable
            Class<?> clazz = ((Object)promotedValue).getClass();
            System.out.println("Class of promoted value: " + clazz.getName());
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        }

        int sum = +1;

        sum--;
        // sum is now 0
        System.out.println(sum);

        sum++;
        // sum is now 1
        System.out.println(sum);

        // sum = -sum;
        // sum is now -1
        System.out.println(sum);

        boolean result = false;
        // false
        System.out.println(result);
        // true
        System.out.println(!result);
    }
}
