package Glutton;

import java.io.PrintWriter;
import java.util.Scanner;

public class Glutton {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out); // out для укращения
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int d = in.nextInt();
        int e = in.nextInt();

        if(a == 1){
            out.println("Vsevolod");
        }else if(b == 1){
            out.println("Kirill");
        }else if(d == 1){
            out.println("Nikolay");
        }else if(c == 1){
            out.println("Dmitry");
        }else if(e == 1){
            out.println("Viktor");
        }else {
            out.println("Marina");
        }
        out.flush();
    }
}
