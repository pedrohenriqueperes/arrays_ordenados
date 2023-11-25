import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> nomes = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite os nomes separados por vírgula:");

        String entrada = scanner.nextLine();
        String[] nomesArray = entrada.split(",");

        Arrays Arrays = null;
        nomes.addAll(Arrays.asList(nomesArray));

        nomes.replaceAll(String::trim);

        Collections.sort(nomes);

        System.out.println("Nomes ordenados em ordem alfabética:");
        for (String nomeOrdenado : nomes) {
            System.out.println(nomeOrdenado);
        }

    }
}