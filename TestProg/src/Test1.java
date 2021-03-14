import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.Charset;
import java.util.Locale;
import java.util.Scanner;

public class Test1 {

    private static boolean isSmallRegister(char symbol){
        return String.valueOf(symbol).equals(String.valueOf(symbol).toLowerCase());
    }

    private static boolean isSmallRegisterChar(char symbol){
        return String.valueOf(symbol).equals(String.valueOf(symbol).toLowerCase());
    }


    private static boolean isBigRegister(char symbol){
        return String.valueOf(symbol).equals(String.valueOf(symbol).toUpperCase());
    }

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new FileReader("input.txt"));
        char[] symbols = sc.nextLine().toCharArray(); //Запись файла в массив

        PrintWriter out = new PrintWriter(System.out);

        int count = 0;
        int space = 0;
        int swRegister = 0;
        int swRegister2 = 0;
        boolean isSmallRegisterChar = true;

        for(int i = 0; i < symbols.length; i++){
            if(symbols[i] == ' '){
                space++;
            }else if(i + 1 < symbols.length){
                // Если подряд идут буквы верхнего регистра +3
                if(isSmallRegisterChar && !isSmallRegisterChar(symbols[i]) && !isSmallRegisterChar(symbols[i+1]) ||
                !isSmallRegisterChar && isSmallRegisterChar(symbols[i]) && isSmallRegisterChar(symbols[i+1])){
                    count += 3;
                    isSmallRegisterChar = !isSmallRegisterChar;
                    // Имитация нажатия shift
                }else if(isSmallRegisterChar && !isSmallRegisterChar(symbols[i]) ||
                !isSmallRegisterChar && isSmallRegisterChar(symbols[i])){
                    count += 2;
                }else {
                    count++;
                }
                // простые подряд идущии символы
            }else {
                if(isSmallRegisterChar && isSmallRegisterChar(symbols[i]) ||
                !isSmallRegisterChar && !isSmallRegisterChar(symbols[i])){
                    count++;
                }else {
                    count += 2;
                }
            }
        }

        System.out.println(count);


//        System.out.println(isSmallRegister('S'));
//        System.out.println(isBigRegister('S'));

//        int cout = 0; // Сколько символов
//        for(char s : symbols){
//            System.out.println(isBigRegister(s));
//            cout++;
//            System.out.println("How symbols: " + cout);
//        }

//        for(char i = 0; i < sym.length; i++){
//            System.out.println(isSmallRegister(i));
//        }

    }
}
