package atividade4;

import java.util.ArrayList;
import java.util.List;

public class Pagamentos{

    private String nomeEmpresa;
    private List<Imposto> impostos = new ArrayList<>();

    public Pagamentos(String nomeEmpresa) {
        this.nomeEmpresa = nomeEmpresa;
    }
 
    public String getNomeEmpresa() {
        return nomeEmpresa;
    }

    public void setNomeEmpresa(String nomeEmpresa) {
        this.nomeEmpresa = nomeEmpresa;
    }

    public ArrayList<Imposto> getImpostos() {
        return (ArrayList<Imposto>) impostos;
    }

    public void setImpostos(ArrayList<Imposto> impostos) {
        this.impostos = impostos;
    }

    public void addImpostos(Imposto imposto) {
        impostos.add(imposto); 
    }
    
    public void listarImpostos(){
        for (int i = 0; impostos.size() < 10; i++) {
            System.out.println(impostos);
            System.out.println(nomeEmpresa);
        }
    }
    
}
