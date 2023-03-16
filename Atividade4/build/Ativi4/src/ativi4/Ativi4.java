package ativi4;

import java.util.Scanner;

public class Ativi4 {

    public static double valorPIS(double debito, double credito) {
        return debito - credito;
    }

    public static double valorIPI(double produto, double frete, double seguro, double despesas) {
        return produto + frete + seguro + despesas;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int opcao = 0;

        System.out.println("Qual seria o nome da empresa ?");
        String nomeEmpresa = input.next();

        Pagamento pagamento = new Pagamento(nomeEmpresa);

        do {
            System.out.println("1 - Calcular | 2 - Total | 3 - Sair ");
            System.out.println("-------Escolha a melhor opção-------");
            opcao = input.nextInt();
            System.out.println("\n");

            if (opcao == 1) {

                opcao = 0;
                System.out.println("Qual imposto gostaria de cadastrar ?");
                System.out.println("\n (1)PIS" + "\n (2)IPI");
                opcao = input.nextInt();

                if (opcao == 1) {
                    System.out.println("==PIS==");
                    System.out.println();
                    System.out.println("Total debito: R$ ");
                    double debito = input.nextDouble();

                    System.out.println("Total Credito: R$ ");
                    double credito = input.nextDouble();

                    double valor = valorPIS(debito, credito);
                    pagamento.addImposto(new PIS(valor));
                    System.out.println("Cadastro concluído");
                }
                else if(opcao == 2){
                    System.out.println("==IPI==");
                    System.out.println();
                    System.out.println("== Valores ==");
                    System.out.println();
                    
                    System.out.println("Qual o valor do produto ?");
                    double produto = input.nextDouble();
                    System.out.println("Qual o valor do frete ?");
                    double frete = input.nextDouble();
                    System.out.println("Qual o valor do seguro ?");
                    double seguro = input.nextDouble();
                    System.out.println("Qual o valor das despesas ?");
                    double despesas = input.nextDouble();
                    
                    double valor = valorIPI(produto,frete,seguro,despesas);
                    pagamento.addImposto(new IPI(valor));
                    System.out.println("Cadastro concluído");
                }
                
            }else if(opcao == 2){
                pagamento.descreverImposto();
                System.out.println();
                System.out.println("Digite enter para sair");
                input.nextLine();input.nextLine();
               
            }else if(opcao == 3){
                break;
            }
        } while (opcao != 3);

        input.close();

    }

}
