package ru.sbt.generics;

import java.util.ArrayList;
import java.util.List;

public class ClassCastExceptionExample {
    public static void main(String[] args) {
        CollectionSimpleExample example = new CollectionSimpleExample();
        List<Double> list = new ArrayList<>();
        list.add(2.0);
        list.add(1.0);

        example.process(list);
        System.out.println(list);
    }
}
