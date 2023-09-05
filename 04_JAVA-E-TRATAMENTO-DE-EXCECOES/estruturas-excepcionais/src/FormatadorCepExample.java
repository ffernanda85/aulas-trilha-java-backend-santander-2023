public class FormatadorCepExample {
    public static void main(String[] args) {
        try {
            String cepFormatado = FormatarCep("53431275");
            System.out.println(cepFormatado);
        } catch (CepInvalidException e) {
            System.out.println("O cep não corresponde com as regras de negócio");
        }
    }
    
    static String FormatarCep(String cep) throws CepInvalidException {
        if(cep.length() != 8)
            throw new CepInvalidException();

        //simulando um cep formatado
        return "53.431-275";
    }
}
