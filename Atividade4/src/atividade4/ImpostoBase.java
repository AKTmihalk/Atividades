package atividade4;

public abstract class ImpostoBase implements Imposto {

    private double baseCalculo;
    private double aliquota;

    public double getBaseCalculo() {
        return baseCalculo;
    }

    public void setBaseCalculo(double baseCalculo) {
        this.baseCalculo = baseCalculo;
    }

    public double getAliquota() {
        return aliquota;
    }

    public void setAliquota(double aliquota) {
        this.aliquota = aliquota;
    }

    @Override
    public double calcular (){
        return 0;
    }
    @Override
    public String getDescricao() {
        return "";
    }
    
    public void cadastrarImposto() {
        
    }
}
