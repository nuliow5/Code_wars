package lt.gerasimovas.simple_tasks;

public class StringArrayEqual {
    public static void main(String[] args) {
        String[] array1 = {"a", "b", "c"};
        String[] array2 = {"ab", "c"};

        //test
        System.out.println(doesConvertedArraysToStringIsEqual(array1, array2));
    }

    public static boolean doesConvertedArraysToStringIsEqual(String[] firstArray, String[] secondArray){
        return convertStringArrayToString(firstArray).equals(convertStringArrayToString(secondArray));
    }

    public static String convertStringArrayToString(String[] array){
        StringBuilder str = new StringBuilder("");
        for (String element : array){
            str.append(element);
        }
        return str.toString();
    }
}
