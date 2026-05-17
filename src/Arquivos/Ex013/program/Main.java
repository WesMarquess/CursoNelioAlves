package Arquivos.Ex013.program;

import Arquivos.Ex013.Service.ArquivoService;
import Arquivos.Ex013.Service.AlunoService;
import Arquivos.Ex013.Service.ExercicioService;
import Arquivos.Ex013.entities.Aluno;
import Arquivos.Ex013.entities.Exercicio;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String path = "C:\\Users\\wesma\\OneDrive\\Área de Trabalho\\cadastro.txt";
        ArquivoService arquivoService = new ArquivoService(path);

        String nomeAluno = AlunoService.lerNome(input);
        int idadeAluno = AlunoService.lerIdade(input);

        System.out.println("Monte o treino: ");
        System.out.println("===================");
        String nomeExercicio = ExercicioService.lerNomeExercicio(input);

        int qtdRepeticoesExercicios = ExercicioService.lerRepeticoes(input);
        int qtdSeriesExercicios = ExercicioService.lerSeries(input);

        Exercicio exercicio = new Exercicio(nomeExercicio, qtdRepeticoesExercicios, qtdSeriesExercicios);
        Aluno aluno = new Aluno(nomeAluno, idadeAluno);
        aluno.addExercicio(exercicio);
        arquivoService.salvar(aluno);
    }
}
