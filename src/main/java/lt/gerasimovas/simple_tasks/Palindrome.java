package lt.gerasimovas.simple_tasks;

public class Palindrome {
    public static void main(String[] args) {
        String firstWord = "1112";
        System.out.println(isPalindromeWithBuilder(firstWord));
    }

    public static boolean isPalindromeWithBuilder (String word){
        StringBuilder stringBuilder = new StringBuilder(word.toLowerCase());

        return String.valueOf(stringBuilder).equals(String.valueOf(stringBuilder.reverse()));

    }
}
