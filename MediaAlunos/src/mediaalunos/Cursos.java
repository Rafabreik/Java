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
public class Cursos {

    Scanner input = new Scanner(System.in);

    private int Total_alunos;
    private int Bimestre;
    final double Nota_minima = 7;
    public String Nome_curso;

    public Cursos(String Nome_curs, int Tot_alunos, int bim) {//Este é o metodo construtor
        this.setBimestre(bim);
        this.setTotal_alunos(Tot_alunos);
        this.setNome_curso(Nome_curs);
        double not_minima = Nota_minima;

    }

    //Parte de Vetores pra armanamento de Nomes de alunos e notas e media dos mesmos.
    /*String N_alunos[] = new String[this.Total_alunos];
    double notas_alunos[][] = new double[this.Total_alunos][this.Bimestre];
    double media_alunos[] = new double[this.Total_alunos];*/

    public int getTotal_alunos() {
        return this.Total_alunos;

    }

    public void setTotal_alunos(int Tot_alunos) {
        this.Total_alunos = Tot_alunos;

    }

    public int getBimestre() {
        return this.Bimestre;

    }

    public void setBimestre(int Bim) {
        this.Bimestre = Bim;

    }

    public String getNome_curso() {
        return this.Nome_curso;

    }

    public void setNome_curso(String Nome_curs) {
        this.Nome_curso = Nome_curs;

    }

    public void status() {
        System.out.println("Sobre este curso");
        System.out.println("Nome do curso " + this.getNome_curso());
        System.out.println("Numeros de Bimestres " + this.getBimestre());
        System.out.println("Numero de Alunos do Curso " + this.getTotal_alunos());
    }

    void Nomes_alunos(String N_alunos[]) {
        for (int i = 0; i < getTotal_alunos(); i++) {
            System.out.println("Digite o nome do aluno");
            N_alunos[i] = input.next();

        }
    }
    void Notas_alunos(double[][]notas_alunos,String[]N_alunos) {
        for (int i = 0; i < getTotal_alunos(); i++) {
            for (int j = 0; j < getBimestre(); j++) {
                System.out.println("Digite a Nota do Aluno " + N_alunos[i] + " do " + (j + 1) + " Bimestre");
                notas_alunos[i][j] = input.nextDouble();
            }
        }
    }

    void Media_alunos(double[][]notas_alunos,String[]N_alunos,double[]media_alunos) {
        for(int i = 0; i < getTotal_alunos();i++){
            for(int j = 0; j < getBimestre();j++){
                media_alunos[i] += notas_alunos[i][j];
            }
            media_alunos[i]/= getBimestre();
        }
     
    }

    void resultado(double[]media_alunos,String[]N_alunos) {
        for(int i = 0; i < getTotal_alunos();i++){
            if (media_alunos[i] >= Nota_minima){
                System.out.println("Aluno " + N_alunos[i] + " Media " + media_alunos[i] + " Situação Aprovado!!!");
            }else{
                 System.out.println("Aluno " + N_alunos[i] + " Media " + media_alunos[i] + " Situação Reprovado!!!");
            }
            
        }
    }

}
