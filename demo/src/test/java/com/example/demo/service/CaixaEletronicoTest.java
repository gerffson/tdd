package com.example.demo.service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.example.demo.entity.Conta;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

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
        ContaService contaService= Mockito.mock(ContaService.class);
        CaixaService caixaService = new CaixaService(contaService);

        Mockito.when(contaService.saldo(1)).thenReturn(10.0);

        Double balance = caixaService.getBalance(1);
        assertEquals(10.0, balance);
    }

    @Test
    public void deveSacarValorSucesso() {
        ContaService contaService= Mockito.mock(ContaService.class);
        CaixaService caixaService = new CaixaService(contaService);
        double valorSaque = 2;
        double saldo = 5;

        Mockito.when(contaService.sacar(1, valorSaque)).thenReturn(valorSaque);
        Mockito.when(contaService.saldo(1)).thenReturn(saldo);

        String msg = caixaService.sacarValor(1, valorSaque);
        assertEquals("Saque no valor de: " + valorSaque + ". Saldo: " + saldo, msg);
    }



}
