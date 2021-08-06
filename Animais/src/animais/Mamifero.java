
package animais;


public class Mamifero extends Animal {
    
    private String corpelo;
    
    @Override
    public void locomover(){
        System.out.println("correndo");
    }
    @Override
    public void alimentar(){
        System.out.println("mamando");
    }
    @Override
    public void emitirSom(){
        System.out.println("Som de mamifero");
    }

    public String getCorpelo() {
        return corpelo;
    }

    public void setCorpelo(String corpelo) {
        this.corpelo = corpelo;
    }
    
    
}
