
package animais;

public abstract class Animal {
    
    protected float real;
    protected int idade;
    protected int membros;
    
    //metodos abstratos
    
    public abstract void locomover();
        
    
    public abstract void alimentar();
        
    
    public abstract void emitirSom();
        

    public float getReal() {
        return real;
    }

    public void setReal(float real) {
        this.real = real;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getMembros() {
        return membros;
    }

    public void setMembros(int membros) {
        this.membros = membros;
    }
    
    
}
