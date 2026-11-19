import java.util.*;

public class Trycatch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            int[] a = {1, 2, 3};

            int i = sc.nextInt();
            int b = sc.nextInt();

            System.out.println(a[i]);
            System.out.println(a[i] / b);

        } catch (VotingException e) {
            e.printStackTrace();
        }
        finally {
            System.out.println("Program finished");
        }
    }
}