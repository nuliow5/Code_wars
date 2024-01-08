package lt.gerasimovas.simple_tasks;
/*
    https://leetcode.com/problems/merge-sorted-array/
 */
import java.util.Arrays;

public class MergeSortedArray {
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int[] nums2 = {2, 5, 6};

        merge(nums1, 3, nums2,3);

    }


    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int arrayLength = m + n;
        for (int i = m; i < arrayLength; i++) {
           nums1[i] = nums2[n-1];
           n--;

        }
        Arrays.sort(nums1);
        System.out.println(Arrays.toString(nums1));

    }
}
