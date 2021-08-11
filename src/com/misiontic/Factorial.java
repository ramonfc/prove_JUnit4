package com.misiontic;

public class Factorial {
    public long calculateFactorial(int num){
        long resultFactorial = 1;
        for(int i= 2; i<=num; i++){
            resultFactorial *= i;
        }
        return resultFactorial;
    }
}
