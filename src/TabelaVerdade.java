public class TabelaVerdade {

    public static void main(String[] args){
        System.out.println("Tabela da verdade para o operador AND (&&):");
        System.out.println("A\tB\tA && B");
        System.out.println(true + "\t" + true + "\t" + (true));
        System.out.println(true + "\t" + false + "\t" + (false));
        System.out.println(false + "\t" + true + "\t" + (false));
        System.out.println(false + "\t" + false + "\t" + (false));
        
        System.out.println();
        
        
        System.out.println("Tabela da verdade para o operador OR (ll):");
        System.out.println("A\tB\tA ll B");
        System.out.println(true + "\t" + true + "\t" + (true));
        System.out.println(true + "\t" + false + "\t" + (true));
        System.out.println(false + "\t" + true + "\t" + (true));
        System.out.println(false + "\t" + false + "\t" + (false));
        
        



        
    }
    

}
