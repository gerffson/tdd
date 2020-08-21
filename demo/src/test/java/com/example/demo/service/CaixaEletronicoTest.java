package com.example.demo.service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.example.demo.entity.Conta;
import org.junit.jupiter.api.Test;

/**
 * Exibir saldo ("Saldo: X")
 * Sacar um valor com sucesso, exibir mensagem e saldo resultante ("Saque no valor de: X. Saldo: Y")
 * Sacar acima do limite (limite=1000) ("Não foi possível sacar.")
 * Sacar saldo insuficiente ("Saldo insuficiente.")
 * Depositar ("Deposito no valor de: X. Saldo: Y")
 * Sacar de uma conta e depositar em outra ("Movimentação realizada com sucesso")
 */
public class CaixaEletronicoTest {


    @Test
    public void shouldShowBalance() {
        CaixaService caixaService = new CaixaService();
        Double balance = caixaService.getBalance();
        assertEquals(10.0, balance);
    }

    @Test
    public void deveSacarValorSucesso() {
        CaixaService caixaService = new CaixaService();
        double valorSaque = 2;
        double saldo = 5;

        Conta conta = new Conta(1, saldo);
        String msg = caixaService.sacarValor(conta, valorSaque);
        assertEquals("Saque no valor de: " + valorSaque + ". Saldo: " + saldo, msg);
    }

}
