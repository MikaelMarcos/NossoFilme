import java.util.Scanner;

public class Leitura {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("digite seu filme favorito");
        String filme = ler.nextLine();
        System.out.println(filme);
        System.out.println("Digite o ano:");
        int ano = ler.nextInt();
        System.out.println(ano);
        double ava = ler.nextDouble();
        System.out.println(ava);


    }
}
