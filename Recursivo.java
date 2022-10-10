import java.util.Scanner;

public class Recursivo{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);

        double n = sc.nextDouble();  // diz o numero que quer somar
        double soma = 1; //varial iniciada para fazer a soma
        for (Double i=n; i>0; i--){
                                        //pega a sequencia da soma e passa para a soma +=i;

                                        //n=5  (5+4+3+2+1);
            soma +=i;
        }
        System.out.println(soma);
       
        sc.close();
    }
}