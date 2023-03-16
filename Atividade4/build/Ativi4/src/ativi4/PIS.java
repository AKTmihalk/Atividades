
package ativi4;


public class PIS implements Imposto{
    private double valor;
    
    PIS(double valor){
        this.valor = valor;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double debito, double credito) {
        this.valor = debito - credito;
    }
    
    @Override
    public double calcularImposto(){
        return valor / 100 * 1.65;
    }
    
    @Override
    public String descricao(){
        return "PIS";
    }
}
