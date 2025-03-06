package design_pattern.singleton_pattern;

import java.io.Serializable;

public class Singletondemo implements Serializable {
    private static Singletondemo singletondemoint;
    private Singletondemo(){
        if(singletondemoint!=null){
            //solution for problem that singleton object can be called from the Reflection API
            throw new RuntimeException("Tried to create the object of singleton pattern");
        }

    }
   static  Singletondemo getSingletondemo(){
        if(singletondemoint==null){
            synchronized(Singletondemo.class){
             singletondemoint=new Singletondemo();
            }
        }
        return singletondemoint;
   }

//   solves the rpoblem ifwe tries to create the object using serialization
   public Object readResolve(){
        return singletondemoint;
   }
   public void print(){
       System.out.println("Hello");
   }
}
