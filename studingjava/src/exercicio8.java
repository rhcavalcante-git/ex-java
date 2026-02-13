import java.util.Scanner;
import java.util.Locale;

public class exercicio8 {
    
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite seu peso em KG: ");
        double peso = sc.nextDouble();
        System.out.print("Digite sua altura: ");
        double altura = sc.nextDouble();

        double imc = peso / (altura * altura);
        System.out.println("Resultado do seu IMC: " + String.format("%.2f", imc));

        if (imc <= 18.5) {
            System.out.println("Magro");
        } else if (imc > 18.5 && imc <= 24.9) {
            System.out.println("Normal");
        } else if (imc >= 25 && imc <= 29.9) {
            System.out.println("Sobrepeso");
        } else if (imc >= 30 && imc <= 39.9) {
            System.out.println("Obesidade");
        } else {
            System.out.println("Obesidade grave");
        }

        sc.close();
     }
}