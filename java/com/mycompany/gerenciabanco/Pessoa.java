/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gerenciabanco;

/**
 *
 * @author allan
 */
public class Pessoa {
    
    private static int counter = 1;
    
    private String nome;
    private String sobrenome;
    private String cpf;
    private String email;
    
    public Pessoa(String nome, String sobrenome, String cpf, String email) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.cpf = cpf;
        this.email = email;
        counter += 1;
    }

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
    

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String toString() {
        return "\nNome: " + this.getNome() +
                "\nSobrenome: " + this.getSobrenome() +
                "\nCpf: " + this.getCpf() +
                "\nEmail: " + this.getEmail();
    }
    
    
    
    
            
}
