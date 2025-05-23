package com.ohgiraffers.section01.intro;

public interface OuterCalculator {

    @FunctionalInterface
    public interface Sum{
        int sumTwoNumber (int a, int b);
    }

    @FunctionalInterface
    public interface Minus {
        int minusTwoNumber (int a, int b);
    }

    @FunctionalInterface
    public interface Multiply {
        int multiplyTwoNumber (int a, int b);
    }

    @FunctionalInterface
    public interface Devide {
        int devideTwoNumber (int a, int b);
    }
}
