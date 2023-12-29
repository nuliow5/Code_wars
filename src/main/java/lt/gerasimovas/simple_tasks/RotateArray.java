package lt.gerasimovas.simple_tasks;

import java.util.Arrays;

/*
Given an integer array nums, rotate the array to the right by k steps, where k is non-negative.

Example 1:

Input: nums = [1,2,3,4,5,6,7], k = 3
Output: [5,6,7,1,2,3,4]
Explanation:
rotate 1 steps to the right: [7,1,2,3,4,5,6]
rotate 2 steps to the right: [6,7,1,2,3,4,5]
rotate 3 steps to the right: [5,6,7,1,2,3,4]
 */
public class RotateArray {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7};
        int[] numbers2 = {-1, -100, 3, 99};

        rotate(numbers, 3); // [5,6,7,1,2,3,4]
        rotate(numbers2, 2); //[3,99,-1,-100]
    }

    public static void rotate(int[] nums, int k) {

        for (int j = 0; j < k; j++) {
            int tempLastElement = nums[nums.length - 1];
            for (int i = nums.length - 1; i > 0; i--) {
                nums[i] = nums[i - 1];
                if (i == 1) {
                    nums[0] = tempLastElement;
                }
            }
        }

        System.out.println(Arrays.toString(nums));
    }

}
