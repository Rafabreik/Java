
package ultraemogicombat;


public class UltraEmogiCombat {

   
    public static void main(String[] args) {
        Lutador l[] = new Lutador[6];
                l[0] = new Lutador("Anderson Silva","Brasil",35,1.85f,92,33,4,2);
                l[1] = new Lutador("Jhon jones","Africa",32,1.95f,98,22,4,0);
                l[2] = new Lutador ("Crocop","Croacia",40,1.87f,100,15,6,5);
                l[3] = new Lutador ("Frank Mir","EUA",34,1.88f,110,14,7,6);
                l[4] = new Lutador ("Dj Pen","Canada",33,1.68f,60,13,2,2);
                l[5] = new Lutador ("Jose Aldo","Brasil",32,1.55f,68,20,3,6);
                
                Luta UFC01 = new Luta();
                UFC01.marcarLuta(l[4], l[5]);
                UFC01.Lutar();
                
                l[2].status();
                l[2].status();
        
    }
    
}
