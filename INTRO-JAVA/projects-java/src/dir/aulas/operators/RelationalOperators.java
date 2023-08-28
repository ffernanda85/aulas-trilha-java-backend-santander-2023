package dir.aulas.operators;

public class RelationalOperators {
    public static void main(String[] args) {
        
        /* int number1 = 1;
        int number2 = 2;

        boolean simNao = number1 == number2;
        System.out.println(simNao);// false

        simNao = number1 > number2;
        System.out.println(simNao);// false

        simNao = number1 <= number2;
        System.out.println(simNao);// true

        if(number1 > number2)
            System.out.println("NUMBER1 IS GREATER THAN NUMBER2");
        else if(number1 < number2)
            System.out.println("NUMBER1 IS LESS THAN NUMBER2");
        else
            System.out.println("NUMBER1 IS EQUAL TO NUMBER2"); */


        String name = "Flávia";
        String name2 = new String("Flávia");
        //Diferença entre "==" e o "equals"
        // o == compara valores e types
        System.out.println(name == name2);//false, pois o name2 é uma instância de String
        //o equals compara valores de objetos
        System.out.println(name.equals(name2));//true, pois o equals vai comparar o valor de name com a atribuição de name2 e não com o type.

    }
}
