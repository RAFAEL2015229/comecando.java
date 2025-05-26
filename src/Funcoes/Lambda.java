package Funcoes;

import java.util.function.Consumer;

public class Lambda {

    
    public static void main (String [] args){
        Consumer<String> imprimirMensagem = mensagem -> System.out.println(mensagem);

        imprimirMensagem.accept("Ola, mundo! Este e um exemplo de função lambda.");

    }
    



}