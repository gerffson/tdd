package com.example.demo.service;

import com.example.demo.entity.Conta;

public interface ContaService {


    double sacar(int conta, double valorSaque);

    double saldo(int conta);
}
