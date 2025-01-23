//LEGGERE LE ISTRUZIONI NEL FILE README.md
import java.util.Scanner;

public class GestioneVettore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Chiedi all'utente di inserire la dimensione del vettore
        System.out.print("Inserisci la dimensione del vettore: ");
        int N = scanner.nextInt();
        int[] vettore = new int[N];

        boolean esegui = true;
        while (esegui) {
            System.out.println("\nScegli un'opzione:");
            System.out.println("1. Inserisci elemento");
            System.out.println("2. Elimina elemento");
            System.out.println("3. Ricerca elemento");
            System.out.println("4. Elimina duplicati");
            System.out.println("5. Visualizza vettore");
            System.out.println("6. Esci");
            System.out.print("Scelta: ");
            int scelta = scanner.nextInt();

            switch (scelta) {
                case 1:
                    inserisciElemento(vettore);
                    break;
                case 2:
                    eliminaElemento(vettore);
                    break;
                case 3:
                    ricercaElemento(vettore);
                    break;
                case 4:
                    eliminaDuplicati(vettore);
                    break;
                case 5:
                    visualizzaVettore(vettore);
                    break;
                case 6:
                    esegui = false;
                    System.out.println("Uscita dal programma...");
                    break;
                default:
                    System.out.println("Scelta non valida, riprova.");
            }
        }

        scanner.close();

    public static void visualizzaVettore(int[] vettore) {
        System.out.print("Vettore: [ ");
        for (int elemento : vettore) {
            System.out.print(elemento + " ");
        }
        System.out.println("]");
    }
}
//LEGGERE LE ISTRUZIONI NEL FILE README.md

