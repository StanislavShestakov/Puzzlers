package main.java.BestExmaples.bubbleSort;

import java.util.Arrays;

/**
 * Created by Stas on 30.05.2019.
 */
public class SuperBubbleSort {
    static <E extends Comparable<E>> E[] sort(E[] arr) {
        int n = arr.length;
        E temp;
        for(int i=0; i < n; i++) {
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
    static <E extends Comparable<E>> E[] sort(int[] ints) {
        Integer[] wrappedInts = Arrays.stream(ints)
                .boxed()
                .toArray(Integer[]::new);
       return  (E[]) sort(wrappedInts);
    }
    /*static <E extends Comparable<E>> E[] sort(Object object) {
        E[] temp = null;
        if (object instanceof int[]) {
            int[] arr = (int[]) object;
            Integer[] result = new Integer[arr.length];
            for (int i = 0; i < arr.length; i++) {
                result[i] = Integer.valueOf(arr[i]);
            }
            temp = (E[]) sort(result);
        } else if (object instanceof double[]) {
            double[] arr = (double[]) object;
            Double[] result = new Double[arr.length];
            for (int i = 0; i < arr.length; i++) {
                result[i] = Double.valueOf(arr[i]);
            }
            temp = (E[])  sort(result);

        } else if (object instanceof short[]) {
            short[] arr = (short[]) object;
            Short[] result = new Short[arr.length];
            for (int i = 0; i < arr.length; i++) {
                result[i] = Short.valueOf(arr[i]);
            }
            temp = (E[])  sort(result);
        } else if (object instanceof char[]) {
            char[] arr = (char[]) object;
            Character[] result = new Character[arr.length];
            for (int i = 0; i < arr.length; i++) {
                result[i] = Character.valueOf(arr[i]);
            }
            temp = (E[])   sort(result);
        } else if (object instanceof byte[]) {
            Byte[] arr = (Byte[]) object;
            Byte[] result = new Byte[arr.length];
            for (int i = 0; i < arr.length; i++) {
                result[i] = Byte.valueOf(arr[i]);
            }
            temp = (E[])   sort(result);
        } else if (object instanceof long[]) {
            long[] arr = (long[]) object;
            Long[] result = new Long[arr.length];
            for (int i = 0; i < arr.length; i++) {
                result[i] = Long.valueOf(arr[i]);
            }
            temp = (E[])   sort(result);
        } else if (object instanceof float[]) {
            float[] arr = (float[]) object;
            Float[] result = new Float[arr.length];
            for (int i = 0; i < arr.length; i++) {
                result[i] = Float.valueOf(arr[i]);
            }
            temp = (E[])     sort(result);
        } else if (object instanceof boolean[]) {
            boolean[] arr = (boolean[]) object;
            Boolean[] result = new Boolean[arr.length];
            for (int i = 0; i < arr.length; i++) {
                result[i] = Boolean.valueOf(arr[i]);

            }
            temp = (E[]) sort(result);
        }else{
                throw new RuntimeException("not supported type of array!");
            }
        return temp;
    }*/
}
