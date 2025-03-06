package design_pattern.factory_pattern;

public class Webdeveloper implements Employee{

    @Override
    public int salary() {
        System.out.println("this is webdeveloper salary");
        return 50000;
    }
}
