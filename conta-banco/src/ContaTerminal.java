import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int numero;
        String nomeCliente, agencia;
        double saldo;

        System.out.println("BEM VINDO ao BANCO-DIO!!!");
        System.out.println("Para criar sua conta no banco-DIO precisamos coletar algumas informações.");
        System.out.println("No final confirmaremos os dados e sua conta já será ativa imediatamente!!");
        System.out.println("Vamos começar?");

        System.out.println("Informe o numero da conta: ");
        numero = sc.nextInt();

        System.out.println("Informe agora a sua agência com dígito (Exemplo: xxxx-x): ");
        sc.nextLine();
        agencia = sc.nextLine();

        System.out.println("Excelente! conta e agência confirmadas");
        System.out.println("Agora precisamos que digite o seu nome completo: ");
        nomeCliente = sc.nextLine();

        System.out.println("Conta aprovada com sucesso!!");
        System.out.println("Para ativar sua conta informe um valor para confirmação: ");
        saldo = sc.nextDouble();

        System.out.println(
                "Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia +
                        ", conta " + numero + " e seu saldo " + saldo + " já está disponível");

    }
}
