package lt.gerasimovas.teorijaiPasikartoti.access_modifuer.second_package;

public interface Interfeisas {
    static void helloFromInterface() {
        System.out.println("hello from interface");
    }

    default void helloFromInterface1() {
        System.out.println("hello from interface1");
    }

}
