package com.efectivejava.general.foreach;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ForLoop {

    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(1,2,3,4,5,6,7,8,9,0);

        for (Iterator<Integer> i=integers.iterator();i.hasNext();){
            System.out.println(i);
        }
     //   for (Integer i:integers) {
     //       System.out.println(i);
     //   }
    }


}
