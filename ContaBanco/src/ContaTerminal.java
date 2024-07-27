import java.util.Locale;
import java.util.Scanner;


public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        // TODO: Conhecer e importar a classe Scanner;

        // Exibir as mensagens para o usuário;
        
        // Obter os valores digitados no terminal através do método scanner;

        // Exibir a mensagem da conta criada


        //...


        System.out.println("\nOlá, boas vindas!\nPor favor, insira os seguintes dados para criar a sua conta:");


        // Criando o objeto scanner:
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);


        // Solicitando os dados para criar a conta:
        System.out.println("\nDigite o número da conta: ");
        int conta = scanner.nextInt();

        System.out.println("Digite a agência: ");
        String agencia = scanner.next();

        System.out.println("Digite seu nome: ");
        String nome = scanner.next();

        System.out.println("Digite o valor para depósito: ");
        double saldo = scanner.nextDouble();

        
        // Exibindo os dados da conta criada:
        System.out.println("\nOlá, " + nome + ". Obrigado por criar uma conta conosco!\nDados da sua conta:");
        System.out.println("Nome: " + nome + "\nAgência: " + agencia + "\nConta: " + conta);
        
        if (saldo > 0)
            System.out.println("Saldo: R$ " + saldo + " -> Saldo disponível para saque.");
        else
            System.out.println("Saldo: R$ " + saldo + " -> Saldo indisponível para saque.");
    }
}
