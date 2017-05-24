/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidade;

/**
 *
 * @author Sergio Walter Junior
 */
public class Pessoa {
    
    private String nome;
    private String sobrenome;
    private Endereco endereco;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        return "Pessoa{" + "nome=" + nome + ", sobrenome=" + sobrenome + ", endereco=" + endereco + '}';
    }

    public Pessoa(String nome, String sobrenome, Endereco endereco) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.endereco = endereco;
    }
    
    
    
    
           
    
}
