package lt.gerasimovas.simple_tasks;

public class IntPalindrome {
    public static void main(String[] args) {
//        System.out.println(isPalindromeUsingStringBuilder(-110));
        System.out.println(isPalindrome(123));
    }

    public static boolean isPalindromeUsingStringBuilder(int x) {
        StringBuilder str = new StringBuilder(x + "");
        return String.valueOf(str).equals(String.valueOf(str.reverse()));
    }

    public static boolean isPalindrome(int x) {
        int r, sum = 0, temp;

        temp = x;
        while (x > 0) {
            r = x % 10;  //getting remainder
            sum = (sum * 10) + r;
            x = x / 10;
        }
        if (temp == sum){
            return true;
        } else {
            return false;
        }

    }
}
