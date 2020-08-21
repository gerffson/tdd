package com.example.demo.service;

import com.example.demo.entity.Conta;

public class CaixaService {

    public Double getBalance() {
        return 10.0;
    }

    public String sacarValor(Conta conta, double valorSaque) {
        //conta.setSaldo(conta.getSaldo() - valorSaque);
        return "Saque no valor de: " + valorSaque + ". Saldo: " + conta.getSaldo();
    }
}
