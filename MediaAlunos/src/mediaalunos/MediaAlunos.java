/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mediaalunos;

import java.util.Scanner;

/**
 *
 * @author RAFA-DESK
 */
public class MediaAlunos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Cursos c1 = new Cursos();

        c1.N_curso();
        
        c1.total_Bimestre();

        c1.alunos();

        String N_alunos[] = new String[c1.Total_alunos];
        double notas_alunos[][] = new double[c1.Total_alunos][c1.Bimestre];
        double media_alunos[] = new double[c1.Total_alunos];

        vetor1(N_alunos);

        vetor2(N_alunos, notas_alunos, c1.Total_alunos, c1.Bimestre);

        vetor3(notas_alunos, c1.Total_alunos, c1.Bimestre, media_alunos);

        mostrar_resultado(c1.Total_alunos, media_alunos, c1.Media, N_alunos);

        
    }

    public static void vetor1(String N_alunos[]) {
        Scanner x = new Scanner(System.in);
        for (int i = 0; i < N_alunos.length; i++) {
            System.out.println("Digite o Nome do " + (i + 1) + " Aluno");
            N_alunos[i] = x.next();
        }

    }

    private static void vetor2(String[] N_alunos, double[][] notas_alunos, int Total_alunos, int Bimestre) {
        Scanner x = new Scanner(System.in);

        for (int i = 0; i < Total_alunos; i++) {
            for (int j = 0; j < Bimestre; j++) {
                System.out.println("Digite as Notas do " + N_alunos[i] + " do " + (j + 1) + "°Bimestre");
                notas_alunos[i][j] = x.nextDouble();

            }
        }
    }

    private static void vetor3(double[][] notas_alunos, int Total_alunos, int Bimestre, double[] media_alunos) {
        for (int i = 0; i < Total_alunos; i++) {
            for (int j = 0; j < Bimestre; j++) {
                media_alunos[i] += notas_alunos[i][j];
            }
            media_alunos[i] /= Bimestre;
        }
    }

    private static void mostrar_resultado(int Total_alunos, double[] media_alunos, double Media, String N_alunos[]) {
        for (int i = 0; i < Total_alunos; i++) {

            if (media_alunos[i] >= Media) {
                System.out.println("Aluno " + N_alunos[i] + " Media " + media_alunos[i] + " Situação Aprovado!!!");
            } else {
               System.out.println("Aluno " + N_alunos[i] + " Media " + media_alunos[i] + " Situação Reprovado!!!");
            }
        }

    }
}
