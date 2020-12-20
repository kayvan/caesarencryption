import java.util.Scanner;

public class juliuscaesar {
    public static final Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Please enter your word: ");
        String in = sc.next().toLowerCase() , enc = "" ;
        for(int i = 0 ; i < in.length() ; i++) {
            if( (in.charAt(i)) == 'z'){
                enc+=(char) ('a');
            }
            else
                enc += (char) (in.charAt(i)+1);

        }
        enc = enc.toUpperCase(); // result in upper case
        System.out.println(enc);
    }
}
