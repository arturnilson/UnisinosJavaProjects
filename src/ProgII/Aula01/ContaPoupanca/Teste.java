package ProgII.Aula01.ContaPoupanca;

public class Teste {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria(12345);
        ContaPoupanca contaP = new ContaPoupanca(12345, 0.5);

        conta.consultaSaldo();
        conta.deposita(250);
        conta.consultaSaldo();
        conta.retira(30);
        conta.consultaSaldo();

        contaP.deposita(150);
        contaP.creditaRendimento();
        System.out.println(contaP.getSaldo());
    }

}
