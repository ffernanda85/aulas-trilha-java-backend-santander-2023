package dir.aulas.operators;

public class Increment {
    public static void main(String[] args) {
        int number = 5;

        number++;//increment 1
        System.out.println(number); // return 6: já recebe o valor incrementado em 1 da linha 7

        System.out.println(number++); // return 6: retorna o valor e depois incrementa
        System.out.println(++number); // return 8: recebe o valor já incrementado na linha 10 e incrementa mais 1 para depois retornar.
    }
}
