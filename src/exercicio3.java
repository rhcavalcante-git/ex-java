import java.util.Scanner;

public class exercicio3 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int graus;
        double faren;

        System.out.print("Digite o grau que quer converter para Fahrenheit: ");
        graus = sc.nextInt();

        faren = graus * 1.8 + 32;

        System.out.println("Resultado em Fahrenheit: " + faren);

        sc.close();
    }
}