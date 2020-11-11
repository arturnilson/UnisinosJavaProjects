package LabII.ExemploCelular.testes;

import LabII.ExemploCelular.eletronicos.Celular;
import LabII.ExemploCelular.eletronicos.SistemaOperacional;

public class CelularTeste {
    public static void main(String[] args) {
        Celular c1 = new Celular("A7", "Samsung", SistemaOperacional.ANDROID);

        c1.instala(0, "Twitter");
        c1.instala(1, "Whatsapp");

        String[] apps = c1.getApps();
        for (int indx = 0; indx < apps.length; indx++) {
            if (apps[indx] != null) {
                System.out.println(apps[indx]);
            }
        }
    }
}
