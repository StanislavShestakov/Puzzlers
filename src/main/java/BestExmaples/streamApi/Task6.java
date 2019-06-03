package BestExmaples.streamApi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Stas on 03.06.2019.
 */
public class Task6 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list = Arrays.asList(1, 2, 3, 4, 2);
        System.out.println(list.toString());

        int count = 0;
        for (Integer i:list) {
                count += i;
        }
        System.out.println(count);

        int count1 = -1;
        for (Integer i:list) {
            if(i > count1)
            count1 = i;
        }
        System.out.println(count1);

        int count2 = 0;
        for (Integer i:list) {
            if(i % 2 == 1)
                count2 += i;
        }
        System.out.println(count2);

    }
}
