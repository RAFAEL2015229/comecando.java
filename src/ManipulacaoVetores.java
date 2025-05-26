public class ManipulacaoVetores {

    public static void mains (String [] args) {
        int[] numeros = {1, 2, 3, 4, 5};

        int comprimento = numeros.length;
        System.out.println("O comprimento do vetor é: " + comprimento);
        
        System.out.println("\n mostrar cada elemento: implementacao por extenso");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros [i]);
        }
        System.out.println("\nMostrar cada elemento: implementacao simplificado");
        for (int numero : numeros ) {
            System.out.println(numero);

        }
    }

}
