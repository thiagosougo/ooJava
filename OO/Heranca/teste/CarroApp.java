package teste;

import Carro.Carro;
import Carro.Ferrari;
import Carro.Fusquinha;

public class CarroApp {
    public static void main(String[] args) {
        Carro c1 = new Fusquinha(50);

        c1.acelerar();
        System.out.println(c1);

        c1.acelerar();
        System.out.println(c1);

        c1.acelerar();
        System.out.println(c1);

        Ferrari c2 = new Ferrari(400);
        c2.ligarTurbo();
        c2.ligarAr();
        c2.desligarAr();

        System.out.println(c2.velocidadeDoAr());

        c2.acelerar();
        c2.frear();
        System.out.println(c2);

        c2.acelerar();
        System.out.println(c2);

        c2.acelerar();
        System.out.println(c2);
    }
}
