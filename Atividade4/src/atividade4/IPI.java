package atividade4;

import java.util.Scanner;

public class IPI extends ImpostoBase {

    private double produto;
    private double frete;
    private double seguro;
    private double despesas;
    private double aliquota;

    public double getProduto() {
        return produto;
    }

    public void setProduto(double produto) {
        this.produto = produto;
    }

    public double getFrete() {
        return frete;
    }

    public void setFrete(double frete) {
        this.frete = frete;
    }

    public double getSeguro() {
        return seguro;
    }

    public void setSeguro(double seguro) {
        this.seguro = seguro;
    }

    public double getDespesas() {
        return despesas;
    }

    public void setDespesas(double despesas) {
        this.despesas = despesas;
    }

    public double getAliquota() {
        return aliquota;
    }

    public void setAliquota(double aliquota) {
        this.aliquota = aliquota;
    }
    
    @Override
    public void cadastrarImposto() {
        Scanner s = new Scanner(System.in);
        
        System.out.println("Qual o valor do produto ?");
        double produto = s.nextDouble();
        setProduto(produto);

        System.out.println("Qual o valor do frete ?");
        double frete = s.nextDouble();
        setFrete(frete);

        System.out.println("Qual o valor do seguro?");
        double seguro = s.nextDouble();
        setSeguro(seguro);

        System.out.println("Qual o valor das despesas?");
        double despesas = s.nextDouble();
        setDespesas(despesas);

        System.out.println("Porcentagem da aliquota :");
        double aliquota = s.nextDouble();
        setAliquota(aliquota);
    }

    @Override
    public double getBaseCalculo() {
        return produto + frete + seguro + despesas + aliquota;
    }

    @Override
    public double calcular() {
        return (getBaseCalculo() * getAliquota()) / 100;
    }

    @Override
    public String getDescricao() {
        return "IPI";
    }
}
