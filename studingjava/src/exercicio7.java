import java.util.Scanner;

public class exercicio7 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite dois números para descobrir o maior");
        System.out.print("Digite o primeiro número: ");
        int num1 = sc.nextInt();
        System.out.print("Digite o segundo número: ");
        int num2 = sc.nextInt();

        if (num1 > num2) {
            System.out.println(num1 + " Maior");
        } else if (num1 == num2) {
            System.out.println("Números iguais");
        } else {
            System.out.println(num2 + " Maior");
        }

        sc.close();
    }
}