import java.util.Scanner;

public class ContaTerminal {    
    public static void main(String[] args) throws Exception {
    int numeroConta;
    String agencia;
    String nomeCliente;
    double saldo; 
    Scanner scanner = new Scanner(System.in);
    
    System.out.println("Digite seu nome completo.");
    nomeCliente = scanner.nextLine();

    System.out.println("Número da Agência:");
    agencia = scanner.nextLine();

    System.out.println("Número da conta:");
    numeroConta = scanner.nextInt();

    System.out.println("Qual valor de deposito inicial deseja fazer para ativação da conta?\n (valor mínimo: R$150,00)");
    saldo = scanner.nextDouble();


    System.out.println("Olá " + nomeCliente + "! Obrigado por criar uma conta em nosso banco.\nSua agência é " + agencia + ", conta " + numeroConta + ". Seu saldo de R$"+ saldo + " já está disponível para saque.");

    scanner.close();

    }
}
