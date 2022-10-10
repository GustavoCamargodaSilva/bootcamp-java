import java.util.Scanner;

public class Media {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numero;
        int maior = 0;
        int contador = 0;
        int soma = 0;

        do {
            System.out.println("Numero: ");
            numero = scan.nextInt();

            soma = soma + numero;

            contador = contador + 1;

            if (numero > maior)
                maior = numero;
        } while (contador < 5);

        System.out.println("A média foi: " + (soma / 5));
        System.out.println("O maior número foi: " + numero);

    }
}
