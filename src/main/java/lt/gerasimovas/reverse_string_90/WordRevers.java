package lt.gerasimovas.reverse_string_90;

public class WordRevers {
    public static void main(String[] args) {
        String firstWord = "Hello";

        System.out.println(reverseWord(firstWord));
    }

    public static String reverseWord(String word) {
        char[] characters = word.toCharArray();
        int left = 0;
        int right = characters.length - 1;

        while (left < right){
            char temp = characters[left];
            characters[left] = characters[right];
            characters[right] = temp;
            left++;
            right--;
        }

        return new String(characters);
    }
}
