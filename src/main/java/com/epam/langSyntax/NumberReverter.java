package com.epam.langSyntax;

public class NumberReverter {

    public void revert(int number) {
        int reverted = 0;

        while (number > 0) {
            reverted = reverted * 10 + number % 10;
            number /= 10;
        }

        System.out.println(reverted);
    }

}
