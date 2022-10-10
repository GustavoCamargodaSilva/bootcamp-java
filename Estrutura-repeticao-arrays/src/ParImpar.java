import java.util.Scanner;

public class ParImpar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int quantNumeros;
        int contador = 0;
        int numero;
        int quantPares = 0, quantImpares = 0;

        System.out.println("Quantidade de números: ");
        quantNumeros = scan.nextInt();

        do {
            System.out.println("Numero: ");
            numero = scan.nextInt();

            if (numero % 2 == 0)
                quantPares++;
            else
                quantImpares++;

            contador++;

        } while (contador < quantNumeros);

        System.out.println("Quantidade Par: " + quantPares);
        System.out.println("Quantidade Impar: " + quantImpares);
    }
}
