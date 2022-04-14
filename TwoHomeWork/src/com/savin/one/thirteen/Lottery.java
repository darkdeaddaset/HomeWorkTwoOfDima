package com.savin.one.thirteen;

public class Lottery {

    public static int[] getMassOfNumber(){
        int[] a = new int[49];
        int z = 0;

        for (int i = 0; i < 49; i++){
            ++z;
            a[i] = z;
        }

        return a;
    }

    public static int[] selectedOfNumbers(int[] a){
        int[] result = new int[6];

        for (int i = 0; i < a.length; i++){
            result[i] = a[i];
        }

        return result;
    }

    public static int[] deletedNumbers(int[] mass, int[] selected){
        int num = 0;

        for (int i = 0; i < selected.length; i++){
            num = selected[i];

            mass[num-1] = 0;
        }
        return mass;
    }

    public static int[] generatedOFNumbers(){
        int z[] = new int[6];
        for (int i = 0; i < 6; i++){
            z[i] = (int) (1 + Math.random() * 49);
        }
        return z;
    }
}
