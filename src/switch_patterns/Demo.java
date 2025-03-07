package java17.switch_patterns;

public class Demo {
    public static void main(String[] args) {
        Object obj1 = 'e';
        Object obj2 = "Hello World";
        Object obj3 = 3.14;
        Object obj4 = null;

        System.out.println(getType(obj1));
        System.out.println(getType(obj2));
        System.out.println(getType(obj3));
        System.out.println(getType(obj4));
    }

    // Method using switch with pattern matching
    public static String getType(Object obj) {
        return switch (obj) {
            case Integer i -> "Integer";
            case String s -> "String";
            case Double d -> "Double";
            case null -> "null value";
            default -> "Unknown Type";
        };
    }
}

