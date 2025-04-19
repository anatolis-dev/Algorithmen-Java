import java.util.Scanner;

public class Umwandlung_Dezimal_Binaer {
    public static void main(String[] args) {
        // Eingabeaufforderung für positive Zahl
        System.out.println("Positive Zahl eingeben: ");
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();  // Benutzer-Eingabe lesen
        System.out.println(decimalToBinary(number));  // Binärwert ausgeben
    }

    // Wandelt eine positive Dezimalzahl rekursiv in eine Binärzahl um
    static String decimalToBinary(int number) {
        // Abbruchbedingung: Nur positive Zahlen erlaubt
        if (number < 0) {
            return "Bitte, Positive Zahl eingeben";
        }

        int n = number / 2;  // Ganzzahldivision durch 2
        int r = number % 2;  // Rest (0 oder 1) = Binärstelle

        // Rekursionsbasis: Wenn n == 0, ist dies die letzte Stelle
        if (n == 0) {
            return Integer.toString(r);
        } else {
            // Rekursiver Aufruf + aktuelle Binärstelle anhängen
            return decimalToBinary(n) + Integer.toString(r);
        }
    }
}

