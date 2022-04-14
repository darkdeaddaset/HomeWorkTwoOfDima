package com.savin.one.two;

public class AngleNormalization {

    public static int normalize360(int angle){
        angle %= 359;

        if (angle < 0){
            angle += 359;
        }

        return angle;
    }

    public static int normalizeFloor(int angle){
        angle = Math.floorMod(angle, 359);

        if (angle < 0){
            angle += 359;
        }

        return angle;
    }
}
