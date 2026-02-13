import java.util.Scanner;

public class exercicio2 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int numero1, numero2, resultado;
        char operador;

        System.out.println("Digite o primeiro número: ");
        numero1 = sc.nextInt();
        System.out.println("Selecione o operador (+, -, * ou /)");
        operador = sc.next().charAt(0);
        System.out.println("DIgite o segundo número: ");
        numero2 = sc.nextInt();

        if (operador == '+') {
            resultado = numero1 + numero2;
            System.out.println("Resultado: " + resultado);

        } else if (operador == '-') {
            resultado = numero1 - numero2;
            System.out.println("Resultado: " + resultado);

        } else if (operador == '*') {
            resultado = numero1 * numero2;
            System.out.println("Resultado: " + resultado);

        } else if (operador == '/') {
            resultado = numero1 / numero2;
            System.out.println("Resultado: " + resultado);

        } else {
            System.out.println("Operador inválido");
        }

        sc.close();
    }
}