package registrosUnioes;

public class Valor {

    private int inteiro;
    private Double decimal;
    private String texto;

    public void setValor (int valor){
        this.inteiro = valor;
        this.decimal = 0.0;
        this.texto = null;
    }
    public void setValor (double valor) {
        this.inteiro = 0;
        this.decimal = valor;
        this.texto = null;
    }
    public void setValor(String valor) {
        this.inteiro = 0; 
        this.decimal = 0.0;
        this.texto = valor;
    }
    public void exibirValor() {
        if (this.texto != null ) {
            System.out.println("Valor: " + this.texto);
            }else if (this.decimal != 0.0) {
                System.out.println("Valor: " + this.decimal);
            }else {
                System.out.println("Valor: " + this.inteiro);

            }
        }

    }
    



