import java.util.Scanner;
import java.util.Locale;


public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        //Todo: criando o objeto scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);


        String agencia, nomeCliente, sobrenome;
        int contaCliente;
        double saldoCliente = 237.48;

        //Exibir as mensagens para o nosso usuário
        System.out.println();

        System.out.println("Por favor, digite o número da Agência!");

        //Obter pela scanner os valores digitados

        contaCliente = scanner.nextInt();

        System.out.println("Por favor, digite sua Agencia!");
        agencia = scanner.next();

        System.out.println("Por favor, digite seu nome!");
        nomeCliente = scanner.next();

        System.out.println("Por favor, digite seu Sobre Nome!");
        sobrenome = scanner.next();

        //Exibir a mensagem conta criada
        System.out.println("Olá" + " " + nomeCliente + " " + sobrenome + ", " + "obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", " + "conta: " + contaCliente + " " + "e seu saldo: " + saldoCliente + " " + "já está disponível para saque.");

    }
}
