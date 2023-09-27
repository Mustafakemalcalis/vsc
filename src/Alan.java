import java.util.Scanner;

public class Alan {
    public static void main(String[] args) {
        int square,env,radius;
        int pi = 3;

        Scanner scan = new Scanner(System.in);

        System.out.println("Dairenin yarıçapını giriniz: ");

        radius = scan.nextInt();
        square = pi*radius*radius;
        env = 2*pi*radius;

        System.out.println("Dairenin alanı: " + square);
        System.out.println("Dairenin çevresi: " + env);
        }
}
