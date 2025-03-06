package design_pattern.prototype_pattern;

public class PrototypeDemo implements Cloneable {
    void print(){
        System.out.println("this is printed");
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
