package ProgII.Aula03.Lista3;

import java.util.Scanner;

public class Teste {

    public static void main(String[] args)
            throws RangeTemperatura, TanqueVazioException, TanqueInsuficienteException, TanqueCheioException {
        // ArCondicionado ar = new ArCondicionado(30);

        // ar.aumentaTemperatura(30);
        // ar.aumentaTemperatura(3);
        // ar.diminuiTemperatura(20);

        // Exercício 3

        // Aumenta Temperatura
        try {
            ArCondicionado AC = new ArCondicionado(23);
            Scanner teclado = new Scanner(System.in);
            System.out.println("A temperatura atual é " + AC.getTemperaturaAtual());
            System.out.println("Informe o valor para subir a temperatura (MAX: 32ºC): ");
            AC.aumentaTemperatura(teclado.nextDouble());

            if (AC.getTemperaturaAtual() > 32) {
                RangeTemperatura rt = new RangeTemperatura("Valor acima da temperatura permitida.");
                throw rt;
            }

        } catch (RangeTemperatura rt) {
            System.out.println(rt.toString());
        }

        // // Diminui Temperatura
        try {
            ArCondicionado AC = new ArCondicionado(20);
            Scanner teclado = new Scanner(System.in);
            System.out.println("A temperatura atual é " + AC.getTemperaturaAtual());
            System.out.println("Informe o valor para diminuir a temperatura (MIN: 16º):");
            AC.diminuiTemperatura(teclado.nextDouble());

            if (AC.getTemperaturaAtual() < 16) {
                RangeTemperatura rt = new RangeTemperatura("Valor abaixo da temperatura permitida.");
                throw rt;
            }

        } catch (RangeTemperatura rt) {
            System.out.println(rt.toString());
        }

        // Exercício 5
        Carro c = new Carro(100, 60, 10);
        Scanner teclado = new Scanner(System.in);
        System.out.println(
                "Nivel de combustível: " + c.getNivelCombustivel() + "\nCapacidade Máxima: " + c.getCapacidadeMax());
        System.out.println("Informe a quantidade de combustível que deseja encher:");
        c.encherTanque(teclado.nextDouble());
        System.out.println("Carro irá percorrer " + c.distanciaPossivel() + "km.");
        System.out.println("Carro necessita de " + c.combustivelGasto(1500) + "L para percorrer esta distância.");
        c.andar(600);
        c.andar(10);

    }

}
