import model.Conta;

import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Por favor, digite o nome completo do Cliente!");
        String nome = sc.nextLine();

        System.out.println("Por favor, digite o número da Agência!");
        String agencia = sc.next();

        System.out.println("Por favor, digite o número da Conta!");
        Integer numero = sc.nextInt();

        Double saldo = 1000.0;

        Conta conta = new Conta(numero, agencia, nome, saldo);

        String mensagem = "Olá "
                .concat(conta.getNomeCliente())
                .concat(", obrigado por criar uma conta em nosso banco!")
                .concat("\nSua agência é a ").concat(conta.getAgencia())
                .concat(", conta ").concat(String.valueOf(numero))
                .concat(" e seu saldo de ").concat(String.valueOf(saldo))
                .concat(" já está disponível para saque.");
        System.out.println(mensagem);

        sc.close();
    }
}