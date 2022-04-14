package com.savin.three.four;

public interface Sequence {
    void foreach();

    static Sequence of(int ... numbers){
        return new Sequence(){

            @Override
            public void foreach(){
                for (int a : numbers){
                    System.out.print(a);
                }
                System.out.println(" - Used interface");
            }
        };
    }

    static Sequence constant(int value){
        return new Sequence() {

            @Override
            public void foreach() {
                for (int i = 0; i < 100; i++){
                    System.out.print(value);
                }
            }
        };
    }
}

