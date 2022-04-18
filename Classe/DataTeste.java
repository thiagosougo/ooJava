package Classe;
public class DataTeste {
    public static void main(String[] args) {
        Data d1 = new Data();
        d1.dia = 7;

        
        Data d2 = new Data(12, 03, 2001);
        System.out.println(d1.obterDadaFormatada());
        System.out.println(d2 .obterDadaFormatada());
    }
}
