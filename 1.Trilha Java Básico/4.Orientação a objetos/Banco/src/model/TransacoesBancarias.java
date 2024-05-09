package model;

import exceptions.ContaNaoLocalizadaException;
import exceptions.SaldoInsuficienteException;

public interface TransacoesBancarias {
    void deposito(Double valorDeposito);
    void sacar(Double valorSaque) throws SaldoInsuficienteException;
    void transferir(Double valorTransferencia, Conta contaDestino) throws SaldoInsuficienteException, ContaNaoLocalizadaException;
}
