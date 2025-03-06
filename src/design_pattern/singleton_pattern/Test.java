package design_pattern.singleton_pattern;

import java.io.*;
import java.lang.reflect.InvocationTargetException;

public class Test  {
    public static void main(String[] args) throws InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchMethodException, IOException, ClassNotFoundException {

        Singletondemo singletondemo = Singletondemo.getSingletondemo();
        Singletondemo singletondemo1 = Singletondemo.getSingletondemo();

        singletondemo.print();
        singletondemo1.print();


        System.out.println(singletondemo.hashCode());
        System.out.println(singletondemo1.hashCode());

        //Reflection API
//        Constructor<Singletondemo> constructor=Singletondemo.class.getDeclaredConstructor();
//        constructor.setAccessible(true);
//        Singletondemo singletondemo3 = constructor.newInstance();


//        System.out.println(singletondemo3.hashCode());


        //Serialization
        ObjectOutputStream oss=new ObjectOutputStream(new FileOutputStream("abc.ob"));
        oss.writeObject(singletondemo);

        System.out.println("serailization done");

        ObjectInputStream ois =new ObjectInputStream(new FileInputStream("abc.ob"));
        Singletondemo singletondemo4=(Singletondemo) ois.readObject();
        System.out.println(singletondemo4.hashCode());
    }
}
