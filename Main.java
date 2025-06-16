import model.*;
import service.AcademiaService;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AcademiaService academia = new AcademiaService();

        while (true) {
            System.out.println("\n===== SISTEMA DE ACADEMIA =====");
            System.out.println("1. Cadastrar Plano");
            System.out.println("2. Listar Planos");
            System.out.println("3. Cadastrar Aluno");
            System.out.println("4. Listar Alunos");
            System.out.println("5. Registrar Presença");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = sc.nextInt();
            sc.nextLine(); // limpar buffer

            switch (opcao) {
                case 1:
                    System.out.print("Nome do plano: ");
                    String nomePlano = sc.nextLine();
                    System.out.print("Preço do plano: ");
                    double preco = sc.nextDouble();
                    academia.cadastrarPlano(nomePlano, preco);
                    break;
                case 2:
                    academia.listarPlanos();
                    break;
                case 3:
                    System.out.print("Nome do aluno: ");
                    String nomeAluno = sc.nextLine();
                    System.out.print("CPF do aluno: ");
                    String cpf = sc.nextLine();
                    academia.listarPlanos();
                    System.out.print("Escolha o número do plano: ");
                    int planoIndex = sc.nextInt();
                    academia.cadastrarAluno(nomeAluno, cpf, planoIndex);
                    break;
                case 4:
                    academia.listarAlunos();
                    break;
                case 5:
                    academia.listarAlunos();
                    System.out.print("Escolha o número do aluno: ");
                    int alunoIndex = sc.nextInt();
                    academia.registrarPresenca(alunoIndex);
                    break;
                case 0:
                    System.out.println("Saindo...");
                    sc.close();
                    return;
                default:
                    System.out.println("Opção inválida.");
            }
        }
    }
}