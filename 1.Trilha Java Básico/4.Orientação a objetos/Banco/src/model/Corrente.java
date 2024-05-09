package model;

import exceptions.ContaNaoLocalizadaException;
import exceptions.SaldoInsuficienteException;

public class Corrente extends Conta implements TransacoesBancarias {

    private Double saldoInvestido;

    public Corrente(int agencia, int numero, Cliente cliente, Double saldo, Double saldoInvestido) {
        super(agencia, numero, cliente, saldo);
        this.saldoInvestido = saldoInvestido;
    }

    public Double getSaldoInvestido() {
        return saldoInvestido;
    }

    public void setSaldoInvestido(Double saldoInvestido) {
        this.saldoInvestido = saldoInvestido;
    }

    public void investir(Double valorInvestimento){
        this.saldoInvestido += valorInvestimento;
    }

    public void pagarBoletos(Double valorBoleto) throws SaldoInsuficienteException {
        if (getSaldo() < valorBoleto){
            throw new SaldoInsuficienteException();
        }

        Double pagamento = getSaldo() - valorBoleto;
        setSaldo(pagamento);
    }

    @Override
    public void deposito(Double valorDeposito) {
        Double deposito = getSaldo() + valorDeposito;
        setSaldo(deposito);
    }

    @Override
    public void sacar(Double valorSaque) throws SaldoInsuficienteException {
        if (getSaldo() < valorSaque){
            throw new SaldoInsuficienteException();
        }
        Double saque = getSaldo() - valorSaque;
        setSaldo(saque);
    }

    @Override
    public void transferir(Double valorTransferencia, Conta contaDestino) throws SaldoInsuficienteException, ContaNaoLocalizadaException{
        if (contaDestino == null) {
            throw new ContaNaoLocalizadaException();
        } else {
            if(getSaldo() < valorTransferencia){
                throw new SaldoInsuficienteException();
            }
            contaDestino.setSaldo(valorTransferencia);
            Double transferencia = getSaldo() - valorTransferencia;
            setSaldo(transferencia);
            }
        }
}
