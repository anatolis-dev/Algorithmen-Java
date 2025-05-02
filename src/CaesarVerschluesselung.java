import java.util.Scanner;

public class CaesarVerschluesselung {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Eingabe von Text und Verschiebung
        System.out.print("Gib einen Text ein: ");
        String text = scanner.nextLine();

        System.out.print("Gib die Verschiebung ein: ");
        int verschiebung = scanner.nextInt();

        // Verschlüsselten Text ausgeben
        String verschluesselt = caesarVerschluesselung(text, verschiebung);
        System.out.println("Verschlüsselter Text: " + verschluesselt);
    }

    // Führt die Caesar-Verschlüsselung durch
    public static String caesarVerschluesselung(String text, int verschiebung) {
        StringBuilder verschluesselt = new StringBuilder();

        for (char zeichen : text.toCharArray()) {
            if (Character.isLetter(zeichen)) {
                char basis = Character.isUpperCase(zeichen) ? 'A' : 'a';
                // Berechnung mit Modulo für Rotation im Alphabet (26 Buchstaben)
                char verschoben = (char) ((zeichen - basis + verschiebung + 26) % 26 + basis);
                verschluesselt.append(verschoben);
            } else {
                // Nicht-Buchstaben bleiben unverändert
                verschluesselt.append(zeichen);
            }
        }

        return verschluesselt.toString();
    }
}
