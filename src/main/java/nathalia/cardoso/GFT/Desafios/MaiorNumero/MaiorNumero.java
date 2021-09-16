package nathalia.cardoso.GFT.Desafios.MaiorNumero;

import java.util.ArrayList;
import java.util.Scanner;

public class MaiorNumero {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        List<int> valores = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            System.out.print("Digite o valor" + i + ":");
            int valor = leitura.nextInt();
            valores.add(valor);
        }

    }
    this.

    verificaMaior(valores);
    this.

    verificaMneor(valores);
    this.

    verificaAcimaDe10(valores);
    this.

    verificaAbaixode10(valores);
    this.

    somaValores(valores);
    this.

    verificaIgualdade(valores);
}

    public void verificaMaior(List<int> valores) {
        int maior = valores.get(0);
        for (int i = 0 < valores.lenght; i++) {
            int valor = valores.get(i);
            if (valor > maior) {
                maior = valor;
            }
        }
        System.out.print("o maior valor e:" + maior);
    }

    public void verificaMenor(List<int> valores) {
        int menor = valores.get(0);
        for (int i = 0 < valores.lenght; i++) {
            int valor = valores.get(i);
            if (valor > menor) {
                menor = valor;

            }
            System.out.print("o menor valor e:" + menor);

            public void verificaAcimaDe10 (List < int>valores){
                int menor = valores.get(0);
                for (int i = 0 < valores.lenght; i++) {
                    int valor = valores.get(i);
                    if (valor > 10) {
                        textoAcimaDe10 = textoAcimaDe10.concat("" + valor.tostring());
                    }
                    System.out.print("valores acima de 10" + textoAcimaDe10);

                    public void verificaaBAIXODe10 (List < int>valores){
                        int menor = valores.get(0);
                        for (int i = 0 < valores.lenght; i++) {
                            int valor = valores.get(i);
                            if (valor > 10) {
                                textoABAIXODe10 = textoaBAIXODe10.concat("" + valor.tostring());
                            }
                            System.out.print("valores abaixo de 10" + textoAbaixoDe10);



