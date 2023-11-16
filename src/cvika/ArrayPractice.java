package cvika;

import java.util.Arrays;

public class ArrayPractice {

    public static void main(String[] args) {
        int[] arr = {1,23,234,54,97};
        int[] array = new int[15];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int)(Math.random() * 100 + 1 - 50);
        }
        System.out.println(Arrays.toString(array));

        //vypis vsechna zaporna cisla v poli
        for (int i = 0; i < array.length; i++) {



        //vypis pole pozpatku
            for (int i = array.length - 1; i >= 0; i--) {
                System.out.println(array[i]);
                }
            }
        }
    }
}
