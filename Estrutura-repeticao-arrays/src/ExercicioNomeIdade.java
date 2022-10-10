import java.util.Scanner;

//Nesse exercicio foi utilizado o laço de repetição While.
public class ExercicioNomeIdade {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        // Criado o Scanner para leitura dos dados inseridos

        String nome;
        int idade;
        // declaração do tipo dos dados que vou receber

        while (true) { // Loop começando com true e após receber false vai interromper
            System.out.println("Nome: ");
            nome = scan.next();

            if (nome.equals("0"))
                break;
            // condição if para verificar se o nome foi digitado 0 para interromper o loop

            System.out.println("Idade: ");
            idade = scan.nextInt();

        }

        System.out.println("Loop interrompido!!");
    }
}
