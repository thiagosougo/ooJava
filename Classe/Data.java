package Classe;

public class Data {
    int dia;
    int mes;
    int ano;
    final int x = 3;

    Data() {
       this(1, 1, 1970);
    }

    Data(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    String obterDadaFormatada() {
        return String.format("%d/%d/%d", dia, mes, ano);
    }
}
