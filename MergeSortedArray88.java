import java.util.Arrays;

public class MergeSortedArray88 {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int finalSize = m + n;
        int[] initNums1 = nums1;

        int indexForRes = 0;
        for (int i = 0; i < finalSize; i++) {
            int previous = indexForRes - 1;

            if (m > i && initNums1[i] != 0) {
                if (previous >= 0 && initNums1[i] < nums1[previous]) {
                    nums1[indexForRes] = nums1[previous];
                    nums1[previous] = initNums1[i];
                } else {
                    nums1[indexForRes] = initNums1[i];
                }

                indexForRes++;
            }

            if (n > i && indexForRes < finalSize) {
                nums1[indexForRes] = nums2[i];
                indexForRes++;

                if (previous >= 0 && nums2[i] < nums1[previous]) {
                    nums1[indexForRes] = nums1[previous];
                    nums1[previous] = nums2[i];
                } else {
                    nums1[indexForRes] = nums2[i];
                }

                indexForRes++;
            }
        }

        System.out.println(Arrays.toString(nums1));
    }

    public static void main(String[] args) {
        merge(new int[]{1, 2, 3, 0, 0, 0}, 3, new int[]{2, 5, 6}, 3);
    }
}
