import java.util.Arrays;

public class TwoArraysMedian {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n1 = nums1.length;
        int n2 = nums2.length;
        int[] merged = new int[n1 + n2];

        // Merging 2 arrays to 1 with ascending order
        int i = 0, j = 0, k = 0;

        while (i < n1 && j < n2) {
            if (nums1[i] < nums2[j]) {
                merged[k++] = nums1[i++];
            } else {
                merged[k++] = nums2[j++];
            }
        }

        while (i < n1) {
            merged[k++] = nums1[i++];
        }

        while (j < n2) {
            merged[k++] = nums2[j++];
        }

        int median = merged.length / 2;
        if (merged.length % 2 != 0) {
            return merged[median];
        } else {
            return (double) (merged[median] + merged[median - 1]) / 2;
        }
    }
}
