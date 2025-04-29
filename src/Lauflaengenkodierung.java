// Lauflängenkodierung
// ist ein Komprimierungsalgorithmus
// welches die Menge Digitaler Daten reduziert

/* Zählt gleiche, aufeinanderfolgende Zeichen.
* Speichert die Anzahl + das Zeichen.
* Arbeitet effizient ohne zusätzliche Libraries.
* Ergebnis: eine kürzere Darstellung des ursprünglichen Textes.
* */

public class Lauflaengenkodierung {
    public static void main(String[] args) {
        String text = "aaaaaaaaabbbbbbbbbbcccccddeeefff";
        String encodedText = runLengthEncoding(text);
        System.out.println(encodedText); // 9a10b5c2d3e3f
    }

    static String runLengthEncoding(String text) {
        String encodeText = "";
        int i = 0;
        while (i < text.length()) {
            int count = 1;
            char c = text.charAt(i);
            int j = i;
            while (j < text.length()-1) {
                if (text.charAt(j) == text.charAt(j+1)) {
                    count = count +1;
                    j = j + 1;
                } else {break; }
            }
            encodeText = encodeText + Integer.toString(count) + c;
            i = j + 1;
        }
        return encodeText;
    }
}
