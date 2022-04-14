package com.savin.one.fourteen;

public class TwoMassive {
    private String str;

    public TwoMassive(String str){
        this.str = str;
    }

    public int[] makeMassiveOfString(){
        int[] a = new int[str.length()];

        for (int i = 0; i < a.length; i++){
            a[i] = Integer.parseInt(String.valueOf(str.charAt(i)));
        }
        return a;
    }

    public int[][] makeMassive(){
        int length = (int) Math.sqrt(str.length());
        int count = 0;

        int[][] a = new int[length][length];
        int[] b = makeMassiveOfString();

        for (int i = 0; i < a.length; i++){
            for (int j = 0; j < a[i].length; j++){
                if (b.length > count)
                a[i][j] = Integer.parseInt(String.valueOf(str.charAt(count++)));
            }
        }
        return a;
    }

    public String compareRowsAndColumns(int[][] a){
        int rows = a.length;
        int columns = a[0].length;

        return rows == columns ? "Square matrix" : "It`s not magic matrix";
    }


    public int[] sumAllRows(int[][] a){
        int rows = a.length;
        int columns = a[0].length;
        int[] result = new int[rows];

        for (int i = 0; i < rows; i++){
            for (int j = 0; j < columns; j++){
                result[i] += a[i][j];
            }
        }
        return result;
    }

    public int[] sumAllColumns(int[][] a){
        int rows = a.length;
        int columns = a[0].length;
        int[] result = new int[columns];

        for (int i = 0; i < rows; i++){
            for (int j = 0; j < columns; j++){
                result[i] += a[j][i];
            }
        }
        return result;
    }

    public boolean checkAllSumRowsOrColumns(int[] sum){
        boolean state = false;
        for (int i = 0; i < sum.length-1; i++){
            state = sum[i] == sum[i+1];
        }
        return state;
    }

    public int getMainDiagonal(int[][] a){
        int count = 0;
        int result = 0;

        for (int i =0; i < a.length; i++){
            result += a[i][count++];
        }
        return result;
    }

    public int getSideDiagonal(int[][] a){
        int count = a[0].length-1;
        int result = 0;

        for (int i = 0; i < a.length; i++){
            result += a[i][count--];
        }
        return result;
    }



}
