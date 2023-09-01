package dir.aulas.operators;

public class Ternary {
    public static void main(String[] args) {
        
        // classe Operadores.java
        int a, b;

        a = 5;
        b = 6;

        //EXEMPLO DE CONDICIONAL UTILIZANDO UMA ESTRUTURA IF/ELSE
        /* String result;

        if(a == b)
        result = "verdadeiro";
        else
        result = "falso"; */
        

        //MESMA CONDICIONAL, MAS DESSA VEZ, UTILIZANDO O OPERADOR CONDICIONAL TERNÁRIO
        String result = a == b ? "TRUE" : "FALSE";

        System.out.println(result);
        
    }
    
}