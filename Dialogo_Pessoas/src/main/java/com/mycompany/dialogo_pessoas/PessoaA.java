/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.dialogo_pessoas;

/**
 *
 * @author Renato
 */
public class PessoaA extends Acoes implements PessoaAtributos{
  public String nome;

    
    public void Apresentacao() {
        super.Apresentacao(this.nome);
        System.out.println("Prazer em te conhecer");
    }

    @Override
    public void Saudacao(String nomeOutraPessoa) {
        super.Saudacao(nomeOutraPessoa);
        System.out.println("Como voce esta " + nomeOutraPessoa + "?");
    }

    @Override
    public void Sentimento() {
        System.out.println("Estou me sentindo feliz");
    }
    
    PessoaA(String nome){
        this.nome = nome;
    }

   
}
