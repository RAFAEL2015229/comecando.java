package Funcoes;

public class BuscasSequenciais {

    public static int BuscaSequencial(int[] arr, int valor) {

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == valor) {
                return i;
            }
        }
        return -1;
    
    }
    public static void main (String [] args) {
        int [] numeros = {10, 20, 30, 40, 50};
        int ValorBuscado = 50;

        int resultado = BuscaSequencial(numeros, ValorBuscado);

        if(resultado != -1) {
            System.out.println("Valor " + ValorBuscado + " encontrado no indice " + resultado);
        }else {
                System.out.println("Valor " + ValorBuscado + " não encontrado. ");
            }

        }
    }



