package com.zsy.Array;

public class ArrayDemo05 {
    public static void main(String[] args) {
        int[] faceScores = {15, 9000, 10000, 20000, 9500, -5};

        int max = faceScores[0];

        for (int i = 0; i < faceScores.length; i++) {
            if (faceScores[i] > max) {
                max = faceScores[i];
            }
        }
        System.out.println(max);
    }
}
