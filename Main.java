import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int inteiro = 0;

        System.out.println("Bem vindo ao programa que calcula fatorial!");
        System.out.println("Informe um número inteiro para o calculo:");
        System.out.println( fatorial (inteiro = scan.nextInt()));

    }

    private static int fatorial(int inteiro){

        if ( inteiro > 0) {
            return inteiro * fatorial(inteiro - 1);
        }
    return 1;
    }
}