import java.util.Scanner;

public class CaesarVerschluesselung {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Eingabe von Text und Verschiebung
        System.out.print("Gib einen Text ein: ");
        String text = scanner.nextLine();

        System.out.print("Gib die Verschiebung ein: ");
        int verschiebung = scanner.nextInt();

        // Verschlüsseln
        String verschluesselt = caesarVerschluesselung(text, verschiebung);
        System.out.println("Verschlüsselter Text: " + verschluesselt);

        // Entschlüsseln (negativer Shift)
        String entschluesselt = caesarEntschluesselung(verschluesselt, verschiebung);
        System.out.println("Entschlüsselter Text: " + entschluesselt);
    }

    // Caesar-Verschlüsselung
    public static String caesarVerschluesselung(String text, int verschiebung) {
        return caesar(text, verschiebung);
    }

    // Caesar-Entschlüsselung (einfach: negative Verschiebung)
    public static String caesarEntschluesselung(String text, int verschiebung) {
        return caesar(text, -verschiebung);
    }

    // Gemeinsame Caesar-Methode (positiv = verschlüsseln, negativ = entschlüsseln)
    private static String caesar(String text, int verschiebung) {
        StringBuilder ergebnis = new StringBuilder();

        for (char zeichen : text.toCharArray()) {
            if (Character.isLetter(zeichen)) {
                char basis = Character.isUpperCase(zeichen) ? 'A' : 'a';
                char verschoben = (char) ((zeichen - basis + verschiebung + 26) % 26 + basis);
                ergebnis.append(verschoben);
            } else {
                ergebnis.append(zeichen);
            }
        }

        return ergebnis.toString();
    }
}
