package TestTaskNaumen;

import java.io.PrintWriter;
import java.util.Scanner;

public class NaumenDemo {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        // приобразования в Int
        int n = Integer.parseInt(in.nextLine()); //Принемает значения
        String[] vectorN  = in.nextLine().split(" "); // Читает значения через пробел

        int m = Integer.parseInt(in.nextLine());
        String[] vectorM = in.nextLine().split(" ");

        int index = 0;
        for(String number: vectorN){
            int count = Integer.parseInt(number); //Форматировать значения в Int

            // После получения значения он столько раз выводит полученное
            for(int i = 0; i < count; i++){
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
