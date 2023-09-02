public class OperatorPlan {
    public static void main(String[] args) {
        String plan = "T";

        /* 
         * B = basic;
         * M = medium;
         * T = turbo;
         */
        //Como não temos o break, os antecessores acabam se utilizando da configuração do posterior diminuindo a poluíção do código.
        //Nesse caso se escolhermos o plan T ele vai imprimir o 5Gb e seguir imprimindo as outras opções, facilitando nosso trabalho.

        switch (plan) {
            case "T": {
                System.out.println("5Gb Youtube");
            }
            case "M": {
                System.out.println("WhatsApp e Instagram grátis");
            }
            case "B": {
                System.out.println("100 minutos de ligação");
            }
        }
    }
}
