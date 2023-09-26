import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double cost,kdvPrice,total,kdv;
       

        System.out.println("Ürünün fiyatını giriniz: ");
        cost = input.nextDouble();

        if (cost<=500 & cost > 0){
            kdv = 18;
            kdvPrice = cost*(kdv/100); 
            total = cost + kdvPrice;
            
            System.out.println("Kdv : %" + (int)kdv);
            System.out.println("Kdv tutarı: " + kdvPrice );
            System.out.println("KDV'li tutar= " + total);
        }
        else {
            kdv = 8;
            kdvPrice = cost*(kdv/100); 
            total = cost + kdvPrice;

            System.out.println("Kdv : %" + (int)kdv);
            System.out.println("Kdv tutarı: " + kdvPrice );
            System.out.println("KDV'li tutar= " + total);
        }
        
    }
}
