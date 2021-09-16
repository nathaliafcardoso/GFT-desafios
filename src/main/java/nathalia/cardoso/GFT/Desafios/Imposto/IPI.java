package nathalia.cardoso.GFT.Desafios.Imposto;

public class IPI implements Imposto {

    public double calculaImposto(double valor) {
        if (valor < 20000) {
            return valor * 0.05;
        } else {
            return valor * 0.11;

        }
    }
}

