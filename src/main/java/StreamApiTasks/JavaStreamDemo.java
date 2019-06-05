package StreamApiTasks;

import org.omg.CORBA.DATA_CONVERSION;

import java.util.*;
import java.util.stream.Collectors;

public class JavaStreamDemo {
    private static final List<String> DATA_1 = Arrays.asList("a1", "a2", "a3", "a4");
    private static final List<People> DATA_2 = Arrays.asList( new People("Вася", 16, Sex.MAN), new People("Петя", 23, Sex.MAN), new People("Елена", 42, Sex.WOMEN), new People("Иван Иванович", 69, Sex.MAN));
    private static final List<String> DATA_3 = Arrays.asList("a1", "a2", "a3", "a1");
    private static final List<String> DATA_4 = Arrays.asList("a1", "a4", "a3", "a2", "a1", "a4");
    private static final List<Integer> DATA_5 = Arrays.asList(1, 2, 3, 4, 2);
    private static final List<Integer> DATA_6 = Arrays.asList(1, 2, 3, 4);
    private static final List<String> DATA_7 = Arrays.asList("a1", "b2", "c3", "a1");


    public static void main(String[] args) {
        System.out.println(task1_1());
        System.out.println(task1_2());
        System.out.println(task1_3());
        System.out.println(task1_4());
        System.out.println(task1_5());
        System.out.println(Arrays.toString(task1_6()));

        System.out.println(Arrays.toString(task2_1()));
        System.out.println(task2_2());
        System.out.println(task2_3());
        System.out.println(task3_1());
        System.out.println(task3_2());
        System.out.println(task3_3());
        System.out.println(task3_4());
        System.out.println(task4_1());
        System.out.println(task4_2());
        System.out.println(task4_3());
        System.out.println(task4_4());
        System.out.println(task4_5());
        System.out.println(task4_6());
        System.out.println(task5_1());
        System.out.println(task5_2());
        System.out.println(task5_3());
        System.out.println(task5_4());
        System.out.println(task6_1());
        System.out.println(task6_2());
        System.out.println(task6_3());
        System.out.println(task7_1());
        System.out.println(task7_2());
        System.out.println(task7_3());
        System.out.println(task7_4());
        System.out.println(task8_1());
        System.out.println(task8_2());
        System.out.println(task8_3());
        System.out.println(task8_4());
        System.out.println(task8_5());
        System.out.println(task8_6());


    }

    private static long task1_1(){
        return DATA_1.stream().filter(e -> e.equals("a1")).count();
    }

    private static String task1_2(){
        return DATA_1.stream().findFirst().orElse("0");
    }

    private static String task1_3(){
        return DATA_1.stream().skip(DATA_1.size() -1 ).findFirst().orElse("empty");
    }

    private static String task1_4(){
        return DATA_1.stream().filter(e -> e.equals("a3")).findFirst().get();
    }

    private static String task1_5(){
        return DATA_1.stream().skip(2).findFirst().orElse("0");
    }

    private static String[] task1_6(){
        return DATA_1.stream().skip(1).limit(2).toArray(String[]::new);
    }

    private static People[] task2_1(){
        return DATA_2.stream().filter(e -> e.sex == Sex.MAN && e.age > 18 && e.age < 27).toArray(People[]::new);
    }

    private static double task2_2(){
        return DATA_2.stream().filter(e -> e.sex == Sex.MAN).mapToInt( e -> e.age).average().orElse(0);
    }

    private static long task2_3(){
        return DATA_2.stream().filter(e -> (e.age > 18 && ((e.sex == Sex.MAN && e.age < 60)) || (e.sex == Sex.WOMEN && e.age < 55))).count();
    }

    /*
    #3 Условие: дана коллекция строк Arrays.asList(«a1», «a2», «a3», «a1»)

1. Найти существуют ли хоть один «a1» элемент в коллекции
2. Найти существуют ли хоть один «a8» элемент в коллекции
3. Найти есть ли символ «1» у всех элементов коллекции
4. Проверить что не существуют ни одного «a7» элемента в коллекции

    * */
    private static boolean task3_1(){return DATA_3.stream().anyMatch(a -> a.equals("a1"));}
    private static boolean task3_2(){return DATA_3.stream().anyMatch(a -> a.equals("a8"));}
    private static boolean task3_3(){return DATA_3.stream().allMatch(a -> a.contains("1"));}
    private static boolean task3_4(){return DATA_3.stream().noneMatch(a -> a.contains("a7"));}

/*
1. Отсортировать коллекцию строк по алфавиту
2. Отсортировать коллекцию строк по алфавиту в обратном порядке
3. Отсортировать коллекцию строк по алфавиту и убрать дубликаты
4. Отсортировать коллекцию строк по алфавиту в обратном порядке и убрать дубликаты
5. Отсортировать коллекцию людей по имени в обратном алфавитном порядке
6. Отсортировать коллекцию людей сначала по полу, а потом по возрасту
* */
    private static List<String> task4_1(){return DATA_4.stream().sorted().collect(Collectors.toList());}
    private static List<String> task4_2(){return DATA_4.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());}
    private static List<String> task4_3(){return DATA_4.stream().sorted().distinct().collect(Collectors.toList());}
    private static List<String> task4_4(){return DATA_4.stream().sorted(Comparator.reverseOrder()).distinct().collect(Collectors.toList());}
    private static List<People> task4_5(){return  DATA_2.stream().sorted(Comparator.comparing(People::getName)).collect(Collectors.toList());}
    private static List<People> task4_6(){return  DATA_2.stream().sorted(Comparator.comparing(People::getSex)
            .thenComparing(People::getAge))
            .collect(Collectors.toList());}
    /*
1. Найти максимальное значение среди коллекции строк
2. Найти минимальное значение среди коллекции строк
3. Найдем человека с максимальным возрастом
4. Найдем человека с минимальным возрастом
    * */
    private static String task5_1() {return DATA_3.stream().max(Comparator.comparing(String::valueOf)).get();}
    private static String task5_2() {return DATA_3.stream().min(Comparator.comparing(String::valueOf)).get();}
    private static People task5_3() {return DATA_2.stream().max(Comparator.comparing(People::getAge)).get();}
    private static People task5_4() {return DATA_2.stream().min(Comparator.comparing(People::getAge)).get();}

/*
1. Получить сумму чисел или вернуть 0 если чисел нет
2. Вернуть максимум или -1
3. Вернуть сумму нечетных чисел или 0
* */
    private static Integer task6_1() {return DATA_5.stream().reduce(0, Integer::sum);}
    private static Integer task6_2() {return DATA_5.stream().reduce(-1,Integer::max);}
    private static Integer task6_3() {return DATA_5.stream().filter(e -> e % 2 ==1).reduce(0,Integer::sum);}

/*
1. Получить сумму нечетных чисел
2. Вычесть от каждого элемента 1 и получить среднее
3. Прибавить к числам 3 и получить статистику  (что то такое должно получится  IntSummaryStatistics{count=4, sum=22, min=4, average=5.5, max=7})
4. Разделить числа на четные и нечетные (что то такое должно получится {false=[1, 3], true=[2, 4]})
* */
private static Integer task7_1() {return DATA_6.stream().filter(e -> e % 2 == 1).mapToInt(i -> i).sum();}
private static Double task7_2() {return DATA_6.stream().mapToInt(i -> i-1).average().orElse(0.0);}
private static IntSummaryStatistics task7_3() {return DATA_6.stream().collect(Collectors.summarizingInt((p) -> p + 3));}
private static  Map<Boolean, List<Integer>>  task7_4() {return DATA_6.stream().collect(Collectors.partitioningBy((p) -> p %
        2 ==
        0));}
    /*
1. Получение списка без дубликатов
2. Получить массив строк без дубликатов и в верхнем регистре
3. Объединить все элементы в одну строку через разделитель: и обернуть тегами <b>… </b>
4. Преобразовать в map, где первый символ ключ, второй символ значение
5. Преобразовать в map, сгруппировав по первому символу строки (что то такое должно получится {a=[a1, a1], b=[b2], c=[c3]})
6. Преобразовать в map, сгруппировав по первому символу строки и объединим вторые символы через : (что то такое должно получится {a=1:1, b=2, c=3})
    * */
    public  static List<String> task8_1(){ return DATA_7.stream().sorted().distinct().collect(Collectors.toList());}
    public  static List<String> task8_2(){ return DATA_7.stream().sorted().distinct().map(String::toUpperCase)
            .collect(Collectors.toList());}
    public  static String task8_3(){ return DATA_7.stream().map(s -> "<b>"+s+"</b>").collect(Collectors.joining
            (":"));}
    public  static Map<Character,Character> task8_4(){ return DATA_7.stream().distinct().collect(Collectors.toMap(e -> e.charAt
            (0),e -> e.charAt(1)));}
    public  static Map<String,List <String>> task8_5(){ return DATA_7.stream().collect(Collectors.groupingBy((p) -> p
            .substring
            (0, 1)));}
    public  static Map<String,String> task8_6(){ return DATA_7.stream().collect(Collectors.groupingBy((p) -> p
            .substring(0, 1), Collectors.mapping((p) -> p.substring(1, 2), Collectors.joining(":"))));}





    private static class People {
        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public Sex getSex() {
            return sex;
        }

        public void setSex(Sex sex) {
            this.sex = sex;
        }

        String name;
        int age;
        Sex sex;

        People(String name, int age, Sex sex) {
            this.name = name;
            this.age = age;
            this.sex = sex;
        }

        @Override
        public String toString() {
            return "People{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    ", sex=" + sex +
                    '}';
        }
    }

    private enum Sex{
        MAN, WOMEN
    }
}
