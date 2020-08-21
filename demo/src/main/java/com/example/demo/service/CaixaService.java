package com.example.demo.service;

import com.example.demo.entity.Conta;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CaixaService {

    public CaixaService(ContaService contaService)
    {
        this.contaService = contaService;
    }
    ContaService contaService;

    public double getBalance(int conta) {
        return contaService.saldo(conta);
    }

    public String sacarValor(int conta, double valorSaque) {

        double saque = contaService.sacar(conta, valorSaque);

        return "Saque no valor de: " + saque + ". Saldo: " + getBalance(conta);
    }
}
