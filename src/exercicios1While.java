import java.util.Scanner;

public class exercicios1While {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int senha = 2002;
        while (x!=2002) {
            System.out.println("senha Invalida");
            x = sc.nextInt();
        }

        System.out.println("Acesso Permitido");
        sc.close();
    }
}


