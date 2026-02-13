import java.util.Locale;

public class variaveis {
    public static void main(String[] args) throws Exception {
        
        Locale.setDefault(Locale.US);

        String nome;
        int idade;
        char genero;
        double altura;
        double salario;

        nome = "Maria da Silva";
        idade = 25;
        genero = 'F';
        altura = 1.65;
        salario = 3200.5;

        System.out.println("Meu nome é " + nome + ", tenho " + idade + " anos e sou do genero " + genero + 
            " tenho " + altura + " de altura e recebo atualmente " + salario + " reais.");
    }
}


