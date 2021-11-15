package br.edu.iftm.entrega1.model;

public class Usuario {

    private String nome, email, endereco, senha;
    private char sexo;
    private boolean voluntario;
    private int cpf, telefone;
    
    public Usuario(Integer id, String nome, boolean voluntario, String email, int cpf, String endereco, int telefone, char sexo, String senha) {
        this.nome = nome;
        this.voluntario = voluntario;
        this.email = email;
        this.cpf = cpf;
        this.endereco = endereco;
        this.telefone = telefone;
        this.sexo = sexo;
        this.senha = senha;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public boolean getVoluntario() {
        return this.voluntario;
    }

    public void setVoluntario(boolean voluntario) {
        this.voluntario = voluntario;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    public String getEndereco() {
        return this.endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getSenha() {
        return this.senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public char getSexo() {
        return this.sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }


    public int getCpf() {
        return this.cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public int getTelefone() {
        return this.telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

}





    

