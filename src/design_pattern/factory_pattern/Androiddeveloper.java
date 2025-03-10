package design_pattern.factory_pattern;

public class Androiddeveloper implements Employee{
    @Override
    public int salary() {
        System.out.println("this is android developer salary");
        return 40000;
    }
}
