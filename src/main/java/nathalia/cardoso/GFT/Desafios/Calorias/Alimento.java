package nathalia.cardoso.GFT.Desafios.Calorias;

import java.util.ArrayList;
import java.util.Scanner;

public class Alimento {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        System.out.print("digite a quantidade de calorias:");
        int metaCalorica = leitura.nextInt();

        boolean
        List<int> listaDeCalorias = new ArrayList<>();
        System.out.print(" **** Alimentos Consumidos ****");
        do {
            System.out.print("Nome do alimento:");
            String nomeDoAlimento = leitura.next();
            if (nomeDoAlimento.equals("sair")) {
                boolean estaEmLooping = false;
            } else {
                System.out.print("Quantidade:");
                int quantidadeDeCalorias = leitura.nextInt();
                listaDeCalorias.add(quantidadeDeCalorias);
            }
        } while (estaEmLooping);
        System.out.print("------------");

        int soma = 0;
        for (int valor : numeros) {
            soma += valor;
        }

        String textoDaNota = "";
        if (soma > metaCalorica) {
            meta = "acima da meta";
        } else {
            meta = "abaixo da meta";
        }

        System.out.print("Voce consumiu" + soma + " e a caloria ficou" + meta);


    }
}


