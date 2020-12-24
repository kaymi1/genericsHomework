package ru.sbt.generics;

import java.util.*;

public class CollectionUtils{
    public static<T> void addAll(List<? extends T> source, List<? super T> destination) {
        destination.addAll(source);
    }
    public static<T> List<? extends T> newArrayList(T...value) {
        return Arrays.asList(value);
    }
    public static<T> int indexOf(List<? extends T> source, T t) {
        return source.indexOf(t);
    }
    public static<T> List<? super T> limit(List<? extends T> source, int size) {
        List<? super T> list = new LinkedList<>();
        for (int i = 0; i < size + 1; i++) {
            list.add(source.get(i));
        }
        return list;
    }
    public static<T> List<? super T> limitLeft(List<? extends T> source, int size) {
        List<? super T> list = new LinkedList<>();
        for (int i = size; i < source.size(); i++) {
            list.add(source.get(i));
        }
        return list;
    }
    public static<T> void add(List<? super T> source, T t) {
        source.add(t);
    }
    public static void removeAll(List removeFrom, List c2) {

    }
    public static<T> boolean containsAll(List<? extends T> c1, List<? extends T> c2) {
        if(c1 == c2){
            return true;
        }
        return false;
    }
    public static<T> boolean containsAny(List<? extends T> c1, List<? extends T> c2) {
        for (T t: c1) {
            for (T t1: c2) {
                if(t == t1){
                    return true;
                }
            }
        }
        return false;
    }
    public static<T extends Comparable<? super T>> List<? super T> range(List<T> list, T min, T max) {
        Collections.sort(list);
        List<? super T> list1 = limit(list, list.indexOf(max));
        List<? super T> list2 = limitLeft(list1, list.indexOf(min));
        return list2;
    }
    public static<T extends Comparable<? super T>> List<? super T> range(List<T> list, T min, T max, Comparator<T> comparator) {
        List<T> rangedList = new ArrayList<>();
        for (T t: list) {
            if(comparator.compare(t, min) >= 0 && comparator.compare(t, max) <= 0){
                rangedList.add(t);
            }
        }
        return rangedList;
    }
}
