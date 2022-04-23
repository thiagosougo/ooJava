package encapsulamento.casaA;

public class Paulo {
    Ana esposa = new Ana();

    void TesteAcessos(){
        // System.out.println(esposa.segredo); privado! 
        System.out.println(esposa.facoDentroDeCasa);
        System.out.println(esposa.formaDeFalar);
        System.out.println(esposa.todosSabem);
    }
}
