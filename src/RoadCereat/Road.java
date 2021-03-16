package RoadCereat;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.*;
import java.io.*;


//В галактике «Milky Way» на планете «Snowflake» есть N городов,
// некоторые из которых соединены дорогами. Император галактики «Milky Way» решил  провести инвентаризацию дорог на планете «Snowflake».
// Но, как оказалось, он не силен в математике, поэтому он просит вас сосчитать количество дорог. Требуется написать программу,
// помогающую императору сосчитать количество дорог на планете «Snowflake»        .





public class Road {
    // Создания динамического массива
    private static ArrayList<Integer> number = new ArrayList<>();
    private static void getData() throws IOException{
        FileReader file = new FileReader("inputRoad.txt");
        Scanner sc = new Scanner(file);
        String str;
        while (sc.hasNextLine()){
            str = sc.nextLine();
            // Чтение строки с разделениями
            // Первый агрумент строка 2 аргумент разделитель
            StringTokenizer st = new StringTokenizer(str, " ");
            // True пока есть ещё элементы
            while (st.hasMoreTokens()){
                //Добавляет элементы в массив
                number.add(Integer.valueOf(st.nextToken()));
            }
        }
    }

    public static void main(String[] argv) throws IOException{
        getData(); // Вызов чтения
        int roadCount = 0;
        for(int i = 0; i < number.size(); i++){
            if(i != 0){ // Пропускает первый элемент
                if(number.get(i) == 1){
                    roadCount++;
                }
            }
        }
        roadCount = roadCount / 2;
        PrintWriter pw = new PrintWriter(new File("output.txt"));
        pw.println(String.valueOf(roadCount));
        pw.close();
    }
}
