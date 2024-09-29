
import java.util.Scanner;

 class circle {
     private double r;
     public circle(double r) {
         this.r = r;
     }
     public void setRadius(double r) {
         this.r = r;
     }
     public double computeArea() {
         return Math.PI * r * r;
     }
     public double computeCircumference() {
         return 2 * Math.PI * r;
     }

 }

public class question5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter the radius of the inner circle (ri): ");
        double ri = scanner.nextDouble();
        System.out.print("Enter the radius of the outer circle (ro): ");
        double ro = scanner.nextDouble();


        circle innerCircle = new circle(ri);
        circle outerCircle = new circle(ro);
        double innerArea = innerCircle.computeArea();
        double outerArea = outerCircle.computeArea();


        double shadedArea = outerArea - innerArea;


        System.out.printf("Area of the inner circle: %.2f\n", innerArea);
        System.out.printf("Area of the outer circle: %.2f\n", outerArea);
        System.out.printf("Shaded area (circular region): %.2f\n", shadedArea);

        scanner.close();
    }
}



