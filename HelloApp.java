public class HelloApp {
    public static void main(String[] args) {
        // If a name is provided, use it; otherwise default to "World"
        String name = (args.length > 0) ? args[0] : "World";
        System.out.println("Hello, " + name + "!");
    }
}