package Carro;

public class Ferrari extends Carro implements Esportivo, Luxo {

    private boolean ligarTurbo;
    private boolean ligarAr;

    public Ferrari(int velocidadeMaxima) {
        super(velocidadeMaxima);
        setDelta(15);
    }

    @Override
    public void ligarTurbo() {
        ligarTurbo = true;
        setDelta(35);
    }

    @Override
    public void desligarTurbo() {
        ligarTurbo = false;
        setDelta(15);
    }

    @Override
    public void ligarAr() {
        ligarAr = true;
    }

    public void desligarAr() {
        ligarAr = false;
    }

    public int getDelta() {
        if (ligarTurbo && !ligarAr) {
            return 35;
        } else if (ligarTurbo && ligarAr) {
            return 03;
        } else if (!ligarTurbo && !ligarAr) {
            return 20;
        } else
            return 15;
    }

}
