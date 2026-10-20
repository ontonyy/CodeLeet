package interviews;

import java.util.Arrays;

public class SlidingWindow {
    public static int[] maxSumOfNumbersLengthK(final int[] numbers, int k) {
        if (numbers == null || numbers.length < k) {
            return new int[0];
        }

        int windowSum = 0;
        int sum = Integer.MIN_VALUE;
        int startIndex = 0;

        for (int i = 0; i < numbers.length; i++) {
            windowSum += numbers[i];

            if (i >= k - 1) {
                if (windowSum > sum) {
                    sum = windowSum;
                    startIndex = i - k + 1;
                }
                windowSum -= numbers[i - k + 1];
            }
        }

        return Arrays.copyOfRange(numbers, startIndex, startIndex + k);
    }

    public static int[] longestSubArrayWithSumLessThanK(final int[] numbers, int k) {
        int left = 0;
        int windowSum = 0;

        int len = 0;
        int start = 0;

        for (int right = 0; right < numbers.length; right++) {
            windowSum += numbers[right];

            while (windowSum > k) {
                windowSum -= numbers[left];
                left++;
            }

            int currentLen = right - left + 1;

            if (currentLen > len) {
                len = currentLen;
                start = left;
            }

        }

        return Arrays.copyOfRange(numbers, start, start + len);
    }
}
// Complexity: O(n)
