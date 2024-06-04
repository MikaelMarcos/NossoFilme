public class Condicional {
    public static void main(String[] args) {
        int ano=2021;
        boolean tem_assinatura=false;
        String tipoPlano="free";

        if(ano>=2022){
            System.out.println("novo filme");
        }else{
            System.out.println("filme véi");
        }

        if( tem_assinatura || tipoPlano.equals("plus") ){
            System.out.println("Tá liberado !");
        }else{
            System.out.println("nops");
        }
    }
}
