package ukoly;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayPractice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Generování pole n náhodných čísel
        System.out.print("Zadej délku pole: ");
        int length = scanner.nextInt();
        int[] numbers = new int[length];

        for (int i = 0; i < length; i++) {
            numbers[i] = (int) (Math.random() * 100); // Generuje náhodná čísla od 0 do 99
        }

        // 2. Výpočet součtu sudých a lichých čísel
        int sumEven = 0;
        int sumOdd = 0;

        for (int number : numbers) {
            if (number % 2 == 0) {
                sumEven += number;
            } else {
                sumOdd += number;
            }
        }

        System.out.println("Součet sudých čísel: " + sumEven);
        System.out.println("Součet lichých čísel: " + sumOdd);

        // 3. Vytvoření pole odmocnin
        double[] sqrtNumbers = new double[length];

        for (int i = 0; i < length; i++) {
            sqrtNumbers[i] = Math.sqrt(numbers[i]);
        }

        System.out.println("Odmocniny čísel: " + Arrays.toString(sqrtNumbers));

        // 4. Vyhledání výskytu hodnoty v poli
        System.out.print("Zadej hodnotu k vyhledání: ");
        int searchValue = scanner.nextInt();

        int countOccurrences = 0;
        System.out.println("Výsledek:");

        for (int i = 0; i < length; i++) {
            if (numbers[i] == searchValue) {
                countOccurrences++;
                System.out.println("Index: " + i);
            }
        }

        System.out.println("Počet výskytů: " + countOccurrences);

        // 5. Vytvoření pole s ručním vstupem od uživatele
        int[] userNumbers = new int[10];
        for (int i = 0; i < 10; ) {
            System.out.print("Zadej číslo (pouze 10-100): ");
            int userInput = scanner.nextInt();

            if (userInput >= 10 && userInput <= 100) {
                userNumbers[i] = userInput;
                i++;
            } else {
                System.out.println("Zadávej pouze čísla v rozsahu 10-100.");
            }
        }

        System.out.println("Uživatelská pole: " + Arrays.toString(userNumbers));

        scanner.close();
    }
}
