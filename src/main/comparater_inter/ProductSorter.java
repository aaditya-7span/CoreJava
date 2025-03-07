package java8.comparater_inter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ProductSorter implements Comparator<String> {

    //without lamda function
    @Override
    public int compare(String s1, String s2) {
        return s2.compareTo(s1);
    }

    public static void main(String[] args) {
        ArrayList<String> arrayList=new ArrayList<>();
        arrayList.add("Laptop");
        arrayList.add("Smartphone");
        arrayList.add("headphone");
        arrayList.add("tablet");
        arrayList.add("smartwatch");

        System.out.println(arrayList);
        long l = System.currentTimeMillis();
        Collections.sort(arrayList,(s1,s2) -> s2.compareTo(s1)); //with lamda function [arrylist ,new Test()]
        long s = System.currentTimeMillis();
        System.out.println(arrayList);
        System.out.println(s-l);


    }
}
