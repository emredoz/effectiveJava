package com.efectivejava.immutable;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class Test {

    public static void main(String[] args) {


        NonImmutablePerson nonImmutablePerson = new NonImmutablePerson(123456789l);

        Map<Object, Object> map = getMap();

        map.put(nonImmutablePerson,"Emre");

        nonImmutablePerson.setId(0l);

        System.out.println("first call:"+map.get(nonImmutablePerson));

        nonImmutablePerson.setId(123456789l);

        System.out.println("second call:"+map.get(nonImmutablePerson));

        ImmutablePerson immutablePerson = new ImmutablePerson(1l);

        Map<Object, Object> map1 = getMap();

        map1.put(immutablePerson,"Emre");

        System.out.println("first call:"+map1.get(immutablePerson));


        System.out.println("second call:"+map1.get(immutablePerson));



    }

    private static Map<Object,Object> getMap(){
        return new Hashtable<>();
    }
}
