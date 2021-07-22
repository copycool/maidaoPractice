package cn.maidaotech.java07.ch04.Question9;

import java.util.Comparator;

public class CompareY implements Comparator<Point> {

    @Override
    public int compare(Point o1,Point o2) {
        // return o1.getY()==o2.getY()?o1.getX()-o2.getX():o1.getY()-o2.getY();
     
        if(o1.getY()==o2.getY()){
         return o1.getX()-o2.getX();
     }else{
         return o1.getY()-o2.getY(); 
     }
    }
 
 }
    
