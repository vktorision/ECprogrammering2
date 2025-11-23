import java.util.Scanner;

public class ReadCommand {
    void main() {
        Scanner scanner = new Scanner(System.in);
        String line;
        StringBuilder text = new StringBuilder();

        IO.println("Skriv text och avsluta med stop: ");

        // fortsätt läs till "stop"
        while (true) {
            line = scanner.nextLine();  // Read one line from input
            text.append(line).append("\n");
        }
        //Skriv ut resultat
        scanner.close();
    }
}
