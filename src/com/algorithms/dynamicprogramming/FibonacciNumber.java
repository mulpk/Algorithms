package com.algorithms.dynamicprogramming;

public class FibonacciNumber {


    public int fibonacciTabulation(int N) {
        if(N == 0) {
            return 0;
        } else if(N == 1) {
            return 1;
        }
        int[] fibArr = new int[N+1];
        fibArr[0] = 0;
        fibArr[1] = 1;
        for(int i = 2; i <= N; i++) {
            fibArr[i] = fibArr[i-1] + fibArr[i-2];
        }
        return fibArr[N];
    }

    // using recursion - has overlapping sub problems
    public int fibonacciRecursion(int N) {
        if(N == 0) {
            return 0;
        } else if(N == 1) {
            return 1;
        }
        return fibonacciRecursion(N-1) + fibonacciRecursion(N-2);
    }

    int mem[];

    public int fibonacciUsingMemorization(int N) {
        mem = new int[N+1];
        for(int i = 0; i <= N; i++) {
            mem[i] = -1;
        }

        return fibonacciMemorization(N, mem);
    }

    // optimal solution
    public int fibonacciMemorization(int N, int[] mem) {
        if(N == 0) {
            return 0;
        } else if(N == 1) {
            return 1;
        }
        if(mem[N] != -1) {
            return mem[N];
        }
        return (mem[N] = fibonacciMemorization(N-1, mem) + fibonacciMemorization(N-2, mem));
    }
}
