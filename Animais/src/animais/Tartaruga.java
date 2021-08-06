
package animais;


public class Tartaruga extends Reptil {
    
    @Override
    public void locomover(){
        System.out.println("Andando Lentamente");
    }
    @Override
    public void emitirSom(){
        System.out.println("Não Emite som");
        
    }
    public void entrarCasco(){
        System.out.println("Dentro do Casco");
    }
    
    
}
