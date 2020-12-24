package ru.sbt.generics;

import java.util.ArrayList;
import java.util.List;

public class CollectionSimpleExample {
    public <T extends Number> T process(List<T> list) {
        return list.get(0);
    }
}