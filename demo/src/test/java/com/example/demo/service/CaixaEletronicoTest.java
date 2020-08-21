package com.example.demo.service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.sun.media.sound.SoftMainMixer;
import org.junit.jupiter.api.Test;
import org.springframework.test.util.AssertionErrors;

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
    public void shouldShowBalance(){
        CaixaService caixaService = new CaixaService();
        Double balance = caixaService.getBalance();
        assertEquals(10.0, balance);
    }


}
