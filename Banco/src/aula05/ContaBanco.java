
package aula05;


public class ContaBanco {
    //Atributos
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;
    //Métodos personalizados
    public void estadoAtual(){
        System.out.println("---------------");
        System.out.println("Conta: "+this.getNumConta());
        System.out.println("Dono: "+this.getDono());
        System.out.println("Tipo: "+this.getTipo());
        System.out.println("Saldo: "+this.getSaldo());
        System.out.println("Status: "+this.isStatus());
    }
            
    
    
    public void abrirConta(String t){
        this.setTipo(t);
        this.setStatus(true);
        if ("CC".equals(t)) {
            this.setSaldo(50);   
        }else if (t == "CP"){
            this.setSaldo(150);
        }
        System.out.println("Conta Aberta com Sucesso!!");
    }
    public void fecharConta(){
        if(this.getSaldo() > 0){
            System.out.println("Conta não pode ser Finalizada pois possui saldo");
        }else if (this.getSaldo() < 0){
            System.out.println("Conta não pode ser Finalizada pois possui debito");
        }else{
            this.setStatus(false);
            System.out.println("Conta Finalizada com Sucesso!!");
        }
        
    }
    public void depositar(float sal){
        if(this.isStatus() == true){
            //this.saldo += sal;
            this.setSaldo(this.getSaldo()+sal);
            System.out.println("Deposito realizado na conta de "+this.getDono());
        }else{
            System.out.println("Não foi possivel depositar na conta!! conta Status Encerrada!!");
        }
    }
    public void sacar(float sal){
        if(this.isStatus()){
            if(this.getSaldo() >= sal){
                this.setSaldo(this.getSaldo()-sal);
                System.out.println("Saque Realizado na conta de "+this.getDono());
            }else{
                System.out.println("Saldo insuficiente para saque!!");
            }
        }else{
            System.out.println("Impossivel sacar de uma conta Fechada!!");
        }
    }
    public void pagarMensal(){
        int v = 0;
        if (this.getTipo()== "CC") {
            v = 12;
        } else if (this.getTipo()=="CP"){
            v = 20;
        }
        if(this.isStatus()){
            this.setSaldo(this.getSaldo()-v);
            System.out.println("Mensalidade paga com Sucesso por "+ this.getDono());
        }else{
            System.out.println("Não foi possivel realizar o pagamento Status Conta Fechado");
        }
    }
    //Métodos Especiais

    public ContaBanco() {
        this.saldo = 0;
        this.status = false;
        
    }

    public int getNumConta() {
        return this.numConta;
    }

    public void setNumConta(int n) {
        this.numConta = n;
    }

    public String getTipo() {
        return this.tipo;
    }

    public void setTipo(String t) {
        this.tipo = t;
    }

    public String getDono() {
        return this.dono;
    }

    public void setDono(String d) {
        this.dono = d;
    }

    public float getSaldo() {
        return this.saldo;
    }

    public void setSaldo(float sal) {
        this.saldo = sal;
    }

    public boolean isStatus() {
        return this.status;
    }

    public void setStatus(boolean sta) {
        this.status = sta;
    }
    
    
    
}
