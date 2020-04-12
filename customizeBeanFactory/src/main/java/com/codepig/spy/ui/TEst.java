package com.codepig.spy.ui;

import java.util.Scanner;

public class TEst {
    public static void main(String[] args) {
        System.out.println(System.getProperty("java.class.path"));
        int[] arr = new int[]{4,5,0,-2,-3,1};
        Solution.subarraysDivByK(arr,5);
    }
}
class Solution {
    public static int subarraysDivByK(int[] A, int K) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[A.length];
        arr[0] = A[0];
        for (int i = 1; i < A.length; i++){
            arr[i] = A[i] + arr[i-1];
        }
        int[] mod = new int[K];
        for (int i = 0; i < A.length; i++){
            mod[(arr[i] % K + K) % K]++;
        }
        int res = 0;
        for (int i = 0; i <K; i++){
            if (mod[i] > 1){
                res += mod[i] * (mod[i] -1) /2;
            }
        }
        for (int i = 0; i < A.length; i++){
            if (A[i] % K == 0){
                res++;

            }
        }
        return res;
    }
}
