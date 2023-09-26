import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
    Scanner scan = new Scanner(System.in);
    System.out.println("Boy ölçünüzü giriniz: ");
    double h = scan.nextDouble();
    System.out.println("Kilonuzu giriniz: ");
    double w = scan.nextDouble();
    
    double indeks = w/(h*h);
    System.out.println("Vücut kitle indeksinniz: " + indeks);

    if (indeks < 18.5) {
        System.out.println("Zayıf");
    }    
        else if(indeks>=18.5 & indeks<25){
            System.out.println("İdeal");
        } 
        else if(indeks>=25 & indeks<30) {
            System.out.println("Şişman");
        }
        else if(indeks>=30 & indeks<35) {
            System.out.println("Obez");
        }
    
    else {
    System.out.println("Aşırı obez");
    }
    }
}
