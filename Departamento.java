package com.example;

import java.util.ArrayList;

//2 - Crie uma classe que represente um departamento de uma empresa registrando nome e os funcionários que nele trabalhando,
//para uso de vetores, considere o máximo de 100 funcionários

public class Departamento {
    private String nome;
    private ArrayList<Funcionario> funcionarios;

    public Departamento(String nome) {
        this.nome = nome;
        this.funcionarios = new ArrayList<Funcionario>();
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<Funcionario> getFuncionario() {
        return funcionarios;
    }

    public void setFuncionario(Funcionario funcionario) {
        if (this.funcionarios.size() <= 100) {
            this.funcionarios.add(funcionario);
            System.out.println("Funcionário adicionado com sucesso");
        } else  {
            System.out.println("Limite de 100 funcionários atingido");
        }
    }

    public void addFuncionario(Funcionario funcionario) {
        this.funcionarios.add(funcionario);
    }

    public void removeFuncionario(Funcionario funcionario) {
        this.funcionarios.remove(funcionario);
    }
}
