public class MeasurementSystem {
    public static void main(String[] args) throws Exception {
        String acronyn = "P";

        switch (acronyn) {
            case "P": {
                System.out.println("PEQUENO");
                break;
            }
            case "M": {
                System.out.println("MEDIO");
                break;
            }
            case "G": {
                System.out.println("GRANDE");
                break;
            }
            default: {
                System.out.println("INDEFINIDO");
            }
        }
        

    }
}
