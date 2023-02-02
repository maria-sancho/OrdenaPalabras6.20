import java.util.Arrays;
import java.util.Scanner;
import java.util.List;
import java.util.Comparator;


public class Palabras {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Añade una frase: ");
        String frase = scanner.nextLine();

        List<String> palabras = Arrays.asList(frase.split(" "));
        palabras.sort(Comparator.comparing(String::toLowerCase));

        System.out.println("Palabras ordenadas: ");
        for (String palabra : palabras) {
            System.out.println(palabra);
        }
    }
}