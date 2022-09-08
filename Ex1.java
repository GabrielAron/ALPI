import java.util.Scanner;

public class Ex1 {
    
    public static void main(String[] args) {
        
        Scanner Input = new Scanner(System.in);
        
     // 1. Dados 3 valores reais (float ou double) imprimir o valor do produto destes valores;
       
        System.out.println("Digite o valor de N1: ");
        
        float N1 =  Input.nextInt();
        
        System.out.println("Digite o valor de N2: ");
        
        float N2 = Input.nextInt();
        
        System.out.println("Digite o valor de N3: ");
        
        float N3 = Input.nextInt();
        
        float soma = N1 * N2 * N3;
        
        System.out.print(" O valor do produto desses valores é igual a: " + soma);
              
        
    }
}
