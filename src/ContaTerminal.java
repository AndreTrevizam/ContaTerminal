import java.util.Scanner;
import java.util.Locale;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        new Screen();

        System.out.println("Por favor, digite o número de usuário: ");
        int usuario = scanner.nextInt();
        scanner.nextLine();  // Consumir a nova linha restante

        System.out.println("Por favor, digite o número da Agência: ");
        String agencia = scanner.nextLine();

        System.out.println("Por favor, digite o nome da conta: ");
        String nome = scanner.nextLine();

        System.out.println("Informe o saldo: ");
        double saldo = scanner.nextDouble();

        System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + usuario + " e seu saldo " + saldo + " já está disponível para saque.");
    }
}
