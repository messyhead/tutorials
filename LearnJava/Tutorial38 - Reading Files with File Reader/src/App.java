import java.io.*;

public class App {
    public static void main(String[] args) {
        File file = new File("Tutorial38 - Reading Files with File Reader/tests.txt");

        BufferedReader br = null;

        try {
            FileReader fr = new FileReader(file);
            br = new BufferedReader(fr);

            String line;

            while( (line = br.readLine()) != null) {
                System.out.println(line);
            }

        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + file.toString());
        } catch (IOException e) {
            System.out.println("Unable to read file: " + file.toString());
        }

        try {
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
