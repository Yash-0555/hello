public class HelloApp {
    public static void main(String[] args) {
        String greeting;
        
        if (args.length > 0) {
            // Join all names with comma and space
            greeting = String.join(", ", args);
        } else {
            // Default if no names provided
            greeting = "World";
        }
        
        System.out.println("Hello, " + greeting + "!");
    }
}