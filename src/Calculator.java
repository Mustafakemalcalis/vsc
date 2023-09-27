import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("1.Sayı: ");
        double a = scan.nextDouble();
        System.out.println("2.sayı: ");
        double b = scan.nextDouble();

        System.out.println("İşlem seçiniz: ");
        System.out.println("1-Toplama");
        System.out.println("2-Çıkarma");
        System.out.println("3-Çarpma");
        System.out.println("4-Bölme");
        System.out.print("İşleminiz: ");
        int select = scan.nextInt();

        if (select==1) {
            System.out.println("Sonuc: " + (a+b));
        }
            else if (select==2) {
                System.out.println("Sonuc: " + (a-b));
        
            }
            else if (select==3) {
                System.out.println("Sonuc: " + (a*b));

            }
            else if (select==4) {
                if (b==0) {
                    System.out.println("Bölen sayısı sıfır olamaz!!");
                
                }
                else {
                    System.out.println("Sonuc: " + (a/b));

                }
                
            }
        else {
            System.out.println("Lütfen geçerli bir sayı giriniz!!");
        }

    }
}
