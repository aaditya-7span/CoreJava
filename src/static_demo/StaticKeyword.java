package static_demo;

//Static variable
class StaticVariable {
    static int count = 0; // Static variable

    StaticVariable() {
        System.out.println(count);
        count++; // Increment count whenever an object is created
    }

    void showCount() {
        System.out.println("Count: " + count);
    }

}

//    Since count is static, it is shared across all instances (c1, c2, and c3), so the value is incremented for each object creation.


class StaticMethod {
    static int square(int num) {
        return num * num;
    }
}
//Since square is a static method, it can be directly accessed using the class name (StaticMethod.square(5)).


class StaticBlock {
    static String connectionURL;

    // Static block
  static {
        connectionURL = "jdbc:mysql://localhost:3306/mydb";
        System.out.println("Static Block Executed");
    }
}
//The static block executes once when the class is loaded, ensuring connectionURL is initialized before usage.


public class StaticKeyword {

        public static void main(String[] args) {
//            StaticVariable c1 = new StaticVariable();
//            StaticVariable c2 = new StaticVariable();
//            StaticVariable c3 = new StaticVariable();
//
//            c3.showCount(); // Output: Count: 3 (Shared across all objects)



//            int result = StaticMethod.square(5); // Calling static method without an object
//            System.out.println("Square: " + result); // Output: Square: 25



//            System.out.println("StaticBlock URL: " + StaticBlock.connectionURL);
        }

}
