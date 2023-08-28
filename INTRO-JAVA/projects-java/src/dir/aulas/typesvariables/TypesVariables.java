package dir.aulas.typesvariables;
public class TypesVariables {
    public static void main(String[] args) throws Exception {
        String myName = "Flávia Fernanda";
        //um tipo short não aceita um tipo int.. por isso foi necessário fazer o cast(conversão para short)
        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        short numeroCurto2 = (short) numeroNormal;//cast (int -> short)

        int numero = 5;

        numero = 10;

        final double VALOR_PI = 3.14;
        //VALOR_PI = 3.15; // apresenta erro de compilação, pois VALOR_PI é uma constante e seu valor não pode ser alterado.
    }
}
