import java.util.Scanner;

public class StuckInATimeLoop {
    public static final String chant = "Abracadabra";
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 1;
        try {
            Integer input = sc.nextInt();
            while (input != 0) {
                System.out.println(count + " " + chant);
                count += 1;
                input -= 1;
            }
        } catch(Exception e) {
            System.out.println(e.getMessage());
        } finally{
            sc.close();
        }
    }
}
