package com.efectivejava.method.nullReturn;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

public class NullReturn {

    public static void main(String[] args) {
        if (list()!=null && list().size()>0){
            // Null kontrolü ve size kontrolü
        }
        if (getName()!=null){
            // Null kontrolü
        }

        if (listV2().size()>0){
            // size kontrolü
        }
        if (getNameV2().isPresent()){
            getNameV2().get();
            // optional kontrolü
        }
    }

    private static List<String> list(){
        return null;
    }

    private static String getName(){
        return null;
    }

    private static List<String> listV2(){
        return Collections.emptyList();
    }

    private static Optional<String> getNameV2(){
        return Optional.empty();
    }


}
