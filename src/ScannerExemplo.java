import java.util.Scanner;

public class ScannerExemplo {
    public static void main (String [] args){
        try (Scanner scanner = new Scanner (System.in)) {
            System.out.print("Digite seu nome: ");
            String nome = scanner.nextLine();
            
            System.out.print("Digite sua idade: ");
            int idade = scanner.nextInt();
            
            System.out.println("Ola meu nome e " + nome + " e eu tenho " + idade + " anos ");
        }
        
    }
}
