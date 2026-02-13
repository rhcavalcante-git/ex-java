import java.util.Scanner;

public class exercicio5 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int notaMat, notaPort, notaFisica, notaIng, notaCiencias;
        int media;
        media = 7;

        System.out.print("Digite a nota de Matemática: ");
        notaMat = sc.nextInt();
        System.out.print("Digite a nota de Português: ");
        notaPort = sc.nextInt();
        System.out.print("Digite a nota de Fisica: ");
        notaFisica = sc.nextInt();
        System.out.print("Digite a nota de Inglês: ");
        notaIng = sc.nextInt();
        System.out.print("Digite a nota de Ciências: ");
        notaCiencias = sc.nextInt();

        int notaTotal = (notaMat + notaPort + notaFisica + notaIng + notaCiencias) / 5;
        System.out.println(notaTotal);

        if (notaTotal < media) {
            System.out.println("Aluno reprovado.");           
        } else {
            System.out.println("Aluno aprovado!");
        }

        sc.close();
    }
}
