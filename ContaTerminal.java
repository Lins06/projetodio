import java.util.Scanner;

public class ContaTerminal{
    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite o numero da sua agencia: ");
        String NumeroAgencia = ler.next();

        System.out.println("Digite o numero da sua conta: ");
        int NumeroConta = ler.nextInt();

        System.out.println("Digite o saldo da sua conta: ");
        float Saldo = ler.nextFloat();

        System.out.println("Digite o seu nome: ");
        String Nome = ler.next();

        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque", Nome, NumeroAgencia, NumeroConta, Saldo);



    }
}