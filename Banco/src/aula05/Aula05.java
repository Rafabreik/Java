
package aula05;


public class Aula05 {

   
    public static void main(String[] args) {
       ContaBanco p1 = new ContaBanco();
       p1.setNumConta(123456);
       p1.setDono("Rafael");
       p1.abrirConta("CC");
       
       
       
       ContaBanco p2 = new ContaBanco();
       p2.setNumConta(54321);
       p2.setDono("Leonel");
       p2.abrirConta("CP");
       
       p1.depositar(300);
       p2.sacar(50);
      
       p1.pagarMensal();
       p2.pagarMensal();
       
       p1.sacar(200);
       p2.sacar(80);
       p2.fecharConta();
       
       p1.estadoAtual();
       p2.estadoAtual();
       
    }
    
    
}
