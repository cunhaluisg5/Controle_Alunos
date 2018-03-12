/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author Luís Gustavo
 */
public class Aluno {
    private int num_matricula;
    private String nome;
    private double valor_mensalidade;
    private String data_ingresso;
    private String periodo;
    private String curso;
    private String email;
    private String senha;

    public Aluno() {
    }

    public Aluno(int num_matricula, String nome, double valor_mensalidade, String data_ingresso, String periodo, String curso, String email, String senha) {
        this.num_matricula = num_matricula;
        this.nome = nome;
        this.valor_mensalidade = valor_mensalidade;
        this.data_ingresso = data_ingresso;
        this.periodo = periodo;
        this.curso = curso;
        this.email = email;
        this.senha = senha;
    }

    public int getNum_matricula() {
        return num_matricula;
    }

    public void setNum_matricula(int num_matricula) {
        this.num_matricula = num_matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValor_mensalidade() {
        return valor_mensalidade;
    }

    public void setValor_mensalidade(double valor_mensalidade) {
        this.valor_mensalidade = valor_mensalidade;
    }

    public String getData_ingresso() {
        return data_ingresso;
    }

    public void setData_ingresso(String data_ingresso) {
        this.data_ingresso = data_ingresso;
    }

    public String getPeriodo() {
        return periodo;
    }

    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    public void reajustarMensalidade(int per){
        valor_mensalidade = valor_mensalidade + ((per / 100) * valor_mensalidade);
    }
    
    public String toString(){
        return "Número de matrícula: " + num_matricula +
               "\nNome: " + nome +
               "\nValor da mensalidade: " + valor_mensalidade +
               "\nData de ingresso: " + data_ingresso +
               "\nPeríodo: " + periodo +
               "\nCurso: " + curso +
               "\nEmail: " + email +
               "\nSenha: " + senha;
    }
    
    public boolean validarAluno(String email, String senha){
        if(email.equals(this.email) && senha.equals(this.senha)){
            return true;
        }
        return false;
    }
}
