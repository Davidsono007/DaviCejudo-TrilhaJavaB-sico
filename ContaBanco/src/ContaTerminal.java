import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        int codigo = 0;
        String agencia = "";
        String nome = "";
        double saldo = 0.0;
        Scanner input = new Scanner(System.in);

        System.out.println("Por favor, insira seu código");
        codigo = input.nextInt();

        System.out.println("Por favor, insira o número da agência");
        agencia = input.nextLine();

        System.out.println("Por favor, insira seu nome");
        nome = input.nextLine();

        System.out.println("Por favor, insira seu Saldo");
        saldo = input.nextDouble();

        System.out.println("Olá " + nome + "! Obrigado por criar uma conta! Sua agência é " + agencia + " e seu saldo de " + saldo + " Já está disponível");

    }
}
