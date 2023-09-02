public class SchoolResult {
    public static void main(String[] args) {
        int note = 4;

        if(note >= 7)
            System.out.println("Aprovado");

        else if (note >= 5 && note < 7)
            System.out.println("Recuperação");
            
        else
            System.out.println("Reprovado");
    }
}
