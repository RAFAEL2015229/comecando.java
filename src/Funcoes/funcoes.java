package Funcoes;

public class funcoes {

    
    public static int soma (int a, int b) {
        return a + b;
    }

    public static int subtracao() {
        int a = 100; 
        int b = 60;

        return a - b;
    }
    public static void imprimirMensagem(String mensagem){
        System.out.println(mensagem);
    }

    public static void imrprimirNaTela() {
        System.out.println("Essa função nao tem um parametro");
        
    }
     public static void main(String[] args){

        int resultado = soma(5, 7);
        System.out.println("O resultado e: " + resultado);
        System.out.println("O resultado e: " + soma(50, 70));
        
        System.out.println("O resultado e: " + subtracao());

        imprimirMensagem("Ola, esta e a sua mensagem de exemplo! ");


     }


     
}
