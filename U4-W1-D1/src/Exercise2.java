import java.util.Scanner;

public class Exercise2 {
    //Metodo per concatenare tre stringhe:
    public static String concatInOrder (String string1, String string2, String string3) {
        return string1 + string2 + string3;
    }

    public static String concatInReverse (String string1, String string2, String string3) {
        return string3 + string2 + string1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insert first string:");
        String firstString = scanner.nextLine();
        System.out.println("Insert second string:");
        String secondString = scanner.nextLine();
        System.out.println("Insert third string:");
        String thirdString = scanner.nextLine();
        System.out.println("The result in order is: " + concatInOrder(firstString,secondString,thirdString));
        System.out.println("The result in order reverse is: " + concatInReverse(firstString,secondString,thirdString));
        scanner.close();
    }
}
