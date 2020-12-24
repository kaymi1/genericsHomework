package ru.sbt.generics;

import java.net.DatagramPacket;
import java.util.HashMap;
import java.util.Map;

public class TestCountMap {

    public static void main(String[] args) {
        CountMap<Double> map = new CountMapImp<>();

        map.add(10.0);
        map.add(10.0);
        map.add(5.0);
        map.add(6.0);
        map.add(5.0);
        map.add(10.0);

        CountMap<Double> map2 = new CountMapImp<>();
        map2.add(23.12);
        map2.add(23.12);
        map2.add(12.12);

        map.addAll(map2);
        Map<Double, Integer> destanation = new HashMap<>();
        map.toMap(destanation);

        System.out.println(map.getCount(5.0)); // 2
        System.out.println(map.getCount(6.0)); // 1
        System.out.println(map.remove(10.0)); // 3
        System.out.println(map.getCount(10.0)); // 0
        System.out.println(map.size()); // 4
        System.out.println(map.getCount(23.12)); // 2
        System.out.println("----------------------------------------");
        System.out.println(destanation.size()); // 4
    }
}
