package com.efectivejava.collections;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class HashMapHashTable {

    public static void main(String[] args) {
        ders3();
    }

    public static void ders1(){

        //----------hashtable -------------------------
        Map<Integer,String> ht=new Hashtable<Integer,String>();
        ht.put(101," ajay");
        ht.put(101,"Vijay");
        ht.put(104,"Vijay");
        ht.put(102,"Ravi");
        ht.put(103,"Rahul");
        // Patlar ht.put(null,"emre");
        // Patlar ht.put(110,null);

        System.out.println("-------------Hash table--------------");
        for (Map.Entry m:ht.entrySet()) {
            System.out.println(m.getKey()+" "+m.getValue());
        }

        //----------------hashmap--------------------------------
        Map<Integer,String> hm=new HashMap<Integer,String>();
        hm.put(100,"Amit");
        hm.put(104,"Amit");  // hash map allows duplicate values
        hm.put(101,"Vijay");
        hm.put(102,"Rahul");
        System.out.println("-----------Hash map-----------");
        for (Map.Entry m:hm.entrySet()) {
            System.out.println(m.getKey()+" "+m.getValue());
        }
    }

    public static void ders2(){
        Map<Integer,String> hm=new HashMap<>();
        hm.put(101," ajay");
        hm.put(null,"null String");
        hm.put(1012,null);
        System.out.println(hm.get(null));
        System.out.println("-------------Hash table--------------");
        for (Map.Entry m:hm.entrySet()) {
            System.out.println(m.getKey()+" "+m.getValue());
        }
    }

    public static void ders3(){
        System.out.println("HashMap ve HashTable Hash mechanism Kısacası null ekleme debug");
        Map<Integer,String> hm=new HashMap<>();
        hm.put(null,"Emre");

        Map<Integer,String> ht=new Hashtable<>();
        ht.put(null,"Emre");
    }
}
