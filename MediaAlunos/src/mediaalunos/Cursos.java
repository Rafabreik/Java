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
    public int Total_alunos;
    public int Bimestre;
    final double Media = 7;
    private String Nome_curso = " ";
    
    Scanner x = new Scanner (System.in);
    
  
    
    public int total_Bimestre(){
        
        System.out.println("Digite a Quantidade de Bimestres ?");
        this.Bimestre = x.nextInt();
        return Bimestre;

}
    public int alunos(){
        
        System.out.println("Digite a Quantidade de Alunos ?");
        this.Total_alunos = x.nextInt();
        return Total_alunos ;
        
    }
    public String N_curso(){
        System.out.println("Digite o Nome do Curso ? ");
        this.Nome_curso = x.next();
        
        return Nome_curso;
        
    }
    

    
    
}

