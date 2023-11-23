package cvika;

import java.util.Scanner;

public class TestRecap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Zadej pocet lahvi:");
        int input = sc.nextInt();
//        while (input % 2 == 0) {
//            System.err.println(input);
//        }
//        input = sc.nextInt();
//    }
//
//    System.out.println("Zadej max cislo");
//    input = sc.nextInt();
//    for (int i = 0; i < input; i++) {
//        if (i % 2 == 0){
//            System.out.println(i);
//        }
//    }
//
//
//
//}
//
//
//
        System.out.println("Zadej cislo");
        input = sc.nextInt();
        boolean prime = true;
        for (int i = 2; i < input; i++) {
            if (input % i == 0) {
                prime = false;
                break;
            }
        }
        System.out.println("Je prvocislo? " + prime);

    }
}