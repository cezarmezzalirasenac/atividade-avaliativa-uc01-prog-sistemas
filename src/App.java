import java.security.SecureRandom;
import java.util.Scanner;

import classes.Assento;
import classes.AssentoEconomico;
import classes.AssentoPrimeiraClasse;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        SecureRandom random = new SecureRandom();

        Assento[][] assentos = new Assento[20][11];
        // 1- Obter o número da fileira
        System.out.println("Informe o número da fileira desejada:");
        int fileira = scanner.nextInt();
        // 2- Obter o número da poltrona
        System.out.println("Informe o número da poltrona desejada:");
        int poltrona = scanner.nextInt();

        scanner.close();
        // 3- Validar se na matriz de assentos, na fileira (linha)
        // e a poltrona (coluna) existe um objeto ou não
        if (fileira > 20 || poltrona > 11) {
            throw new Error("Poltrona ou fileira inválida!");
        }

        if (assentos[fileira - 1][poltrona - 1] != null) {
            throw new Error("Poltrona já ocupada!");
        }
        // 4- Se existir um objeto naquela posição da matriz,
        // deve imprimir uma mensagem que o assento está ocupado
        // 5- Senão, deve criar um novo objeto assento,
        // levando em consideração a fileira.

        // 6- Se a fileira for menor ou igual a cinco,
        // deve criar um objeto AssentoPrimeiraClasse
        // 7- Senão, deve criar um objeto AssentoEconomico
        if (fileira <= 5) {
            assentos[fileira - 1][poltrona - 1] = new AssentoPrimeiraClasse(random.nextInt(), poltrona, fileira);
        } else {
            assentos[fileira - 1][poltrona - 1] = new AssentoEconomico(random.nextInt(), poltrona, fileira);
        }

        // 8- Após criar o objeto, deverá chamar o método reservar do mesmo,
        // acessando o ojeto pela sua posição na matriz
        // 9- O método reservar deve apenas imprimir o valor da passagem
        // com a poltrona e a fileira
        assentos[fileira - 1][poltrona - 1].reservar();

    }
}
