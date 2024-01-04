package lt.gerasimovas.simple_tasks;

public class SearchInsertPosition {
    public static void main(String[] args) {
        int[] numbers = {1, 3, 5, 6};  //target 5
        int[] numbers1 = {1, 3};  //target 2


        System.out.println(searchInsert(numbers, 5)); // 2
        System.out.println(searchInsert(numbers, 2)); // 1
        System.out.println(searchInsert(numbers, 7)); // 4
        System.out.println(searchInsert(numbers1, 2)); // 1

    }


    public static int searchInsert(int[] nums, int target) {

        if (nums == null || nums.length == 0) {
            return 0;
        }

        int low = 0;
        int height = nums.length - 1;

        while (low <= height) {

            int mid = (low + height) / 2;

            if (target == nums[mid]) {
                return mid;
            } else if (target < nums[mid]) {
                height = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return low;
    }


}
