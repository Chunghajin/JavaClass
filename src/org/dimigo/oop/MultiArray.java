package org.dimigo.oop;

public class MultiArray {
    public static void main(String[] args) {
        int[][] intArr = new int[2][3];
        printArray(intArr);

        intArr[0][2] = 100;
        intArr[1][1] = 100;

        // String 타입 이차원배열
        // C C++ Java
        // C# PHP

        String[][] strArr = {
                {"C","C++","JAVA"},
                {"C#","PHP"}
        };


        printArray(strArr);

    }

    public static void printArray(int[][] intArr) {
        for (int[] arr : intArr) {
            for (int value : arr) {
                System.out.print(value + " | ");
            }
        }
    }
    public static void printArray(String[][] strArr) {
        for (String[] arr : strArr) {
            for (String value : arr) {
                System.out.print(value + " | ");
            }
        }
    }
}

