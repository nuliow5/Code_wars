package lt.gerasimovas.teorijaiPasikartoti;

public class StringAsImmutableClass {
    public static void main(String[] args) {
        String str1 = "labas";
        String str2 = "labas";

        System.out.println("...");
        System.out.println((str1+"1").equals("labas1")); //true

        str1 = str1 + "NE";

        System.out.println(str1);

        System.out.println(str1.equals(str2));
    }
}
