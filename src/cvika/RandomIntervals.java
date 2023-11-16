package cvika;

import java.util.Arrays;
import java.util.Scanner

public class ArrayPractice {

    public static void main(String[] args) {
      //vytvorit pole o velikosti 6
        // naplnit nahodnymi cisly 1 - 15
        //uzivatele se 7x zeptate, aby uhodl cislo v poli
        //u uzivatele se sleduje skore
        //pri spravnem tipu se pricte ke skore 100
        int[] guessArray = new int[6];
        Scanner sc = new Scanner(System.in);
        int score = 0;
        int guess;

        for (int i = 0; i < guessArray.length; i++) {
            guessArray[i] = (int)(Math.random()*15+1);
        }

        //cheat
        System.out.println(Arrays.toString(guessArray));

        //ptam se 7x
        for (int i = 0; i < 7; i++) {
            System.out.println("Tipni cislo");
            guess = sc.nextInt();

            //hledam, jestli cislo neni v poli
            for(int j = 0; i < guessArray.length; j++) {
                if (guess == guessArray[j]){
                    score += 100;
                    System.out.println("Uhodl jsi!");
                }
            }
        }
        System.out.println("Skore: " + score);
    }
}

