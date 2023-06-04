package org.example;

import java.util.ArrayList;
import java.util.List;

public class Queue {

    List<Integer> queue = new ArrayList<Integer>();

    public Queue(){

    }

    public Queue(List<Integer> init_values) {

        for (Integer init_value : init_values) {
            queue.add(init_value);
            System.out.println(init_value);
        }

    }
    public int size() {
        return queue.size();
    }

    public Integer head() {
        if(queue.size() == 0) return null;

        return queue.get(queue.size()-1);
    }

    public Integer tail() {
        if(queue.size() == 0) return null;

        return queue.get(0);
    }

    public void push(int i) {
        queue.add(0, i);
    }

    public Integer pop() {

        if (queue.size() == 0) {
            return null;
        }

        return queue.remove(queue.size()-1);
    }
}
