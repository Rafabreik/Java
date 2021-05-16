/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mediaalunos;

/**
 *
 * @author RAFA-DESK
 */
public class MediaAlunos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Cursos c1 = new Cursos("Cia",2,2);
        
        
        Cursos c2 = new Cursos("fatec",3,3);
        
        
        String N_alunos[] = new String[c1.getTotal_alunos()];
        double notas_alunos[][] = new double[c1.getTotal_alunos()][c1.getBimestre()];
        double media_alunos[] = new double[c1.getTotal_alunos()];
        
        c1.Nomes_alunos(N_alunos);
        c1.Notas_alunos(notas_alunos,N_alunos);
        c1.Media_alunos(notas_alunos,N_alunos,media_alunos);
        c1.resultado(media_alunos,N_alunos);
        
        c2.Nomes_alunos(N_alunos);
        c2.Notas_alunos(notas_alunos, N_alunos);
        c2.Media_alunos(notas_alunos, N_alunos, media_alunos);
        c2.status();
        
        
        
    }
}