package BestExmaples.streamApi;

import java.util.*;

/**
 * Created by Stas on 04.06.2019.
 */
public class Task4 {
    /*
    #4 Условие: даны две коллекции коллекция строк Arrays.asList(«a1», «a4», «a3», «a2», «a1», «a4») и коллекция людей
класса People (с полями name — имя, age — возраст, sex — пол), вида Arrays.asList( new People(«Вася», 16, Sex.MAN), new People(«Петя», 23, Sex.MAN), new People(«Елена», 42, Sex.WOMEN), new People(«Иван Иванович», 69, Sex.MAN))

1. Отсортировать коллекцию строк по алфавиту
2. Отсортировать коллекцию строк по алфавиту в обратном порядке
3. Отсортировать коллекцию строк по алфавиту и убрать дубликаты
4. Отсортировать коллекцию строк по алфавиту в обратном порядке и убрать дубликаты
5. Отсортировать коллекцию людей по имени в обратном алфавитном порядке
6. Отсортировать коллекцию людей сначала по полу, а потом по возрасту
    * */
    public static void main(String[] args) {
        List<String> list = Arrays.asList("a1", "a4", "a3", "a2", "a1", "a4");
        System.out.println(list.toString());
        List<People> people = new ArrayList<>();
        people.add(new People("Вася", 16, Sex.MAN));
        people.add(new People("Петя", 23, Sex.MAN));
        people.add(new People("Елена", 42, Sex.WOMAN));
        people.add(new People("Иван Иванович", 69, Sex.MAN));

        List<String> list1 = new ArrayList<>(list);
        List<People> people1 = new ArrayList<>(people);
        Collections.sort(list1);
        Collections.sort(people1);
        System.out.println(list1);
        System.out.println(people1);

        System.out.println("=================================");
        Collections.reverse(list1);
        Collections.reverse(people1);
        System.out.println(list1);
        System.out.println(people1); //#5

        System.out.println("=================================");
        Set<String> set = new HashSet<>(list1);
        list1.clear();
        list1.addAll(set);
        System.out.println(list1);

        System.out.println("=================================");
        Collections.reverse(list1);
        System.out.println(list1);

        //https://stackoverflow.com/questions/14154127/collections-sortlistt-comparator-super-t-method-example
        // many comparators
        System.out.println("=================================");
        Collections.sort(people, new Comparator<People>() {
            @Override
            public int compare(People p1, People p2) {
                if(p1.getSex().compareTo(p2.getSex()) == 0)
                {
                    return p1.getAge()-p2.getAge();
                }else{
                  return p1.getSex().compareTo(p2.getSex());
                }
            }
        });

        System.out.println(people);



    }
}
