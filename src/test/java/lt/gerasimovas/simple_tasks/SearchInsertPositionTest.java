package lt.gerasimovas.simple_tasks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SearchInsertPositionTest {
    private SearchInsertPosition searchInsertPosition;
    @Test
    void searchInsertIfTargetInArray() {
        int[] numbers = {1,3,5,6};
        int target = 5;

        int result = searchInsertPosition.searchInsert(numbers, target);
        assertEquals(2, result);
    }
    @Test
    void searchInsertIfTargetIsNotInArray() {
        int[] numbers = {1,3,5,6};
        int target = 2;

        int result = searchInsertPosition.searchInsert(numbers, target);
        assertEquals(1, result);
    }
    @Test
    void searchInsertIfTargetIsOutOfArray() {
        int[] numbers = {1,3,5,6};
        int target = 7;

        int result = searchInsertPosition.searchInsert(numbers, target);
        assertEquals(4, result);
    }

    @Test
    void searchInsertIfTargetZero() {
        int[] numbers = {1,3,5,6};
        int target = 0;

        int result = searchInsertPosition.searchInsert(numbers, target);
        assertEquals(0, result);
    }

    @Test
    void searchInsertIfTargetNotInArray2() {
        int[] numbers = {1,3};
        int target = 2;

        int result = searchInsertPosition.searchInsert(numbers, target);
        assertEquals(1, result);
    }

    @Test
    void searchInsertIfTargetInArray2() {
        int[] numbers = {1,3, 5};
        int target = 1;

        int result = searchInsertPosition.searchInsert(numbers, target);
        assertEquals(0, result);
    }
    @Test
    void searchInsertIfTargetNotInArray3() {
        int[] numbers = {1, 3, 5};
        int target = 4;

        int result = searchInsertPosition.searchInsert(numbers, target);
        assertEquals(2, result);
    }
}