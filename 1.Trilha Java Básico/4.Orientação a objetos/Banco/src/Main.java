import exceptions.SaldoInsuficienteException;
import model.Banco;
import model.Cliente;
import model.Conta;
import model.Corrente;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws SaldoInsuficienteException {

        Cliente cliente1 = new Cliente("José", "Silva", "123456789");
        Cliente cliente2 = new Cliente("Pedro", "Silva", "555555555");

        Corrente conta1 = new Corrente(1234, 123456, cliente1, 0.0, 0.0);
        Corrente conta2 = new Corrente(1234, 456123, cliente2, 0.0, 0.0);

        conta1.deposito(100.0);
        System.out.println(conta1.getSaldo());

        conta1.deposito(200.0);
        System.out.println(conta1.getSaldo());

        conta1.deposito(200.0);
        System.out.println(conta1.getSaldo());

        try {
            conta1.sacar(1100.0);

        } catch (Exception e ){
            System.out.println(e.getMessage());
        }

        System.out.println(conta1.getSaldo());

        try {
            conta1.transferir(500.0, conta2);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Saldo em conta do " + conta1.getCliente().getNome() + " é de: "+ conta1.getSaldo());
        System.out.println("Saldo em conta do " + conta2.getCliente().getNome() + " é de: "+ conta2.getSaldo());

        Banco itau = new Banco();

        List<Conta> contas = new ArrayList<>();

        contas.add(conta1);
        contas.add(conta2);

        itau.setContas(contas);

        for (Conta conta : itau.getContas()) {
            System.out.println(conta.getNumero());
        }
    }

}