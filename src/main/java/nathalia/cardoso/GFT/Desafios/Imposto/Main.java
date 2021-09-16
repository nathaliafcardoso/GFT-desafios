package nathalia.cardoso.GFT.Desafios.Imposto;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        System.out.println("Digite um valor:");
        double valor = leitura.nextDouble();
        double icms = new ICMS().calculaImposto(valor);
        double ipi = new IPI().calculaImposto(valor);
        double cofins = new Cofins().calculaImposto(valor);

        System.out.println("Valores dos Impostos"
                + "\nICMS:" + icms
                + "\nIPI:" + ipi
                + "\nnCOFINS:" + cofins
                + "\nValor Total dos Impostos:" + (icms + ipi + cofins));
    }
}
