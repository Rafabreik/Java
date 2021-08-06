
package animais;


public class Animais {

 
    public static void main(String[] args) {
        Mamifero m = new Mamifero();
        Reptil r = new Reptil();
        Peixe p = new Peixe();
        Ave v = new Ave();
        
        Canguru kangaroo = new Canguru();
        Cobra snake = new Cobra();
        Tartaruga t = new Tartaruga();
        Cachorro dog = new Cachorro();
        
        kangaroo.alimentar();
        kangaroo.locomover();
        
        dog.locomover();
        dog.alimentar();
        
        snake.alimentar();
        snake.locomover();
        
        
        
        
        
    }
    
}
