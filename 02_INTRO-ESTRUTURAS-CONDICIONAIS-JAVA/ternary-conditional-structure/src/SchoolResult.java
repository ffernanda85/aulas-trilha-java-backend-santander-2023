public class SchoolResult {
    public static void main(String[] args) throws Exception {
        int note = 8;

        String result = note >= 7 ? "Aprovado" : note >= 5 && note > 7 ? "Recuperação" : "Reprovado";
        
        System.out.println("O aluno está: " + result);
    }
}
