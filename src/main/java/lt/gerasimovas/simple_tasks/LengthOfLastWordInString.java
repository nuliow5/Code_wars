package lt.gerasimovas.simple_tasks;

public class LengthOfLastWordInString {
    public static void main(String[] args) {

    }

    public static int lengthOfLastWord(String s) {
        if (s.isEmpty() || s == null){
            return 0;
        }

        StringBuilder str = new StringBuilder("");

        for (int i = s.length()-1; i >=0 ; i--) {
            if (s.charAt(i) != ' '){
                str.append(s.charAt(i));
            }
            if (str.length() != 0 && s.charAt(i) == ' '){
                break;
            }
        }

        return str.length();

    }
}
