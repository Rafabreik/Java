
package projetolivro;


public class ProjetoLivro {

   
    public static void main(String[] args) {
        Pessoa[] p = new Pessoa[3];
        Livro[] l  = new Livro [3];
        
        p[0] = new Pessoa("Maria",24,"F");
        p[1] = new Pessoa("Marcos",20,"M");
        p[2] = new Pessoa("Joselma",36,"F");
       
        
        l[0] = new Livro("Aprendendo Java","José da Silve",130,p[0]);
        l[1] = new Livro("POO para Iniciantes","Pedro Paulo",225,p[1]);
        l[2] = new Livro("Java Avançado","Candido",450,p[2]);
        
        l[2].abrir();
        l[2].folhear(448);
        p[0].fazerAniver();
       
        System.out.println(l[0].detalhes());
        System.out.println(l[1].detalhes());
        System.out.println(l[2].detalhes());
        
    }
    
}
