import java.util.Scanner;

public class Triangulo{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("Insert the X Triangle measures");
        
        Double ax = sc.nextDouble();
        Double bx = sc.nextDouble();
        Double cx = sc.nextDouble();

        System.out.println("Insert the X Triangle measures");

        Double ay = sc.nextDouble();
        Double by = sc.nextDouble();
        Double cy = sc.nextDouble();

        Double px = (ax+bx+cx)/2;

        Double py = (ay+by+cy)/2;

        Double areax = Math.sqrt(px*(px-ax)*(px-bx)*(px-cx));

        Double areay = Math.sqrt(py*(py-ay)*(py-by)*(py-cy));


        System.out.printf("Triangle X Area is: \n" + "%.2f", areax);
        System.out.printf("Triangle Y Area is: " + "%.2f", areay);


        if (areax > areay) {
            System.out.println("Triangle X is bigger than Y");
        }else {
            System.out.println("Triangle Y is bigger than X");
        }
    }
}