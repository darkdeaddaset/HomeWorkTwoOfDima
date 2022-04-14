package com.savin.one.eight;

public class NonStringEmpty {
    public static String substringNonEmpty(String str){
        String s = "";

        if (str == null || str.isEmpty() || str.trim().isEmpty()){
            return "This is string null or empty";
        }
        else {
            str = str.trim();

            for (int i = 0; i < str.length(); i++){
                for (int j = i; j < str.length(); j++){
                    if (!(str.charAt(j) == ' ')){
                        s += str.charAt(j);
                    }
                }
                s += "\n";
            }
            return s;
        }
    }



}
