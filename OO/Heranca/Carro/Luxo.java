package Carro;

public interface Luxo {
    void ligarAr();
    void desligarAr();

    default int velocidadeDoAr(){
        return 1;
    }
}
