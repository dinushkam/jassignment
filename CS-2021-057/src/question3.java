import java.util.Scanner;

public class question3 {
    public static void main(String[] args) {

        Scanner scam= new Scanner(System.in);
        System.out.println("Enter the length in centimeters");
        double length= scam.nextInt();
        double tinch =length / 2.54;
        int feet = (int) tinch / 12;
        double inch = tinch % 12 ;
        System.out.println(feet + "feets " + inch + "inches");

    }
}




