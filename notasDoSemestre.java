import java.util.Scanner;

public class notasDoSemestre {
    static int quantidadeDeAluno = 0;
    static int quantidadeDeProvas = 0;
    static String impressaoFinal;


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Solicita o número de alunos e o número de provas
        System.out.println("Quantos alunos tem na turma de Soluções Computacionais?");
        quantidadeDeAluno = sc.nextInt();

        System.out.println("Quantas provas a turma de Soluções Computacionais fazem em um semestre?");
        quantidadeDeProvas = sc.nextInt();

        // Array/matriz para armazenar as notas de cada aluno
        double [][] notas = new double[quantidadeDeAluno][quantidadeDeProvas];

        // Ler as notas de cada aluno
        for (int i = 0; i < quantidadeDeAluno; i++) {
            System.out.println("Aluno " + (i+1));
            for(int j = 0; j < quantidadeDeProvas; j++) {
                System.out.println("Nota da prova " + (j+1) + " é:");
                notas[i][j] = sc.nextDouble();
            }
        }

        // Calcula a nota final de cada aluno e verifica se foi aprovado
        for (int i = 0; i < quantidadeDeAluno; i++) {
            double somaNotas = 0;
            for (int j = 0; j < quantidadeDeProvas; j++) {
                somaNotas += notas[i][j];
            }
            
            double notaFinal = somaNotas / quantidadeDeProvas;

            boolean aprovado = aprovado(notaFinal);

            System.out.println("A média do aluno " + (i+1) + " é: " + notaFinal);

            System.out.println("Status do aluno:" + (aprovado ? " Aprovado" : " Reprovado"));
        }


        sc.close();
    }

    public static boolean aprovado (double m) {
        return m >= 70;
    }
}
