package com.savin.three.four;

public class IntSequence implements Sequence{
    private int[] a;

    public IntSequence(int ... numbers){
        a = numbers;
    }

    @Override
    public void foreach() {
        for (int a1 : a){
            System.out.print(a1);
        }
        System.out.println(" - Used classes");
    }

    public void constant(int value){
        for (int i = 0; i < 100; i++){
            System.out.print(value);
        }
    }
}