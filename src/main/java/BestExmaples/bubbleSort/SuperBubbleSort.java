
package BestExmaples.bubbleSort;

import java.util.Arrays;

/**
 * Created by Stas on 30.05.2019.
 */
public class SuperBubbleSort {
    static <E extends Comparable<E>> E[] sort(E[] arr) {
        int n = arr.length;
        ;
        E temp;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {
                if (arr[j - 1].compareTo(arr[j]) > 0) {
                    temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }

            }
        }
        return arr;
    }

    static <E extends Comparable<E>> E[] sort(int[] array) {
        Integer[] wrapped = Arrays.stream(array)
                .boxed()
                .toArray(Integer[]::new);
        return (E[]) sort(wrapped);
    }

    static <E extends Comparable<E>> E[] sort(double[] array) {
        Double[] wrapped = Arrays.stream(array)
                .boxed()
                .toArray(Double[]::new);
        return (E[]) sort(wrapped);
    }

    static <E extends Comparable<E>> E[] sort(long[] array) {
        Long[] wrapped = Arrays.stream(array)
                .boxed()
                .toArray(Long[]::new);
        return (E[]) sort(wrapped);
    }

    static <E extends Comparable<E>> E[] sort(char[] array) {
        Character[] wrapped = new Character[array.length];
        for (int i = 0; i < array.length; i++) {
            wrapped[i] = Character.valueOf(array[i]);
        }
        return (E[]) sort(wrapped);
    }
    static <E extends Comparable<E>> E[] sort(float[] array) {
        Float[] wrapped = new Float[array.length];
        for (int i = 0; i < array.length; i++) {
            wrapped[i] = Float.valueOf(array[i]);
        }
        return (E[]) sort(wrapped);
    }
    static <E extends Comparable<E>> E[] sort(byte[] array) {
        Byte[] wrapped = new Byte[array.length];
        for (int i = 0; i < array.length; i++) {
            wrapped[i] = Byte.valueOf(array[i]);
        }
        return (E[]) sort(wrapped);
    }
    static <E extends Comparable<E>> E[] sort(short[] array) {
        Short[] wrapped = new Short[array.length];
        for (int i = 0; i < array.length; i++) {
            wrapped[i] = Short.valueOf(array[i]);
        }
        return (E[]) sort(wrapped);
    }
    static <E extends Comparable<E>> E[] sort(boolean[] array) {
        Boolean[] wrapped = new Boolean[array.length];
        for (int i = 0; i < array.length; i++) {
            wrapped[i] = Boolean.valueOf(array[i]);
        }
        return (E[]) sort(wrapped);
    }

}
