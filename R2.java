import java.util.Scanner;

public class R2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 0;
        int[] inputs = new int[2];
        try {
            while (sc.hasNext()) {
                if (sc.hasNextInt()) {
                    inputs[n] = sc.nextInt();
                    n += 1;
                }
                else {
                    sc.next();
                }
            }
            System.out.println((2 * inputs[1]) - inputs[0]);
        } catch(Exception e) {
            System.out.println(e.getMessage());
        } finally{
            sc.close();
        }
    }
}
