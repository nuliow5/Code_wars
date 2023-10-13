package lt.gerasimovas.max_length_of_array_0_1;

public class ArrayLength {
    public static void main(String[] args) {
        int[] firstArray = {1, 1, 0, 1, 1, 1};
        int[] secondArray = {1, 1, 0, 1, 0, 1};

        System.out.println(findUninterruptedArrayLength(firstArray));
        System.out.println(findUninterruptedArrayLength(secondArray));
    }

    public static int findUninterruptedArrayLength(int[] array){
        int uninterruptedArrayLength = 0;

        for (int i=0; i < array.length; i++){
            if (array[i] ==1){
                uninterruptedArrayLength++;
            } else {
                uninterruptedArrayLength = 0;
            }
        }

        return uninterruptedArrayLength;
    }
}
