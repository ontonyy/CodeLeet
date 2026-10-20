package interviews;

public class TwoPointers {
    public static int[] sumOfTwoPointersEqualsTarget(final int[] nums, final int target) {
        int left = 0;
        int right = nums.length - 1;

        while (left < right) {
            final int sum = nums[left] + nums[right];

            if (sum == target) {
                return new int[]{left, right};
            }

            if (sum < target) {
                left++;
            } else {
                right--;
            }
        }

        return new int[]{0};
    }
}
