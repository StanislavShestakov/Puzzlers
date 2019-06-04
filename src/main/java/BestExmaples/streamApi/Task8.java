package BestExmaples.streamApi;

import java.util.*;

/**
 * Created by Stas on 04.06.2019.
 */
public class Task8 {
    /*
    #8 Условие: Дана коллекция строк Arrays.asList(«a1», «b2», «c3», «a1»)

1. Получение списка без дубликатов
2. Получить массив строк без дубликатов и в верхнем регистре
3. Объединить все элементы в одну строку через разделитель: и обернуть тегами <b>… </b>
4. Преобразовать в map, где первый символ ключ, второй символ значение
5. Преобразовать в map, сгруппировав по первому символу строки (что то такое должно получится {a=[a1, a1], b=[b2], c=[c3]})
6. Преобразовать в map, сгруппировав по первому символу строки и объединим вторые символы через : (что то такое должно получится {a=1:1, b=2, c=3})
    * */
    public static void main(String[] args) {
        List<String> list = Arrays.asList("a1", "b2", "c3", "a1");
        System.out.println(list.toString());

        System.out.println("=================================");
        List<String> list1 = new ArrayList<>(list);
        Set<String> set = new HashSet<>(list1);
        list1.clear();
        list1.addAll(set);
        System.out.println(list1);

        System.out.println("=================================");
        List<String> list2 = new ArrayList<>();
        for (String s: list1) {
            list2.add(s.toUpperCase());
        }
        System.out.println(list2);

        System.out.println("=================================");
        StringBuilder arInStr = new StringBuilder();
        for (String s: list) {
            arInStr.append("<b>"+s+"</b>:");
        }
        arInStr.deleteCharAt(arInStr.length() - 1);
        System.out.println(arInStr);

        System.out.println("=================================");
        Map<String,String> map = new HashMap<>();
        for (String s:list) {
            map.put(s.charAt(0)+"",  s.charAt(1)+"");
        }
        System.out.println(map);

        System.out.println("=================================");
        Map<String,List<String>> map1 = new HashMap<>();
        for (String s:list) {
            if(map1.containsKey(String.valueOf(s.charAt(0)))){
                List<String> list4 = new ArrayList<>(map1.get(String.valueOf(s.charAt(0))));
                list4.add(s);
                map1.put(String.valueOf(s.charAt(0)), list4);
            }else {
                List<String> list3 = new ArrayList<>();
                list3.add(s);
                map1.put(String.valueOf(s.charAt(0)), list3);
            }
        }
        System.out.println(map1);

        System.out.println("=================================");
        Map<String,String> map2 = new HashMap<>();
        for (String s:list) {
            if(map2.containsKey(String.valueOf(s.charAt(0)))){
                String value = map2.get(String.valueOf(s.charAt(0)))+":"+s.charAt(1);
                map2.put(String.valueOf(s.charAt(0)), value);
            }else {
                map2.put(String.valueOf(s.charAt(0)), String.valueOf(s.charAt(1)));
            }
        }
        System.out.println(map2);
    }
}
