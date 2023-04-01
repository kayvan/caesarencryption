import java.util.Scanner;

public class juliuscaesar {
    public static final Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Please enter your word: ");
        String in = sc.nextLine().toLowerCase(), enc = "";
        for (int i = 0; i < in.length(); i++) {
            char c = in.charAt(i);
            if (c == ' ') {
                enc += ' '; // Handle spaces separately
            } else {
                char shifted = (char) ((c - 'a' + 1) % 26 + 'a'); // Shift the character by 1
                enc += shifted;
            }
        }
        enc = enc.toUpperCase(); // Convert the output to uppercase
        System.out.println(enc);
    }
}