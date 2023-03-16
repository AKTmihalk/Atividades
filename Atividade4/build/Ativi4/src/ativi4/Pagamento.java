
package ativi4;

import java.util.ArrayList;
import java.util.List;

public class Pagamento {
    
    private String nomeEmpresa;
    private List<Imposto> imposto = new ArrayList<>();

    public Pagamento(String nomeEmpresa) {
        this.nomeEmpresa = nomeEmpresa;
    }
    
    Pagamento(){
        
    }
    
    public void addImposto(Imposto imposto){
        this.imposto.add(imposto);
    }
    
    public void descreverImposto(){
        double total = 0;
        
        for (Imposto a: imposto) {
            total += a.calcularImposto();
            System.out.printf("\n%s: R$ %.2f", a.descricao(), a.calcularImposto());
        }
        System.out.printf("\nTOTAL: R$ %.2f", total);
    }
}
