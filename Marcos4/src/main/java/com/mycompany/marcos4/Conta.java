/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.marcos4;

/**
 *
 * @author alunolab01
 */
public class Conta {
    private double saldo, limite;
    private int agencia, numero; 
    
    double getSaldo(){
        return saldo;
    }
    
    void setAgencia(int agencia){
        this.agencia = agencia;
    }
    
    int getAgencia(){
        return agencia;
    }
    
    void setNumero(int numero){
        this.numero = numero;
    }
    
    int getNumero(){
        return numero;
    }
    
    void setLimite(int limite){
        this.limite = limite;
    }
    
    double getLimite(){
        return limite;
    }
    
    public Conta(){
    
    }
    
    public Conta(int agencia, int numero, double valor, double limite){
        this.agencia = agencia;
        this.numero = numero;
        this.limite = limite;
        saldo = saldo + valor;
    }
    
    void debitar(double valor){
        if(valor >= saldo + limite){
            saldo = saldo - valor;
        }
        else
            System.out.println("Erro: valor invalido");
    }
    void creditar(double valor){
        saldo = saldo + valor;
    }
    void transferir(Conta destino, double valor){
        debitar(valor);
        destino.creditar(valor);
    }
    
}
