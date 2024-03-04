import java.util.Scanner;

public class Exercise3 {
    public static double perimeter(double longSide, double shortSide ) {
        return (longSide * 2) + (shortSide * 2);
    }

    public static int evenOdd (int number) {
        if(number % 2 == 0) {
            return 0;
        } else{
            return 1;
        }
    }

    public static double heronsFormula (double side1, double side2, double side3 ) {
        double semiperimeter = (side1 + side2 + side3 )/2;
        double area = Math.sqrt(Math.abs(semiperimeter * (semiperimeter - side1) * (semiperimeter - side2) * (semiperimeter - side3)));
        return area;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insert a floating point number for long side of a rectangle:");
        double sideOne = Double.parseDouble(scanner.nextLine());
        System.out.println("Insert a floating point number for short side of a rectangle:");
        double sideTwo = Double.parseDouble(scanner.nextLine());
        System.out.println("The perimeter of rectangle is: " + perimeter(sideOne, sideTwo));

        System.out.println("Insert a integer for checking if it is even or odd:");
        int integerNumber = Integer.parseInt(scanner.nextLine());
        System.out.println("The result is: " + evenOdd(integerNumber));

        System.out.println("Insert a floating point number for first side of a triangle:");
        double firstSide = Double.parseDouble(scanner.nextLine());
        System.out.println("Insert a floating point number for second side of a triangle:");
        double secondSide = Double.parseDouble(scanner.nextLine());
        System.out.println("Insert a floating point number for third side of a triangle:");
        double thirdSide = Double.parseDouble(scanner.nextLine());
        System.out.println("The area of triangle is: " + heronsFormula(firstSide, secondSide,thirdSide) );
    }
}
