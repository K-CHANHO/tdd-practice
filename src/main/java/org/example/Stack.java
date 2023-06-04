package org.example;

import java.util.ArrayList;
import java.util.List;

public class Stack {

    List<Integer> stack = new ArrayList<Integer>();

    public Stack(){}
    public Stack(List<Integer> init_list) {
        for (Integer integer : init_list) {
            stack.add(integer);
        }

    }

    public int size() {
        return stack.size();
    }

    public Integer head() {
        if(stack.size() == 0)
            return null;

        return stack.get(stack.size()-1);
    }

    public void push(int i) {
        stack.add(i);
    }
}
