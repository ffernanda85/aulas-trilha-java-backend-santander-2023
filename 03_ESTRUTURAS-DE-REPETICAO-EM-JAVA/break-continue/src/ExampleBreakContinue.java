public class ExampleBreakContinue {
    public static void main(String[] args) throws Exception {
        
        for(int number = 1; number <= 5; number++){
            if(number == 3)
                continue;// imprime = 1, 2, 4, 5
             // break; // imprime = 1, 2
            
            System.out.println(number);
        }
    }
}
