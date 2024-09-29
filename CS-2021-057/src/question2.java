import java.util.Scanner;

public class question2{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the full name ");

        String firstN = sc.next();
        String middleN = sc.next();
        String lastN = sc.next();

        System.out.println(lastN+ "," + firstN+ " " + lastN.charAt(0));


    }
}



