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
public class Endereco {
    
    private String bairro;
    private int cep;

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public int getCep() {
        return cep;
    }

    public void setCep(int cep) {
        this.cep = cep;
    }

    @Override
    public String toString() {
        return "Endere\u00e7o{" + "bairro=" + bairro + ", cep=" + cep + '}';
    }

    public Endereco(String bairro, int cep) {
        this.bairro = bairro;
        this.cep = cep;
    }
    
    
    
}
