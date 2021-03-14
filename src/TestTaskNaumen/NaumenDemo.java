package TestTaskNaumen;

import java.io.PrintWriter;
import java.util.Scanner;

public class NaumenDemo {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        // приобразования в Int
        int n = Integer.parseInt(in.nextLine());
        String[] vectorN  = in.nextLine().split(" ");

        int m = Integer.parseInt(in.nextLine());
        String[] vectorM = in.nextLine().split(" ");

        int index = 0;
        for(String number: vectorN){
            int cout = Integer.parseInt(number);

            for(int i = 0; i < cout; i++){
                System.out.println(vectorM[index]);
            }
            System.out.println(" ");

            index++;
            if(index >= vectorM.length){
                index = 0;
            }
        }
    }
}
