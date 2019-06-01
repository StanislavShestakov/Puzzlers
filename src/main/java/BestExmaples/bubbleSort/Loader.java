package main.java.BestExmaples.bubbleSort;

import java.util.Arrays;

/**
 * Created by Stas on 29.05.2019.
 */
public class Loader {
    //this example shows, how to sort arrays of any types without utilites
    public static void main(String[] args) {

        System.out.println("\n Sort Integers ==========================\n");
        Integer integers[] ={3,60,35,2,45,320,5};
        System.out.println(Arrays.toString(integers));
        System.out.println(Arrays.toString(SuperBubbleSort.sort(integers)));
        System.out.println("\n Sort Strings ==========================\n");
        String strings[] = {"apple","carrot","tomato","peas","barries","potato","cerries"};
        System.out.println(Arrays.toString(strings));
        System.out.println(Arrays.toString(SuperBubbleSort.sort(strings)));
        System.out.println("\n Sort ints ==========================\n");
        int []  intPrimitives = {3,60,35,2,45,320,5};
        System.out.println(Arrays.toString(intPrimitives));
        System.out.println(Arrays.toString(SuperBubbleSort.sort(intPrimitives)));

    }



}
