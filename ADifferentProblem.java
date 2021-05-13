import java.util.Scanner;

public class ADifferentProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            while (sc.hasNextLong())
                System.out.println(Math.abs(sc.nextLong() - sc.nextLong()));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            sc.close();
        }
    }
}