package service;

import model.model.Aluno;
import model.model.Plano;

import java.util.ArrayList;
import java.util.List;

public class AcademiaService {
    private List<Aluno> alunos = new ArrayList<>();
    private List<Plano> planos = new ArrayList<>();

    public void cadastrarPlano(String nome, double preco) {
        planos.add(new Plano(nome, preco));
        System.out.println("Plano cadastrado com sucesso!");
    }

    public void listarPlanos() {
        if (planos.isEmpty()) {
            System.out.println("Nenhum plano cadastrado.");
            return;
        }
        for (int i = 0; i < planos.size(); i++) {
            System.out.println((i + 1) + ". " + planos.get(i));
        }
    }

    public void cadastrarAluno(String nome, String cpf, int planoIndex) {
        if (planoIndex < 1 || planoIndex > planos.size()) {
            System.out.println("Plano inválido.");
            return;
        }
        Plano planoEscolhido = planos.get(planoIndex - 1);
        alunos.add(new Aluno(nome, cpf, planoEscolhido));
        System.out.println("Aluno cadastrado com sucesso!");
    }

    public void listarAlunos() {
        if (alunos.isEmpty()) {
            System.out.println("Nenhum aluno cadastrado.");
            return;
        }
        for (int i = 0; i < alunos.size(); i++) {
            Aluno a = alunos.get(i);
            System.out.println((i + 1) + ". " + a);
        }
    }

    public void registrarPresenca(int alunoIndex) {
        if (alunoIndex < 1 || alunoIndex > alunos.size()) {
            System.out.println("Aluno inválido.");
            return;
        }
        alunos.get(alunoIndex - 1).registrarPresenca();
        System.out.println("Presença registrada!");
    }
}
