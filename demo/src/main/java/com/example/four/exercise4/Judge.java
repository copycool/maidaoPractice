package com.example.four.exercise4;


    

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import javax.naming.spi.DirStateFactory.Result;

public class Judge {
    public static void main(String[] args) {
        Collection a = new ArrayList();
        Collections.addAll(a, 1,2,3,4);
        
        Collection b = new ArrayList();
        Collections.addAll(b, 1,4,5,7);
        System.out.println("a的集合"+a);
        System.out.println("b的集合"+b);
        System.out.println("交集为："+c);
        System.out.println("并集为："+d);


    }
    public List intersection(int[] a,int[] b){
        List<Integer> c = new ArrayList<>();
        int i = 0,j = 0;
        while (i<a.length && j<b.length) {
            if(a[i]<b[j]){
                i++;
            }else if (a[i]>b[j]) {
                j++;
            }else{
                c.add(a[i]);
                i++;
                j++;
            }
            
        }
        return c;
    }
    public List union(int[] a,int[] b){
        List<Integer> d = new ArrayList<>();
        int i = 0,j = 0;
        while (i<a.length && j<b.length) {
            if (a[i]<b[j]) {
                d.add(a[i]);
                i++;
                
            }else if (a[i]>b[i]) {
                d.add(b[j]);
                j++;
                
            }else{
                d.add(a[i]);
                i++;
                j++;
            }
            
        }
        while(i<a.length){
            d.add(a[i]);
            i++;
        }
        while(j<b.length){
            d.add(b[j]);
            j++;
        }
        return d;
    }
    
}
    
