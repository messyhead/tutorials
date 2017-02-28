import java.util.Scanner;

public class TestStrings {
    public static void main(String[] args) {

        String string1 = "example.doc";
        System.out.println(string1);

        String string2 = string1.replace("doc","bak");
        System.out.println(string2);

        Scanner words = new Scanner(System.in);

        System.out.println("Enter a word: ");
        String word1 = words.nextLine();
        System.out.println("Enter another word: ");
        String word2 = words.nextLine();

        CompareWords(word1, word2);

    }


    private static void CompareWords(String word1, String word2) {
        if(word1.equalsIgnoreCase(word2)) {
            System.out.println("The words are the same");
        } else
            System.out.println("The words are not the same");
    }
}
