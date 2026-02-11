import java.util.Locale;
import java.util.Scanner;


public class exercicio1 {
    
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int base, altura, resultado;

        System.out.print("Digite o valor da base: ");
        base = sc.nextInt();
        System.out.print("Digite o valor da altura: ");
        altura = sc.nextInt();
        
        resultado = base * altura;
        System.out.println("A área do seu retangulo é igual a " + resultado);

        sc.close();
    }
}