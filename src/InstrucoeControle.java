public class InstrucoeControle {

    public static void main (String [] args) {
        System.out.println("BREAK");
        for (int i = 0; i < 10; i++) {
            if (i == 8 ) {
                break;
            }
            System.out.println("Interação: " + i);
            
            
        }
        System.out.println("\n CONTINUE");
        for (int i = 0; i < 20; i++) {
            if (i % 2 == 0) {
                continue;
                
                
            }
            System.out.println("Interação impar " + i);
        }


    }

}
