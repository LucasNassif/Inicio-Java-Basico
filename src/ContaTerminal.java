import java.util.Scanner;
    public class ContaTerminal {
    public static void main(String[] args){
        //TODO: Conhecer e importar a classe scanner
            Scanner Scanner = new Scanner(System.in);
            
            double saldo = 15;
            double valor_solicitado = 22;
        
        // Exibir as mensagem para o nosso usuário
        System.out.print("Escreva o valor que deseja");

            valor_solicitado = Scanner.nextDouble();
        if (saldo>valor_solicitado) {
            saldo = saldo-valor_solicitado;
            System.out.println("O seu saldo atual é R$ "+ saldo);
        }else if (saldo<valor_solicitado) {
            System.out.println("Saldo insuficiente");
        } 
        }
    }
