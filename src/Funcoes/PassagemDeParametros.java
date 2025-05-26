package Funcoes;

public class PassagemDeParametros {
    public static void modificarValor(int numero) {

        numero = numero * 2;
        System.out.println("Dentro do metodo (Valor primitivo): " + numero);

    }

    public static void modificarObjeto(Pessoa pessoa) {
        pessoa.nome = "joao";  
    }

    public static void reatribuirObjeto (Pessoa pessoa) {
        pessoa = new Pessoa();
        pessoa.nome = "maria";
        System.out.println("De dentro da funcao reatribuir = " + pessoa.nome);
    }

    public static void main (String [] args) {
        int numero = 10;
        System.out.println("Antes do metodo (valor primitivo): " + numero);
        modificarValor(numero);
        System.out.println("Depois do metodo (valor primitivo): " + numero);
        
        
        System.out.println("\n--------");
        Pessoa pessoa = new Pessoa();
        pessoa.nome = "Carlos";
    System.out.println("\nAntes do metodo (objeto): " + pessoa.nome);
    modificarObjeto(pessoa);
    System.out.println("Depois do metodo (objeto): " + pessoa.nome);
    
    reatribuirObjeto(pessoa);
    System.out.println("Depois de tentar reatribuir (objeto): " + pessoa.nome);


    }



}

class Pessoa{
    String nome;
}



