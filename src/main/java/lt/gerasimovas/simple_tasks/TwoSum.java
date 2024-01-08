package lt.gerasimovas.simple_tasks;


import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/*
Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
You may assume that each input would have exactly one solution, and you may not use the same element twice.
You can return the answer in any order.

Example 1:
Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].

Example 2:
Input: nums = [3,2,4], target = 6
Output: [1,2]

Example 3:
Input: nums = [3,3], target = 6
Output: [0,1]
 */
public class TwoSum {
    public static void main(String[] args) {
        int[] firstArray = {2, 7, 11, 15}; //target 9

        int[] secondArray = {3, 2, 4}; //target 6


        int[] result = twoSum(firstArray, 9);
//        System.out.println(Arrays.toString(result));

        //-----------------
        int[] array3 = {-7, 0, 2, 3, 6, 8, 10, 15, 18, 20};
        System.out.println(Arrays.toString(twoSumUsingBinarySearch(array3, 10)));
        System.out.println(Arrays.toString(twoSumUsingBinarySearch(firstArray, 9)));
        System.out.println("--------------");
        System.out.println(Arrays.toString(twoSumUsingBinarySearch2(array3, 10)));
        System.out.println(Arrays.toString(twoSumUsingBinarySearch2(firstArray, 9)));


    }

    public static int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {

                if (nums[i] + nums[j] == target) {
                    result[0] = i;
                    result[1] = j;

                }
            }
        }
        return result;
    }


    /*
        laikas:  O(n)
        atmintis O(n)
    */
    public static int[] twoSumUsingSet(int[] nums, int target) {
        Set<Integer> setNumbers = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            int numberToFind = target - nums[i];
            if (setNumbers.contains(numberToFind)) {
                return new int[]{nums[i], numberToFind};
            } else {
                setNumbers.add(nums[i]);
            }
        }

        return new int[0];
    }

    //Array must be sorted.
    public static int[] twoSumUsingBinarySearch(int[] nums, int target) {

        for (int i = 0; i < nums.length; i++) {
            int numberToFind = target - nums[i];
            int start = i;
            int end = nums.length - 1;

            while (start <= end) {
                int middle = (start + end) / 2;

                if (nums[middle] == numberToFind) {
                    return new int[]{nums[i], numberToFind};
                }

                if (numberToFind < middle) {
                    end = middle - 1;
                    ;
                } else {
                    start = middle + 1;
                }
            }

        }

        return new int[0];
    }

    public static int[] twoSumUsingBinarySearch2(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            int isTarget = nums[start] + nums[end];
            if (isTarget == target) {
                return new int[]{nums[start], nums[end]};
            }

            if (isTarget > target) {
                end--;
            } else {
                start++;
            }
        }

        return new int[0];
    }

}
