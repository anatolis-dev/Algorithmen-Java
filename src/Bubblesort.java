// Bubblesort
/*
* Der größte Wert "wandert" bei jedem Durchlauf nach hinten.
* Es wird so oft verglichen und getauscht, bis die Liste vollständig sortiert ist.
* */

public class Bubblesort {
    public static void main(String[] args) {
        int[] zahlen = {55, 12, 16, 29, 68, 69, 82, 5};

        bubbleSort(zahlen);

        System.out.println("Sortiertes Array:");
        for (int zahl : zahlen) {
            System.out.print(zahl + " ");
        }
    }

    public static void bubbleSort(int[] array) {
        int n = array.length;
        // Durchlaufe alle Elemente
        for (int i = 0; i < n - 1; i++) {
            // Innerer Loop für Vergleich benachbarter Elemente
            for (int j = 0; j < n - i - 1; j++) {
                // Wenn das aktuelle Element größer ist als das nächste, tauschen
                if (array[j] > array[j + 1]) {
                    // Tauschen
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }
}
