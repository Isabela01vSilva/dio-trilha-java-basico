import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.printf("Por favor, digite o número da conta !\n");
        int numero = scanner.nextInt();

        System.out.printf("Por favor, digite o número da Agência !\n");
        String agencia = scanner.next();

        System.out.printf("Por favor, digite o Nome do Cliente !\n");
        String nomeCliente = scanner.next();

        System.out.printf("Por favor, digite o Saldo !\n");
        double saldo = scanner.nextDouble();

        System.out.println("\nOlá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");

        scanner.close();
    }

}
