

public class App {
    public static void main(String[] args) {

        String info = "";

        info += "Hello";
        info += " ";
        info += "there.\n";

        System.out.printf(info);

        // More efficient
        StringBuilder sb = new StringBuilder("");

        sb.append("My name is Sue.");
        sb.append(" ");
        sb.append("I am a lion tamer.");

        System.out.println(sb.toString());

        StringBuilder s = new StringBuilder();

        s.append("My name is Roger.")
                .append(" ")
                .append("I am a skydiver.");

        System.out.println(s.toString());

        ///// Formatting /////////////////////////////////////////////////////

        System.out.print("Here is some text.\tThat was a tab.\nThat was a newline.");
        System.out.println(" More text.");

        // Formatting integers
        System.out.printf("Total cost %-10d; quantity is %d\n", 5, 120);

        for(int i=0; i<20; i++) {
            System.out.printf("%-2d: %s\n", i, "here is some text");
        }

        // Formatting floating point value
        System.out.printf("Total value: %.2f\n", 5.6874);
        System.out.printf("Total value: %-6.1f\n", 343.23423);
    }
}
