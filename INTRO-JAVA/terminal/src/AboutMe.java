import java.util.Locale;
import java.util.Scanner;

public class AboutMe {
    public static void main(String[] args) {
        //RECEBENDO DADOS DO USUÁRIO COM ARGS
        //os argumentos começam com indice 0
        /* String nome = args [0];
        String sobrenome = args [1];
        int idade = Integer.valueOf(args[2]); //vamos falar sobre Wrappers
        double altura = Double.valueOf(args[3]); */

        //RECEBENDO DADOS DO USUÁRIO COM A CLASS SCANNER
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Write your name: ");
        String name = scanner.next();

        System.out.println("Write your lastname: ");
        String lastName = scanner.next();

        System.out.println("Write your age:");
        int age = scanner.nextInt();

        System.out.println("Write your height:");
        double height = scanner.nextDouble();

        System.out.println("Ola, me chamo " + name + " " + lastName);
        System.out.println("Tenho " + age + " anos ");
        System.out.println("Minha altura é " + height + "cm ");
    }
}
