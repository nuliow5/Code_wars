package lt.gerasimovas.simple_tasks;

public class ValidParentheses {
    public static void main(String[] args) {
        String s1 = "()[]{}";
        String s2 = "()";
        String s3 = "[[(])]";

        System.out.println(isValid(s1));
        System.out.println(isValid(s2));
        System.out.println(isValid(s3));
    }
    //todo
    public static boolean isValid(String s) {
        int countClose = 0;

        for (int i = 0; i < s.length(); i++){


            if (countClose == 0 &&  s.charAt(i) == ')' && s.charAt(i-1) == '(') {
                countClose++;
            } else if (s.charAt(i) == ')' && s.charAt(i-countClose) == '(') {
                countClose++;
            }
        }


        return false;
    }


}
