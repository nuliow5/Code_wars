package lt.gerasimovas.teorijaiPasikartoti.equal_and_hashCode;

public class MainPerson {
    public static void main(String[] args) {
        Person person1 = new Person("Antanas", "Vyras");
        Person person2 = new Person("Antanas", "Vyras");
        Person person3 = new Person("Ona", "Moteris");

        System.out.println(person1.equals(person2));

        printInformation(person1.toString());
        printInformation(person2.toString());
        printInformation(person3.toString());





    }

    public static void printInformation(String text){
        System.out.println(text);
    }






}
