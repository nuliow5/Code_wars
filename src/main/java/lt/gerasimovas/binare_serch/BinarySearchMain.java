package lt.gerasimovas.binare_serch;

public class BinarySearchMain {
    public static void main(String[] args) {

    }

    public static int binarySearch(int[] myArray, int numberToFind) {
        int low = 0;
        int height = myArray.length - 1;

        while (low <= height) {
            int middlePosition = (low + height) / 2;
            int middleNumber = myArray[middlePosition];
            if (numberToFind == middleNumber){
                return middlePosition;
            }

            if (numberToFind < middleNumber){
                height = middlePosition -1;
            } else {
                low = middlePosition +1;

            }

        }
        return -1;
    }
}
