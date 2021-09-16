package nathalia.cardoso.GFT.Desafios.Imposto;

public class ICMS implements Imposto {

    public double calculaImposto(double valor) {
        return valor * 0.24;
    }
}
