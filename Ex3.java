import java.util.Scanner;

public class Ex3 {
    
    public static void main(String[] args) {
        
       Scanner Input = new Scanner(System.in);
        
       //3. Dado um valor inteiro de 1 até 10, imprimir a “tabela” da tabuada deste valor;
       
        System.out.println("Digite o valor de N1");
        
        int N1 = Input.nextInt();
        
        for (int i = 0; i <= 10; i++) {
        
          System.out.println(N1 + " x " + i + " = " + (N1 * i));
        }
    }
        
        
       
       
    }

