public class EstruturasCondicionais {

    public static void main (String [] args){
        int numero = -1;


        if (numero > 0){
            System.out.println("O numero e positivo.");
        }
        else if (numero < 0){
            System.out.println("O numero e negativo.");
        }
        
        if (numero % 2 == 0) {
            System.out.println("O numero e par.");
        } else {
            System.out.println("O numero e impar.");
        }
        
        if (numero > 0) {
            System.out.println("O numero e positivo.");
        }
        else if (numero < 0) {
            System.out.println("O numero e negativo.");   
        } else {
            System.out.println("O numero e zero.");   
          
        }
    }

}
