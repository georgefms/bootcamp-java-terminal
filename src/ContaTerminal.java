import java.util.Scanner;
import java.util.Locale;

public class ContaTerminal {

    public static void main(String[] args) {

    Scanner scan = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite o numero da conta");
        int numero = scan.nextInt();

        System.out.println("Digite a agencia da conta");
        String agencia = scan.next();

        System.out.println("Digite o Nome do cliente");
        String nome = scan.next();

        System.out.println("Digite o Saldo");
        double saldo = scan.nextDouble();

        System.out.println("Olá "+nome+", obrigado por criar uma conta em nosso banco, sua agência é: "+agencia+", conta "+numero+ " e seu saldo "+saldo+ " já está disponível para saque");
    }
}
