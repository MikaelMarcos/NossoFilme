
public class Main {
    public static void main(String[] args) {
        System.out.println("Bem-vindo ao Nosso Filme");
        System.out.println("Filme: Top Gun: Maverick");

        int anoDeLancamento=2022;
        System.out.println("Ano de lançamento:" + anoDeLancamento);
        boolean incluidoNoPlano=true;

        double notaDoFilme=8.1;

        //media calculada pelas 3 notas
        double media= (9.8 + 6.3 + 8.0)/3;
        System.out.println(media);

        String sinopse;
        sinopse = """
                filme é top gun
                filme de aventura dos anos 80
                muito bom
        """+anoDeLancamento;
        System.out.println(sinopse);

        int classificacao;
        classificacao=(int)(media/2);
        System.out.println(classificacao);

    }
}