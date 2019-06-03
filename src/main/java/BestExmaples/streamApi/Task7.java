package BestExmaples.streamApi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Stas on 03.06.2019.
 */
public class Task7 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4);
        System.out.println(list.toString());

        int count = 0;
        for (Integer i : list) {
            if (i % 2 == 1)
                count += i;
        }
        System.out.println(count);

        int count1 = 0;
        for (Integer i : list) {
            count1 += (i - 1);
        }
        System.out.println((double) count1 / list.size());

        List<Integer> evens = new ArrayList<>();
        List<Integer> odds = new ArrayList<>();
        for (Integer i : list) {
            if (i % 2 == 1)
                odds.add(i);
            else
                evens.add(i);
        }
        System.out.println("{false=" + odds + ", true=" + evens + "}");

        int count2 = 0;
        int sum = 0;
        int min = list.get(0)+3;
        double average = 0.0;
        int max = 0;
        for (Integer i : list) {
            i += 3;
            if (i > max) {
                max = i;
            }
            if (i < min) {
                min = i;
            }
            sum += i;
        }
        System.out.println("IntSummaryStatistics{count=" + list.size() + ", sum=" + sum + ", min=" + min + ", average=" + (double)
                sum / list.size() + ", " +
                "max=" + max + "}");
    }
}
