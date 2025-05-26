package Funcoes;

public class BuscaBinaria {

    public static int BuscaBinaria(int[] arr, int valor){
        System.out.println("\nComeçando a busca binaria..");
        int esquerda = 0;
        int direita = arr.length - 1;

        System.out.println("Esquerda = " + esquerda + "\n Direita = " + direita);

        while (esquerda <= direita) {
            System.out.print("\nFazendo a busca ENQUANTO... " + 
            "\n Esquerda = " + esquerda + "\n Direita = " + direita );

            int meio = (esquerda + direita) / 2; 
            System.out.println("\n  Meio = " + meio );

            if (arr[meio] == valor){
                return meio;
                
            }
            if (arr[meio] > valor){
                direita = meio - 1;
            }
            
            else{
                esquerda = meio + 1;
            }
            
        }
        return -1;
    
    }
    public static void main (String[] args) {
        int [] numeros = {10, 20 ,30 , 40 ,50 , 60, 70, 80 ,90 ,100};
        int valorBuscado = 10;

        System.out.println("Tamanho do array = " + numeros.length);
        int resultado = BuscaBinaria(numeros, valorBuscado);

        if (resultado != -1 ) {
            System.out.println("\nValor " + valorBuscado + " encontrado no indice " + resultado);
        } else {
            System.out.println("\nValor " + valorBuscado + " nao encontrado ");
            
        }
    }

}
