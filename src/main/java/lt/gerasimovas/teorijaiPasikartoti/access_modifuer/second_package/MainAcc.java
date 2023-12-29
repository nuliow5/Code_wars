package lt.gerasimovas.teorijaiPasikartoti.access_modifuer.second_package;

import lt.gerasimovas.teorijaiPasikartoti.access_modifuer.second_package.AccModif;

public class MainAcc extends AccModif implements Interfeisas {

    public static void main(String[] args) {
        AccModif acc = new AccModif();
        acc.protectedHello();
        acc.sayPackagePrivateHello();

        Interfeisas.helloFromInterface();

        Interfeisas inter = new Interfeisas() {
            @Override
            public void helloFromInterface1() {
                Interfeisas.super.helloFromInterface1();
            }
        };

        inter.helloFromInterface1();

    }


}
