import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        
       Scanner Input = new Scanner(System.in);
       
       //4. Dado um nome (String) não composto, imprimir a quantidade de caracteres deste nome.
       
       String palavra;
       
        System.out.println("Digite a palavra: ");
        
        palavra = Input.next();
        
        String exampleString = palavra;
       
        int StringL = exampleString.length();

        System.out.println("A palavra" + palavra + "possue: " + StringL +  " letras" );
    }   
}
  