public class HelloApp {
    public static void main(String[] args) {
        StringBuilder nameBuilder = new StringBuilder();
        
        if (args.length > 0) {
            for (String name : args) {
                nameBuilder.append(name).append(", "); // append all names with comma and space
            }
            // Remove trailing ", "
            if (nameBuilder.length() > 0) {
                nameBuilder = new StringBuilder(nameBuilder.substring(0, nameBuilder.length() - 2));
            }
        } else {
            nameBuilder.append("World"); // default
        }
        
        System.out.println("Hello, " + nameBuilder.toString() + "!");
    }
}