package lt.gerasimovas.simple_tasks;

import lt.gerasimovas.teorijaiPasikartoti.finalaze.FinalizeExample;

public class Gc {
    public static void main(String[] args) {
        FinalizeExample obj = new FinalizeExample();
        // printing the hashcode
        System.out.println("Hashcode is: " + obj.hashCode());
        obj = null;
        // calling the garbage collector using gc()

        System.gc(); //if garbage collector activate, calling finalize() method
        System.out.println("End of the garbage collection");
    }

    // defining the finalize method
    protected void finalize() {
        System.out.println("Called the finalize() method");
    }
}
