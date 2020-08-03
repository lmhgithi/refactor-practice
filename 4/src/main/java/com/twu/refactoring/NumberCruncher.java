package com.twu.refactoring;

import java.util.function.Predicate;

public class NumberCruncher {
    private final int[] numbers;

    public NumberCruncher(int... numbers) {
        this.numbers = numbers;
    }

    private int universalCount(Predicate<Integer> pred) {
        int count = 0;
        for (int num : numbers) {
            if (pred.test(num)) {
                count++;
            }
        }
        return count;
    }

    public int countEven() {
        return universalCount((number) -> number % 2 == 0);
    }

    public int countOdd() {
        return universalCount((number) -> number % 2 == 1);
    }

    public int countPositive() {
        return universalCount((number) -> number >= 0);
    }

    public int countNegative() {
        return universalCount((number) -> number < 0);
    }
}
