import java.util.Scanner;

public class Tutar {
    public static void main(String[] args) {
        double elma,kabak,domates,patlican,salatalik,total;
        double priceElma = 4.11;
        double priceKabak = 2.22;
        double priceDomates = 0.95;
        double pricePatlican = 7.00;
        double priceSalatalik = 3.14;

        Scanner scan = new Scanner(System.in);
        System.out.println("Elma kaç kg: ");
        elma = scan.nextDouble();
        System.out.println("Kabak kaç kg: ");
        kabak = scan.nextDouble();
        System.out.println("Domates kaç kg: ");
        domates = scan.nextDouble();
        System.out.println("Patlıcan kaç kg: ");
        patlican = scan.nextDouble();
        System.out.println("Salatalık Kaç kg: ");
        salatalik = scan.nextDouble();

        total = ((elma*priceElma)+(kabak*priceKabak)+(domates*priceDomates)+
        (patlican*pricePatlican)+(salatalik*priceSalatalik));

        System.out.println("Toplam tutar: " + total);
    }
}
