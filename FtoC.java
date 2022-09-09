import java.util.Scanner;

public class FtoC {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("What is the Temperature in C:");

        int c = sc.nextInt();
        
        int f = (9*c+160)/5;

        System.out.println("The temperature is: " + f);
    }
}
