package lt.gerasimovas.teorijaiPasikartoti.access_modifuer.second_package;

public class AccModif {

    public AccModif() {
    }

    void sayPackagePrivateHello(){
        System.out.println("Hello");
    }

    private void privateHello(){
        System.out.println("Private hello");
    }

    protected void protectedHello(){
        System.out.println("Protected Hello");
    }

    public void publicHello(){
        System.out.println("public");
    }

    public void test(){
        protectedHello();
        sayPackagePrivateHello();
        privateHello();
        publicHello();
    }

}
