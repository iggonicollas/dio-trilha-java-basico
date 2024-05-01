import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
            Scanner scanner = new Scanner(System.in);

        System.out.println("Olá Bem Vindo a sua conta IggoBank! \n Aqui sua conta vale Ouro!");


        System.out.println("Você já é nosso cliente? s/n ?");
        String resposta = scanner.nextLine();

            if (resposta.equals("s")) {
                System.out.println("Ok vamos acessar sua área do cliente.");
                
            } else if (resposta.equals("n")) {
                System.out.println("Para acessar esta área é necessário ter uma conta válida.");
                System.exit(0);
                                          
            } else {
                System.out.println("Resposta inválida. Por favor, responda 's' para sim ou 'n' para não.");
            }
                

        System.out.println("Agora digite o número de sua conta: ");
        int contaNumero = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Numero da Agência: ");
        String contaAgencia = scanner.nextLine();

        System.out.println("Digite seu nome completo ");
        String nomeCliente = scanner.nextLine();

        clienteFisico cliente = new clienteFisico();
        cliente.contaNumero = contaNumero;
        cliente.contaAgencia = contaAgencia;
        cliente.nomeCliente = nomeCliente;

        scanner.close();

        System.out.printf("Olá %s! Bem vindo de Volta!%n" +
                "Você receberá todas as informações via e-mail%n" +
                "mas aqui estão seus dados bancários caso queira começar a usar nosso sistema:%n" +
                "Número da Conta: %d%n" +
                "Número da Agência: %s%n" +
                "Seu saldo é: %.2f%n", cliente.nomeCliente, cliente.contaNumero, cliente.contaAgencia, cliente.contaSaldo);
    }
}
