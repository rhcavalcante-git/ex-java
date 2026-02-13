import java.util.Scanner;

public class exercicio4 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int cont;
        cont = 1;

        System.out.print("Crie um usuário: ");
        String user_cad = sc.nextLine();
        System.out.print("Crie uma senha: ");
        String senha_cad = sc.nextLine();

        System.out.println("Usuário cadastrado com sucesso!");
        System.out.println("-------------------------------");

        System.out.print("Entre com o usuário cadastrado: ");
        String user = sc.nextLine();
        System.out.print("Digite sua senha: ");
        String senha = sc.nextLine();

        while (!user_cad.equals(user) || !senha_cad.equals(senha) ) {
            System.out.println("Usuário ou senha incorretos, tente novamente!");

            System.out.print("Entre com o usuário cadastrado: ");
            user = sc.nextLine();
            System.out.print("Digite sua senha: ");
            senha = sc.nextLine();

            cont++;

            if (cont >=5) {
                System.out.println("Tentativas de login ultrapassadas, por favor reinicie o programa.");
                break;
            }
        }
        
        if (user_cad.equals(user) && senha_cad.equals(senha)) {
                System.out.println("Login feito com sucesso!");
        }

        sc.close();
    }
}