package model;

import exceptions.SaldoInsuficienteException;

public class Poupanca extends Conta implements TransacoesBancarias {

    private Double saldoPoupado;

    public Poupanca(int agencia, int numero, Cliente cliente, Double saldo) {
        super(agencia, numero, cliente, saldo);
    }

    public Double getSaldoPoupado() {
        return saldoPoupado;
    }

    public void setSaldoPoupado(Double saldoPoupado) {
        this.saldoPoupado = saldoPoupado;
    }

    public void poupar(Double valorPoupar) {
        this.saldoPoupado += valorPoupar;
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
    public void transferir(Double valorTransferencia, Conta contaDestino) throws SaldoInsuficienteException {
        if(getSaldo() < valorTransferencia){
            throw new SaldoInsuficienteException();
        }
        contaDestino.setSaldo(valorTransferencia);
        Double transferencia = getSaldo() - valorTransferencia;
        setSaldo(transferencia);

    }
}
