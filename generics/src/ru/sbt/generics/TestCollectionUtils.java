package ru.sbt.generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class TestCollectionUtils {
    public static void main(String[] args) {
        List<Double> list = new LinkedList<>();
        list.add(2.0);
        list.add(1.4);
        list.add(3.4);
        list.add(5.5);
        list.add(6.9);
        list.add(9.1);
        list.add(10.2);
        list.add(12.4);
        //System.out.println(CollectionUtils.<Number>indexOf(list, 1));


        //CollectionUtils.<Double>add(list, 5.1);
        //System.out.println(CollectionUtils.<Number>indexOf(list, 5.1));
        System.out.println(CollectionUtils.range(list, 1.4, 9.1));
    }
}
