package dir.aulas.operators;
public class Operators01 {
    public static void main(String[] args) {
        //classe Operadores.java
        String nomeCompleto = "LINGUAGEM" + "JAVA";
        System.out.println(nomeCompleto);
                
        //qual o resultado das expressoes abaixo?
        String concatenacao = "?";
        System.out.println(concatenacao);
        
        concatenacao = 1+1+1+"1"; //31
        System.out.println(concatenacao);
        
        concatenacao = 1+"1"+1+1; //1111
        System.out.println(concatenacao);
        
        concatenacao = 1+"1"+1+"1"; //1111
        System.out.println(concatenacao);
        
        concatenacao = "1"+1+1+1; //1111
        System.out.println(concatenacao);

        concatenacao = "1" + (1 + 1 + 1); //13 
        System.out.println(concatenacao);
    }
}
