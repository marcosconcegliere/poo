/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.marcos7;

/**
 *
 * @author alunolab13
 */
public class Principal {

    public static void main(String[] args) {
        Curso c1 = new Curso("111", "Medicina");
        //Curso c2 = new Curso("222", "Direito");
        
        Aluno a1 = new Aluno("Marcos", 123, c1);
        
        System.out.println("ALUNO: " + a1.getNome() + " MATRICULA: " + a1.getMatricula() + " CURSO: " + a1.getCurso());
    }
}
