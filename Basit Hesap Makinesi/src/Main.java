import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner (System.in);
        
        System.out.println("********************");
        String islemler = "1. Toplama İşlemi\n"
                          + "2. Çıkarma İşlemi\n"
                          + "3. Çarpma İşlemi\n"
                          + "4. Bölme İşlemi";
        System.out.println(islemler);
        System.out.println("********************");
        
        System.out.println("Lütfen İşlem Seçiniz:");
        String islem = scanner.nextLine();
        int a;
        int b;
        
        switch(islem) {
            case "1":
                System.out.println("Birinci Sayı: ");
                a = scanner.nextInt();
                System.out.println("İkici Sayı: ");
                b = scanner.nextInt();
                System.out.println("Girilen Sayıların Toplamı = " + (a+b));
                break;
            case "2":
                System.out.println("Birinci Sayı: ");
                a = scanner.nextInt();
                System.out.println("İkici Sayı: ");
                b = scanner.nextInt();
                System.out.println("Girilen Sayıların Farkı = " + (a-b));
                break;

            case "3":
                System.out.println("Birinci Sayı: ");
                a = scanner.nextInt();
                System.out.println("İkici Sayı: ");
                b = scanner.nextInt();
                System.out.println("Girilen Sayıların Çarpımı = " + (a*b));
                break;

            case "4":
                System.out.println("Birinci Sayı: ");
                a = scanner.nextInt();
                System.out.println("İkici Sayı: ");
                b = scanner.nextInt();
                System.out.println("Girilen Sayıların Bölümü = " + ((double)a/b));
                break; 
             
            default:
                System.out.println("Geçersiz İşlem");
                
            
        }                            
    }  
}
