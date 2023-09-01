package dir.aulas.firstclass;
public class StudentReportCard {
    public static void main(String[] args) {
        int media = 6;

        if (media < 6) {
            System.out.println("REPROVADO");
        } else if(media == 6) {
            System.out.println("RECUPERAÇÃO");
        }else{
            System.out.println("APROVADO");
        }
    }
}
