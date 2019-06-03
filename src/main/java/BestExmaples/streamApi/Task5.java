package BestExmaples.streamApi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Task5 {
/*    1. Найти максимальное значение среди коллекции строк
2. Найти минимальное значение среди коллекции строк
3. Найдем человека с максимальным возрастом
4. Найдем человека с минимальным возрастом*/
    public static void main(String[] args) {
        List<String> list = Arrays.asList("a1", "a2", "a3", "a1");
        System.out.println(list.toString());
        List<People> people = new ArrayList<>();
        people.add(new People("Вася", 16, Sex.MAN));
        people.add(new People("Петя", 23, Sex.MAN));
        people.add(new People("Елена", 42, Sex.WOMAN));
        people.add(new People("Иван Иванович", 69, Sex.MAN));

        System.out.println(Collections.max(list));
        System.out.println(Collections.max(people));
        System.out.println(Collections.min(list));
        System.out.println(Collections.min(people));

        int min = people.get(0).getAge();
        int max = 0;
        People maxP = people.get(0);
        People minP = people.get(0);
        for (People p: people) {
            if(p.getAge() > max){
                maxP = p;
            }
            if(p.getAge() < min){
                minP = p;
            }
        }
        System.out.println("Max age"+maxP);
        System.out.println("Min age"+minP);

    }

}

