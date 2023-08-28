package dir.aulas.firstclass;

public class MyFirstClass {
    public static void main(String[] args) {
        // Por convenção variáveis são escritas no formato camelCase
        int ano = 300;
        System.out.println(ano);
        ano = 2021;
        System.out.println(ano);

        int idade = 21;
        System.out.println(idade);
        idade = 22;
        System.out.println(idade);

        String br = "Brasil";
        System.out.println(br);
        br = "Alemanha";
        System.out.println(br);

        // O final antes da variável a torna uma constante
        // Por convenção constantes são escritas em CAIXA_ALTA
        final String NAME_LASTNAME = "Josefa Maria";
        System.out.println(NAME_LASTNAME);
    }
}
