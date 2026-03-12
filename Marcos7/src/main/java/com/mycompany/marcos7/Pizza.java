/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.marcos7;

import java.util.List;

/**
 *
 * @author Alunolab13
 */
public class Pizza extends Produto {
    private String tamanho;
    private int diametro;
    private List<String> ingredientes;

    
    public Pizza(int codigo, String nome, double valor, String tamanho, int diametro, List ingredientes ) {
        super(codigo, nome, valor);
        this.tamanho = tamanho;
        this.diametro = diametro;
        this.ingredientes = ingredientes;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public int getDiametro() {
        return diametro;
    }

    public void setDiametro(int diametro) {
        this.diametro = diametro;
    }

    public List getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(List ingredientes) {
        this.ingredientes = ingredientes;
    }
    
}
