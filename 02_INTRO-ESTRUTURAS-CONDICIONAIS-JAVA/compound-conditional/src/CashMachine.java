public class CashMachine {
    public static void main(String[] args) {
        double saldo = 25.0;
        double valorSolicitado = 26.0;

        if (valorSolicitado < saldo) {
            saldo = saldo - valorSolicitado;
            System.out.println("Saldo atual é: " + saldo);
        } else {
            System.out.println("Saldo insuficiente, seu saldo atual é: " + saldo);
        }
    }
}
