import java.util.Scanner;

public class CalculadoraMedia {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira a primeira nota: ");
        double nota1 = scanner.nextDouble();

        System.out.println("Insira a segunda nota: ");
        double nota2 = scanner.nextDouble();

        System.out.println("Insira a terceira nota: ");
        double nota3 = scanner.nextDouble();

        System.out.println("Insira a quarta nota: ");
        double nota4 = scanner.nextDouble();

        double media = (nota1 + nota2 + nota3 + nota4) / 4.0;

        if (media >= 7.0) {
            System.out.println("Parabens, voce está aprovado!!" + media);
        } else {
            System.out.println("Você não está aprovado!" + media);
        }

        scanner.close();
    }
}