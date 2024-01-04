package lt.gerasimovas.teorijaiPasikartoti.exception;

import java.util.Scanner;

public class ExceptionMain {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)){
            String newValue = scanner.next();
        } catch (Exception e){
            new Error("123");
        }
    }
}
