package ativi4;

public class IPI implements Imposto {

    private double valor;

    public IPI(double valor) {
        this.valor = valor;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    @Override
    public double calcularImposto() {
        return valor / 100 * 5;
    }

    @Override
    public String descricao() {
        return "IPI";
    }
}
