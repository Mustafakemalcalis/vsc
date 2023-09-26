import java.util.Scanner;

public class Hipotenüs {
    public static void main(String[] args) {
        double a,b,c,env,square;
        

        Scanner scan = new Scanner(System.in);

        System.out.println("Üçgenin a kenar uzunluğunu giriniz: ");
        a=scan.nextDouble();
         System.out.println("Üçgenin b kenar uzunluğunu giriniz: ");
        b=scan.nextDouble();
        c = Math.sqrt((a*a)+(b*b));

        System.out.println("Üçgenin c kenar uzunluğu: " + c);

        env = (a+b+c)/2;
        square = Math.sqrt(env*(env-a)*(env-b)*(env-c));
        System.out.println("Üçgenin alanı: " + square);

    }
}
