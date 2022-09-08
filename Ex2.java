import java.util.Scanner;

public class Ex2 {
    
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        
        // 2. Dado um valor inteiro N imprimir os 3 primeiros múltiplos deste valor;
        
        System.out.println( "Digite o valor de N1: ");
        
        int N1 = Input.nextInt();
        
        int mult1 = 1;
        
        int mult2 = 2;
        
        int mult3 = 3;
        
        int Multi1 = N1 * mult1;
        
        int Multi2 = N1 * mult2;
        
        int Multi3 = N1 * mult3;
        
        System.out.println(" Os 3 primeiros multiplos deste numero são: " + Multi1 + "," + Multi2 + "," + Multi3 );
                
    }
    
}
