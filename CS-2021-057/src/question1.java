import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class question1 {
    public static void main(String[] args) {
        Scanner SCANNER = new Scanner(System.in);
        String word;
        System.out.println("Enter a word");
        word  = SCANNER.next();

            int position;
            int length;


            if (word.length() % 2 == 0) {
                System.out.println("The word entered is not an odd number please enter another word with odd number of letters");
            } else {
                position = word.length() / 2;
                length = 1;
                System.out.println("answer is  "+" "+ word.substring(position, position + length));
            }



    }
}