/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.dialogo_pessoas;
import java.util.Scanner;
/**
 *
 * @author Renato
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite o nome da primeira pessoa");
        String nomeA = scanner.nextLine();
        System.out.println("Digite o nome da segunda pessoa");
        String nomeB = scanner.nextLine();
        
        PessoaA pessoaA = new PessoaA(nomeA);
        PessoaB pessoaB = new PessoaB(nomeB);
        
        pessoaA.Apresentacao();
         pessoaB.Saudacao(pessoaA.nome);
         pessoaA.Sentimento();
        pessoaB.Apresentacao();
        
        pessoaA.Saudacao(pessoaB.nome);
       
        
        
        pessoaB.Sentimento();
    }
    
}
