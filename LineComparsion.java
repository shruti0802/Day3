import java.util.*;
import java.lang.Math;

public class LineComparsion {

    public static double calculateLength(float x1, float x2, float y1, float y2) {
        return Math.sqrt(Math.pow(x1 - x2, 2) + (Math.pow((y2 - y1), 2)));
    }

    public static void main(String[] args) {
        System.out.println("Welcome to Line Comparison Problem.");
        Scanner sc = new Scanner(System.in);
        float x1 = sc.nextFloat();
        float x2 = sc.nextFloat();
        float y1 = sc.nextFloat();
        float y2 = sc.nextFloat();
        double length = calculateLength(x1, x2, y1, y2);
        System.out.println("Length of line 1: " + length);
    }
}