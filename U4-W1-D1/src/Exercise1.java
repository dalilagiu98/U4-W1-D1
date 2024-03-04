import java.util.Arrays;
import java.util.Scanner;

public class Exercise1 {

        // Metodo per moltiplicare due interi
        public static int multiplication(int num1, int num2) {
            return num1 * num2;
        }

        // Metodo per concatenare una stringa e un intero
        public static String concatena(String str, int num) {
            return str + num;
        }

        // Metodo per inserire una stringa in un array di stringhe
        public static String[] inserisciInArray(String[] array, String nuovaStringa) {
            String[] newArray = new String[6];

            // Copia le prime due stringhe nell'array risultante
            System.arraycopy(array, 0, newArray, 0, 2);

            // Inserisci la nuova stringa al terzo posto
            newArray[2] = nuovaStringa;

            // Copia le stringhe rimanenti
            System.arraycopy(array, 2, newArray, 3, 3);

            return newArray;
        }

        public static void main(String[] args) {
            // Invoca i tre metodi in sequenza

            // Moltiplica due interi
            Scanner scanner = new Scanner(System.in);

            System.out.println("Insert an integer");
            int numberOne = Integer.parseInt(scanner.nextLine());
            System.out.println("Now insert another integer");
            int numberTwo = Integer.parseInt(scanner.nextLine());
            System.out.println("The multiplication is: " + multiplication(numberOne, numberTwo));

            // Concatena una stringa e un intero

            System.out.println("Insert a string");
            String firstString = scanner.nextLine();
            System.out.println("Now insert a integer");
            int number = Integer.parseInt(scanner.nextLine());
            System.out.println("The result of concatenation is: " + concatena(firstString, number));

            // Inserisci una stringa in un array di stringhe
            String[] arrayIniziale = {"Uno", "Due", "Tre", "Quattro", "Cinque"};
            System.out.println("The elements of array are: " + Arrays.toString(arrayIniziale));
            System.out.println("Please, insert a new string:");
            String nuovaStringa = scanner.nextLine();
            String[] nuovoArray = inserisciInArray(arrayIniziale, nuovaStringa);
            System.out.println("The result of 'push' is: " + Arrays.toString(nuovoArray));
        }
    }
