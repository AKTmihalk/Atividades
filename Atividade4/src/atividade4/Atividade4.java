package atividade4;

import java.util.ArrayList;
import java.util.Scanner;

public class Atividade4 {
    

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        String impostoNome = "";

        PIS pis = new PIS();
        IPI ipi = new IPI();
        
        ArrayList<Pagamentos> pagamentos = new ArrayList();
        
        System.out.println("Qual é o imposto para cadastrar :");
        impostoNome = s.next();
        
        do{
            if (impostoNome.equalsIgnoreCase(pis.getDescricao())) {
                    
                System.out.println("O valor do imposto é " + pis.calcular());
                
            } else if (impostoNome.equalsIgnoreCase(ipi.getDescricao())) {
                
                ipi.cadastrarImposto();
                System.out.println("O valor do imposto é " + ipi.calcular());
            }
            
            System.out.println("Caso queira incluir mais imposto digite o nome do imposto,"
                    + "caso queria parar digite 'pare': ");
            impostoNome = s.next();
            
            
        }while(!impostoNome.equalsIgnoreCase("pare"));
    }
}
