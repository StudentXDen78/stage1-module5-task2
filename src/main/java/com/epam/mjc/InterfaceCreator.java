package com.epam.mjc;

import java.util.ArrayList;
import java.util.List;

public class InterfaceCreator {

    public Operation<Integer> divideBy(Integer divider) {
        return (numbers) -> {
            List<Integer> newList = new ArrayList<>();
            for (Integer n : numbers) newList.add(n / divider);
            return newList;
        };
    }
}
