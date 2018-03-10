/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dados;

import Modelo.Aluno;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Luís Gustavo
 */
public class BancoDadosCliente {
    private List<Aluno> aluno;

    public BancoDadosCliente() {
        aluno = new ArrayList<>();
    }
    
    public void addAluno(Aluno aluno){
        this.aluno.add(aluno);
    }
    
    public void removeAluno(Aluno aluno){
        this.aluno.remove(aluno);
    }
    
    public Aluno getAluno(int matricula){
        for(Aluno a : aluno){
            if(a.getNum_matricula().equals(matricula)){
                return a;
            }
        }
        return null;
    }
    
    public List getAlunos(){
        return aluno;
    }
}
