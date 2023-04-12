package com.epam.loops;

public class HalfPyramid {

    public static void main(String[] args) {
        new HalfPyramid().printHalfPyramid(8);
    }

    public void printHalfPyramid(int cathetusLength) {
        for (int i = 1; i < cathetusLength + 1; i++) {
            System.out.println(" ".repeat(cathetusLength - i) + "*".repeat(i));
        }
    }

}
