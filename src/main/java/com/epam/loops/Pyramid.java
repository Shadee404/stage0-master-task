package com.epam.loops;

public class Pyramid {

    public static void main(String[] args) {
        new Pyramid().printPyramid(7);
    }

    public void printPyramid(int cathetusLength) {
        StringBuilder pyramidRow = new StringBuilder();


        for (int i = 1; i < cathetusLength; i++) {
            if (i == 1) {
                pyramidRow.append(" ".repeat(cathetusLength - i)).append(1);
                System.out.println(pyramidRow);
            }

            pyramidRow = new StringBuilder(pyramidRow.toString().trim());
            pyramidRow.append(i + 1)
                    .insert(0, " ".repeat(cathetusLength - i - 1))
                    .insert(cathetusLength - i - 1, i + 1);
            System.out.println(pyramidRow);
        }
    }

}
