package com.leetcode.twoPointers;

public class SortedArraySquares {
    public static int[] makeSquares(int[] arr) {
        int[] squares = new int[arr.length];
        int left = 0;
        int right = arr.length - 1;
        int squareIndex = arr.length - 1;
        while (left <= right) {
            int leftSquare = arr[left] * arr[left];
            int rightSquare = arr[right] * arr[right];
            if (leftSquare < rightSquare) {
                squares[squareIndex] = rightSquare;
                right--;
            } else {
                squares[squareIndex] = leftSquare;
                left++;
            }
            squareIndex--;
        }
        return squares;
    }
}
