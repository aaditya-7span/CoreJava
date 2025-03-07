package java17.sealed_classes;

public abstract sealed class Shape permits Circle, Square, Triangle {
    public abstract double area();
}
