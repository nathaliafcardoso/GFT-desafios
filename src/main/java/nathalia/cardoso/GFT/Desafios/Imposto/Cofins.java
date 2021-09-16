package nathalia.cardoso.GFT.Desafios.Imposto;

public class Cofins implements Imposto {

    public double calculaImposto(double valor) {
        if (valor > 12000) {
            return valor * 0.04;
        } else {
            return valor;

        }
    }
}