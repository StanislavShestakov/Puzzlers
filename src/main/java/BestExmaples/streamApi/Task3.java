package BestExmaples.streamApi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Stas on 04.06.2019.
 */
public class Task3 {
/*
1. Найти существуют ли хоть один «a1» элемент в коллекции
2. Найти существуют ли хоть один «a8» элемент в коллекции
3. Найти есть ли символ «1» у всех элементов коллекции
4. Проверить что не существуют ни одного «a7» элемента в коллекции
* */
    public static void main(String[] args) {
        List<String> list = Arrays.asList("a1", "a2", "a3", "a1");
        System.out.println(list.toString());

        boolean isA1 = false;
        for (String s:list) {
            if(s.equals("a1")) {
                isA1 = true;
                break;
            }
        }
        System.out.println(isA1);

        boolean isA8 = false;
        for (String s:list) {
            if(s.equals("a8")) {
                isA8 = true;
                break;
            }
        }
        System.out.println(isA8);

        boolean is1 = true;
        for (String s:list) {
            if(!s.contains("1")) {
                isA8 = false;
                break;
            }
        }
        System.out.println(is1);

        boolean isA7 = true;
        for (String s:list) {
            if(s.equals("a7")) {
                isA7 = false;
                break;
            }
        }
        System.out.println(isA7);
    }
}
