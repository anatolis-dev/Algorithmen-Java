
/*

Zählalgorithmus – Platzbelegung

Berechnung prozentualen Anteil belegter Plätze in einer Liste.

**/


public class Zaehlalgorithmus {

    public static void main(String[] args) {
        // Beispielarray: true = Platz belegt, false = frei
        boolean[] plaetze = {true, false, true, false, true};

        int anzahlBelegt = 0;
        int index = 0;

        // Zähle belegte Plätze mit while-Schleife
        while (index < plaetze.length) {
            if (plaetze[index]) {
                anzahlBelegt++;  // Wenn belegt, zähle hoch
            }
            index++;
        }

        // Berechne Anteil in Prozent (Gleitkommadivision!)
        double anteil = (100.0 * anzahlBelegt) / plaetze.length;

        // Ausgabe mit 2 Nachkommastellen und Prozentzeichen
        System.out.printf("Belegte Plätze: %.2f%%\n", anteil);
    }
}
