package com.example;

import java.util.ArrayList;

//3- crie auma classe que represente uma empresa registrando seu nome, CNPJ e departamentos, considere no máximo 10 departamentos

public class Empresa {
    private String nome;
    private String CNPJ;
    private ArrayList<Departamento> departamentos;

    public Empresa(String nome, String CNPJ) {
        this.nome = nome; 
        this.CNPJ = CNPJ;
        departamentos = new ArrayList<Departamento>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCNPJ() {
        return CNPJ;
    }

    public void setCNPJ(String cNPJ) {
        CNPJ = cNPJ;
    }

    public ArrayList<Departamento> getDepartamento() {
        return departamentos;
    }

    public void setDepartamento(Departamento departamento) {
        if (this.departamentos.size() <= 10) {
            this.departamentos.add(departamento);
            System.out.println("Departamento adicionado com sucesso");    
        } else {
            System.out.println("O limite de 10 departamentos foi atingido, pfv remova algum departamento para depois adicionar");
        }
        
    }
}
