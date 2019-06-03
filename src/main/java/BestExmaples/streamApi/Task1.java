package BestExmaples.streamApi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by Stas on 03.06.2019.
 */
public class Task1 {
    /*
    1. Вернуть количество вхождений объекта «a1»
    2. Вернуть первый элемент коллекции или 0, если коллекция пуста
    3. Вернуть последний элемент коллекции или «empty», если коллекция пуста
    4. Найти элемент в коллекции равный «a3» или кинуть ошибку
    5. Вернуть третий элемент коллекции по порядку
    6. Вернуть два элемента начиная со второго
    * */
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list = Arrays.asList("a1", "a2", "a3", "a1");
        System.out.println(list.toString());

        int count = 0;
        for (String s:list) {
            if(s.equals("a1"))
                count++;
        }
        System.out.println(count);

        List<String> list1 = new ArrayList<>(list);
        Collections.sort(list1,Collections.reverseOrder());
        System.out.println(list1.toString());

        if(list.size() == 0){
            System.out.println("empty");
        }else{
            System.out.println(list.get(list.size()-1));
        }

        int count1 = 0;
        for (String s:list) {
            if(s.equals("a3"))
                count1++;
        }
        if (count1 == 0) {
            throw new RuntimeException("cant find!");
        }

        System.out.println(list.get(2));

        System.out.println(list.get(1)+" "+list.get(2));
    }
}
