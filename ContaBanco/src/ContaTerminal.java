import java.util.Scanner;

/**
 * <h1>ContaTerminal</h1>
 * <p>
 * A ContaTerminal realiza a captura de dados do cliente para a abertura da conta bancária.
 * </p>
 * <p>
 * <b>Note:</b> Leia atentamente a documentação desta classe para desfrutar dos
 * recursos oferecidos pelo autor.
 * </p>
 * 
 * @author Ana Amália Fontanari Barboza
 * @version 1.0
 * @since 16/05/2024
 */

public class ContaTerminal {
    public static void main(String[] args){
       
        // Criação do objeto Scanner para receber entradas do usuário.
        Scanner scanner = new Scanner(System.in);

        // Mensagens enviadas via terminal para o cliente inserir os dados solicitados.
        System.out.println("Por favor, digite o número da Agência!");
        String agencia = scanner.nextLine()

        System.out.println("Por favor, digite o número da Conta!");
        int numero = scanner.nextInt();
        scanner.nextLine();  

        System.out.println("Por favor, digite o nome do Cliente!");
        String nomeCliente = scanner.nextLine();

        System.out.println("Por favor, digite o saldo da Conta!");
        double saldo = scanner.nextDouble();

        // Exibir a mensagem final com os dados capturados
        String mensagem = "Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " +
                agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.";
        
        System.out.println(mensagem);
    }
}



