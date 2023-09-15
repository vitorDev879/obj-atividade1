import java.util.Scanner;

public class Program {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("1. Crie um programa que recebe 2 números e mostra a soma, multiplicação, divisão e subtração: ");
        System.out.println("Digite 2 numeros: ");

        int numero1 = sc.nextInt();
        int numero2 = sc.nextInt();

        System.out.println("A soma dos numeros são: "+ (numero1 + numero2));
        System.out.println("A multiplicação dos numeros são: "+ (numero1 * numero2));
        System.out.println("A divisão dos numeros são: "+ (numero1/numero2));
        System.out.println("A subtração dos numeros são: "+ (numero1 - numero2));

        System.out.println("2. Crie um programa que receba 3 números e mostre a média: ");
        System.out.println("Digite 3 números");

        float numero3 = sc.nextInt();
        float numero4 = sc.nextInt();
        float numero5 = sc.nextInt();

        float media = (numero3 + numero4 + numero5) / 3;

        System.out.println("A média é: "+ media);

    }
}
