package Control;

public class ControleRemoto implements Controlador {

    //Atributos
    private int volume;
    private boolean ligado;
    private boolean tocando;
    //Medotos Especiais 

    public ControleRemoto() {
        this.setVolume(50);
        this.setLigado(true);
        this.setTocando(false);

    }

    private int getVolume() {
        return volume;
    }

    private void setVolume(int vol) {
        this.volume = vol;
    }

    private boolean isLigado() {
        return ligado;
    }

    private void setLigado(boolean lig) {
        this.ligado = lig;
    }

    private boolean isTocando() {
        return tocando;
    }

    private void setTocando(boolean t) {
        this.tocando = t;
    }

    @Override
    public void ligar() {
        this.setLigado(true);
    }

    @Override
    public void desligar() {
        this.setLigado(false);
    }

    @Override
    public void abrirMenu() {
        if (this.isLigado()) {
            System.out.println("====MENU======");
            System.out.println("Está ligado? " + this.isLigado());
            System.out.println("Está Tocando? " + this.isTocando());
            System.out.print("Volume: " + this.getVolume());
            for (int i = 0; i <= this.getVolume(); i += 10) {
                System.out.print(" | ");
            }

        }
    }

    @Override
    public void fecharMenu() {
        if (this.isLigado()) {
            System.out.println("Fechando Menu...");
        }
    }

    @Override
    public void maisVolume() {
        if (this.isLigado()) {
            this.setVolume(this.getVolume() + 5);
        } else {
            System.out.println("Impossivel Almentar o Volume");
        }
    }

    @Override
    public void menosVolume() {
        if (this.isLigado()) {
            this.setVolume(this.getVolume() - 5);
        } else {
            System.out.println("Impossivel Diminuir o Volume");
        }
    }

    @Override
    public void ligarMundo() {
        if (this.isLigado() && this.getVolume() > 0) {
            this.setVolume(0);
        }
    }

    @Override
    public void desligarMudo() {
        if (this.isLigado() && this.getVolume() == 0) {
            this.setVolume(50);
        }
    }

    @Override
    public void play() {
        if (this.isLigado() && !(this.isTocando())) {
            this.setTocando(true);
        } else {
            System.out.println("Não consegui Reproduzir !!");
        }

    }

    @Override
    public void pause() {
        if (this.isLigado() && this.isTocando()) {
            this.setTocando(false);
        } else {
            System.out.println("Não consegui Pàusar !!");
        }

    }
}
