/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.marcos3;

/**
 *
 * @author alunolab13
 */
public class Principal {

    public static void main(String[] args) {
        Conta c1 = new Conta(500);
        c1.creditar(1000);
        c1.debitar(100);
        Conta c2 = new Conta();
        c1.transferir(c2, 1000);
        System.out.println("Saldo conta 1: " + c1.obterSaldo());
        System.out.println("Saldo conta 2: " + c2.obterSaldo());
    }
}
