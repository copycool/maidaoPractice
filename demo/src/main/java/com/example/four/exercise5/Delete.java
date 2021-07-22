package com.example.four.exercise5;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.concurrent.LinkedBlockingDeque;

public class Delete {
    public static void main(String[] args) {
        Collection a = new ArrayList<>();
        Collections.addAll(a, 20,13,3,12,3,4,24,30,6,4,6,7,8,9,10,11,17,18,19,20);
        LinkedHashSet<Integer> hashSet = new LinkedHashSet<>(a);
        
        ArrayList<Integer> listWithoutDuplicates = new ArrayList<>(hashSet);
        System.out.println(listWithoutDuplicates);

    }
}