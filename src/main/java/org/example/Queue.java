package org.example;

import java.util.ArrayList;
import java.util.List;

public class Queue {

    List<Integer> List_init_Values = new ArrayList<Integer>();

    public Queue(){

    }

    public Queue(List<Integer> init_values) {

        for (Integer init_value : init_values) {
            List_init_Values.add(init_value);
            System.out.println(init_value);
        }

    }
    public int size() {
        return List_init_Values.size();
    }

    public Integer head() {
        if(List_init_Values.size() == 0) return null;

        return List_init_Values.get(List_init_Values.size()-1);
    }

    public Integer tail() {
        if(List_init_Values.size() == 0) return null;

        return List_init_Values.get(0);
    }
}
