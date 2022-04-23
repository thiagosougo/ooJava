package Heranca;

public class Jogo {
    public static void main(String[] args) {
        Jogador monstro = new Monstro();
        monstro.x = 10;
        monstro.y = 10;

    
        Jogador heroi = new Heroi(10, 11);
    
        System.out.println(monstro.vida);
        System.out.println(heroi.vida);
        
        monstro.atacar(heroi);
        monstro.atacar(monstro);

        System.out.println("Monstro tem => " + monstro.vida);
        System.out.println("Herói tem =>" + heroi.vida);
    }
}
