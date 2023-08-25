package lt.gerasimovas.break_camelCase;

public class BreakCamelCase {
    public static void main(String[] args) {
        String str1 = "camelCasing";
        String str2 = "identifier";
        String str3 = "";

        System.out.println(camelCase(str1));
        System.out.println(camelCase(str2));
        System.out.println(camelCase(str3));

    }

    public static String camelCase(String input) {
        String result = "";
        for (int i = 0; i < input.length(); i++) {
            if (Character.isUpperCase(input.charAt(i))) {
                result += " " + input.charAt(i);
            } else {
                result += input.charAt(i);
            }
        }
        return result;
    }
}
