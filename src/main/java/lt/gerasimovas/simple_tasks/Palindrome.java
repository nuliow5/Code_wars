package lt.gerasimovas.simple_tasks;

public class Palindrome {
    public static void main(String[] args) {
        String firstWord = "aarraa";
        System.out.println(isPalindromeWithBuilder(firstWord));
    }

    public static boolean isPalindromeWithBuilder (String word){
        StringBuilder stringBuilder = new StringBuilder(word.toLowerCase());
        if (stringBuilder.reverse().equals(stringBuilder)){
            return true;
        }
        return false;
    }
}
