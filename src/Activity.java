import java.util.Scanner;

public class Activity {
    public static void main(String[] args) {
        double h;
        Scanner scan = new Scanner(System.in);
        System.out.println("Sıcaklık giriniz: ");
        h = scan.nextDouble();

        if (h<5) {
            System.out.println("Kayak");
        }
            else if (h>=5 & h<15) {
                System.out.println("Tiyatro");    
            }
            else if (h>=15 & h<25) {
                System.out.println("Mangal");
            }
            else {
                System.out.println("Yüzme");
            }
    }
}
