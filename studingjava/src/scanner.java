import java.util.Locale;
import java.util.Scanner;

public class scanner {
    
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        String nome;
        double salario, altura;
        int idade;
        char genero;

        System.out.print("Digite o seu nome: ");
        nome = sc.nextLine();
        System.out.print("Digite sua idade: ");
        idade = sc.nextInt();
        System.out.print("Digite sua altura: ");
        altura = sc.nextDouble();
        System.out.print("Digite seu salário: ");
        salario = sc.nextDouble();
        System.out.print("Digite M(Masculino) ou F(Feminino): ");
        genero = sc.next().charAt(0);

        System.out.println(nome);
        System.out.println(idade);
        System.out.println(altura);
        System.out.println(salario);
        System.out.println(genero);

        sc.close();
    }
}
