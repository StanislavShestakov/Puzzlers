package BestExmaples.streamApi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


/**
 * Created by Stas on 03.06.2019.
 */
public class Task2 {
    public static void main(String[] args) {
        List<People> list = new ArrayList<>();
//        list = new Arrays.asList(new People("Вася", 16, Sex.MAN), new People("Петя", 23, Sex.MAN), new
//                People("Елена", 42, Sex.WOMAN), new People("Иван Иванович", 69, Sex.MAN));
        list.add(new People("Вася", 16, Sex.MAN));
        list.add(new People("Петя", 23, Sex.MAN));
        list.add(new People("Елена", 42, Sex.WOMAN));
        list.add(new People("Иван Иванович", 69, Sex.MAN));

        System.out.println(list.toString());

        List<People> list1 = new ArrayList<>();
        for (People p : list) {
            if (p.getAge() < 27 && p.getAge() > 17) {
                list1.add(p);
            }
        }
        System.out.println(list1);

        int ages = 0;
        List<People> list2 = new ArrayList<>();
        for (People p : list) {
            if (p.getSex().equals(Sex.MAN)) {
                ages += p.getAge();
                list2.add(p);
            }
        }
        System.out.println(ages/list2.size());


        List<People> list3 = new ArrayList<>();
        for (People p : list) {
            if (p.getSex().equals(Sex.MAN)) {
                if (p.getAge() >= 18 && p.getAge() <= 60) {
                    list3.add(p);
                }
            }
            if (p.getSex().equals(Sex.WOMAN)) {
                if (p.getAge() >= 18 && p.getAge() <= 55) {
                    list3.add(p);
                }
            }
        }
        System.out.println(list3);
    }


}


enum Sex {MAN, WOMAN;}

class People implements Comparable<People> {
    String name;
    int age;
    Sex sex;

    public People(String name, int age, Sex sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

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

    @Override
    public String toString() {
        return "People{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex=" + sex +
                '}';
    }

    @Override
    public int compareTo(People o) {
        return this.name.compareTo(o.name);
    }
}
