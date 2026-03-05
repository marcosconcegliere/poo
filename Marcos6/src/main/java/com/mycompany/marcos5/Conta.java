/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.marcos5;

/**
 *
 * @author Alunolab13
 */
public class Conta {

    private double saldo, limite;
    private int agencia, numero;

    public Conta() {
    }

    public Conta(int agencia, int numero, double saldo, double limite ) {
        this.saldo = saldo;
        this.limite = limite;
        this.agencia = agencia;
        this.numero = numero;
    }

    public double getSaldoDisponivel() {
        return saldo + limite;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void creditar(double valor) {
        saldo += valor;
    }

    public boolean debitar(double valor) {
        if (valor <= getSaldoDisponivel()) {
            saldo -= valor;
            return true;
        } else {
            System.out.println("Saldo insuficiente.");
            return false;
        }
    }

    public boolean transferir(Conta destino, double valor) {
        if (this.debitar(valor)) {
            destino.creditar(valor);
            return true;
        } else {
            System.out.println("Transferencia não realizada.");
            return false;
        }
    }
}
