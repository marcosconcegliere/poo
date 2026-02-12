/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.marcos;

/**
 *
 * @author alunolab13
 */
public class Principal {

    public static void main(String[] args) {
        Conta c1 = new Conta();
        c1.creditar(1500);
        c1.debitar(500);
        System.out.println("Saldo : R$" + c1.print());
    }
}
