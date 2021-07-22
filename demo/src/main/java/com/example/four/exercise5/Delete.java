package com.example.four.exercise5;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;

public class Delete {
    public static void main(String[] args) {
        List<Integer> a = new ArrayList<>();
        a.addAll(Arrays.asList(1,3,2,5,4,4));
        LinkedHashSet<Integer> hashSet = new LinkedHashSet<>(a);
        
        ArrayList<Integer> listWithoutDuplicates = new ArrayList<>(hashSet);
        System.out.println(listWithoutDuplicates);

    }
}