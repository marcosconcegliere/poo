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
        Pessoa p1 = new Pessoa();
        p1.nome = "Marcos";
        p1.idade = 19;
        
        System.out.println(p1.imprimir());
    }
}
