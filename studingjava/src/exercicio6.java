import java.util.Scanner;

public class exercicio6 {
    

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int num = sc.nextInt();

        int numMaior = (num + 1);
        int numMenor = (num - 1);

        System.out.println("Número posterior: " + numMaior);
        System.out.println("Número anterior: " + numMenor);

        sc.close();
    }
}