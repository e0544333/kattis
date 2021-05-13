import java.util.*;

public class TakeTwoStones {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            Integer input = sc.nextInt();
            if (input % 2 == 0) {
                System.out.println("Bob");
            } else {
                System.out.println("Alice");
            }
        } catch(Exception e) {
            System.out.println(e.getMessage());
        } finally{
            sc.close();
        }
    }
}