package dir.aulas.firstclass;
public class CallMethod {
    public static void main(String[] args) {
        //Criando variáveis para passar como argumento ao método que será chamado
        String firstName = "Flávia";
        String lastName = "Fernanda";
        // Chamando o método fullName passando por argumento as variáveis criadas
        String fullName = fullName(firstName, lastName);
        System.out.println(fullName);
    }
    
    //Novo método para concatenar e retornar o nome completo, é chamado pela class main
    public static String fullName(String firstName, String lastName) {
        return "Result Method: " + firstName.concat(" ").concat(lastName);
    }
}
