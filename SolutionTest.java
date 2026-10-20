import java.util.Arrays;

import interviews.SlidingWindow;

public class SolutionTest {
    public static void main(String[] args) {
        testSlidingWindow();
    }

    private static void testSlidingWindow() {
        int[] numbers = new int[]{1, 2, 4, 1, 3, 2, 1};
        final int[] calculated = SlidingWindow.maxSumOfNumbersLengthK(numbers, 3);
        System.out.println("Calculated int: " + Arrays.toString(calculated));
    }
}
