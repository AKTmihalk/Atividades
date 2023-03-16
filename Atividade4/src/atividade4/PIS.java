package atividade4;

import java.util.Scanner;

public class PIS extends ImpostoBase {

    private double debito;
    private double credito;

    public double getDebito() {
        return debito;
    }

    public void setDebito(double debito) {
        this.debito = debito;
    }

    public double getCredito() {
        return credito;
    }

    public void setCredito(double credito) {
        this.credito = credito;
    }

    @Override
    public double getBaseCalculo() {
        return debito - credito;
    }

    @Override
    public String getDescricao() {
        return "PIS";
    }

    @Override
    public double calcular() {
        return getBaseCalculo() * 0.0165;
    }

    @Override
    public void cadastrarImposto() {
        Scanner s = new Scanner(System.in);
        
        System.out.println("Qual o valor de DEBITO: ");
        double valorDebito = s.nextDouble();
        setDebito(valorDebito);

        System.out.println("Qual o valor de CREDITO: ");
        double valorCredito = s.nextDouble();
        setCredito(valorCredito);
    }
}
