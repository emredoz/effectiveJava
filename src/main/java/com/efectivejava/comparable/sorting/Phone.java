package com.efectivejava.comparable.sorting;

import java.util.*;

public class Phone implements Comparable<Phone> {
    private Integer code;

    public Phone(Integer code) {
        this.code = code;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "code=" + code +
                '}';
    }

    public static void main(String[] args) {
        Set<Phone> phoneTreeSet = new TreeSet<>();
        Set<Phone> phoneHashSet = new HashSet<>();
        for (int i = 1;i<=10;i++){
            phoneTreeSet.add(new Phone(i));
            phoneHashSet.add(new Phone(i));
        }
        System.out.println(phoneTreeSet);
        System.out.println(phoneHashSet);

        List<Phone> phoneList = new ArrayList<>(phoneTreeSet);
        Collections.sort(phoneList);
        System.out.println(phoneList);
    }

    @Override
    public int compareTo(Phone other) {
        return this.code-other.code;
    }
}
