package com.calculator;

public class Calculator{
    public void Sum(int[] array){
        int total =0;
        try {
            for (int i = 0; i < array.length; i++) {
                total = total + array[i];
            }
        }
        catch (Exception e ) {
            ExceptionHandling exc =new ExceptionHandling();
                exc.Exceptions("wrong array");
            }


    }
}
