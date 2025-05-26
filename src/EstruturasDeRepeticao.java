public class EstruturasDeRepeticao {

    public static void main (String [] args) {
        
        System.out.println("Estrutura for: ");
        for (int i = 1; i <= 5; i++) {
            System.out.println("i = " + i);
        }
        System.out.println("CONTINUANDO");
        
        
        System.out.println("Estrutura while:");
        int j = 1;
        while (j <=5) {
            System.out.println("j = " + j);
            j++;
        }
        System.out.println("CONTINUANDO");
        
        
        System.out.println("Estrutura do-While:");
        int k = 1; 
        do { 
            System.out.println("K = " + k);
            k++;

        } while (k <=5);

    }
}
