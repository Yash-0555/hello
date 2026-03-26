public class HelloApp {
    public static void main(String[] args) {
        StringBuilder names = new StringBuilder();
        
        if (args.length > 0) {
            for (String name : args) {
                if (names.length() > 0) {
                    names.append(", "); // add comma separator
                }
                names.append(name);
            }
        } else {
            names.append("World"); // default value
        }
        
        System.out.println("Hello, " + names.toString() + "!");
    }
}