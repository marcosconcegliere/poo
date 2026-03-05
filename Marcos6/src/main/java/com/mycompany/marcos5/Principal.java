/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.marcos5;
//import java.util.Scanner;
import javax.swing.JOptionPane;
/**
 *
 * @author Alunolab13
 */
public class Principal {

    public static void main(String[] args) {
        //Scanner sc = new Scanner(System.in);
        //System.out.println("Digite a agencia da conta 1: ");
        Conta[] contas = new Conta[2];
        int i = 0;
        int count = 1;
        while(i <= 1){
            int agencia = Integer.parseInt(JOptionPane.showInputDialog("Digite a agencia da conta " + count));
            //System.out.println("Digite o numero da conta 1: ");
            int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite a numero da conta " + count));
            //System.out.println("Digite o saldo inicial da conta 1: ");
            double saldo = Double.parseDouble(JOptionPane.showInputDialog("Digite o saldo inicial da conta " + count));
            //System.out.println("Digite o limite da conta 1: ");
            double limite =  Double.parseDouble(JOptionPane.showInputDialog("Digite o limite da conta " + count));
            contas[i] = new Conta(agencia, numero, saldo, limite);
            i ++;
            count ++;
        }
        
        //Conta c2 = new Conta(345, 888, 1000, 800);
        
        contas[0].transferir(contas[1], 1000);
        
        //System.out.println(c1.getSaldoDisponivel());
        //System.out.println(c2.getSaldoDisponivel());
        JOptionPane.showMessageDialog(null, "Saldo da conta 1: " + contas[0].getSaldoDisponivel());
        JOptionPane.showMessageDialog(null, "Saldo da conta 2: " + contas[1].getSaldoDisponivel());
    }
}
