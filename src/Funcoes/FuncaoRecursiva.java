package Funcoes;

public class FuncaoRecursiva {

    int fatorial(int n) {
        if (n == 0 || n == 1 ) {
            return 1;
        } else {
            System.out.println("rescursivo contador = " + n);
            return n * fatorial (n - 1);
        }
    }
    public static void main(String[] args) {
        FuncaoRecursiva exemplo = new FuncaoRecursiva();
        int numero = 5;
        int resultado = exemplo.fatorial(numero);
        System.out.println("Fatorial de " + numero + " é: " + resultado);

    }





}
