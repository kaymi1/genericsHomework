package ru.sbt.generics;

import java.util.HashMap;
import java.util.Map;

public class CountMapImp<T extends Number> implements CountMap<T>{
    private Map<T, Integer> map;

    public CountMapImp(){
        map = new HashMap<>();
    }

    @Override
    public void add(T t) {
        map.put(t, getCount(t) + 1);
    }

    @Override
    public int getCount(T t) {
        if(map.get(t) == null){
            return 0;
        }
        return map.get(t);
    }

    @Override
    public int remove(T t) {
        if(map.get(t) == null){
            return 0;
        }
        int temp = map.get(t);
        map.remove(t);
        return temp;
    }

    @Override
    public int size() {
        return map.size();
    }

    @Override
    public void addAll(CountMap<T> source) {
        for (T t: source.toMap().keySet()) {
            map.put(t, getCount(t) + source.getCount(t));
        }
    }

    @Override
    public Map<T, Integer> toMap() {
        return map;
    }

    @Override
    public void toMap(Map<T, Integer> destination) {
        destination = toMap();
    }
}
