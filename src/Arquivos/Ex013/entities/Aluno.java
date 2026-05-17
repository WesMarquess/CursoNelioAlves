package Arquivos.Ex013.entities;

import java.util.ArrayList;
import java.util.List;

public class Aluno {
    private String nome;
    private Integer idade;
    private List<Exercicio> exercicioList = new ArrayList<>();

    public Aluno(String nome, Integer idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public void addExercicio(Exercicio exercicios) {
        exercicioList.add(exercicios);
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Nome: " + this.nome);
        stringBuilder.append(" - ");
        stringBuilder.append("Idade: " + this.idade);
        stringBuilder.append(" - ");
        stringBuilder.append("Lista de treinos:" + this.exercicioList.toString());

        return stringBuilder.toString();
    }
}
