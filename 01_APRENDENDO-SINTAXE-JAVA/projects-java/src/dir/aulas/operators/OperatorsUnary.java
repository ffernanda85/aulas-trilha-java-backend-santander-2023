package dir.aulas.operators;

public class OperatorsUnary {
    public static void main(String[] args) {
        int number = 5;

        number = - number;// negando o valor de number -> -5
        System.out.println(number); // -5 

        number = - number; // aqui eu neguei mais uma vez, tornando number positivo novamente.
        System.out.println(number); // 5

        // o sinal de ( - ) é um operador de negação!
    }
}
