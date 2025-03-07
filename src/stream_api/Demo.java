package java8.stream_api;

import java.util.*;
import java.util.stream.Collectors;

public class Demo {
    public static void main(String[] args) {
        List<Integer> arrayList=new ArrayList<>();
        arrayList.add(123);
        arrayList.add(812);
        arrayList.add(456);
        arrayList.add(4567);

        List<Integer> arrayList2=arrayList.stream().filter(I->I%2==0).collect(Collectors.toList());
        System.out.println(arrayList);
        System.out.println(arrayList2);

        List<String> arrayList3=new ArrayList<>();
        arrayList3.add("hello");
        arrayList3.add("aadi");
        arrayList3.add("getout");
        arrayList3.add("varun");

        List<String> arrayList4=arrayList3.stream().filter(c->c.length()==5).map(s->s.toUpperCase()).collect(Collectors.toList());
        System.out.println(arrayList3);
        System.out.println(arrayList4);

        List<Integer> arrayList5=arrayList.stream().map(a->a*10).collect(Collectors.toList());
        System.out.println(arrayList5);

        long count = arrayList3.stream().filter(s->s.length()>=5).count();
        System.out.println("count"+count);


        List<Integer>arrayList6= arrayList.stream().sorted((a,b)->- b.compareTo(a)).collect(Collectors.toList());
        System.out.println(arrayList6);

        Integer min = arrayList.stream().min(Integer::compareTo).get();
        System.out.println(min);

        arrayList.stream().forEach(a-> System.out.print(a+" "));

        Integer[] array = arrayList.stream().toArray(Integer[]::new);

        System.out.println(Arrays.toString(array));
    }
}
