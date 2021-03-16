package Cake;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class CakeDemo {
    public static void main(String args[]) throws IOException {
        int number;
        int guest;
        String str;
        Scanner sc = new Scanner(System.in);
        str = sc.nextLine();
        guest = Integer.valueOf(str);
        number = (guest == 1) ? 0:
                (guest % 2 == 1) ? guest : guest / 2;
        System.out.println(String.valueOf(number));
    }
}
