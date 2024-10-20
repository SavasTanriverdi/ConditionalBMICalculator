import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Kullanıcıdan kilo ve boy bilgilerini alma
        System.out.print("Lütfen kilonuzu (kg cinsinden) girin: ");
        double weight = scanner.nextDouble();

        System.out.print("Lütfen boyunuzu (metre cinsinden) girin: ");
        double height = scanner.nextDouble();

        // BMI hesaplama
        double bmi = weight / (height * height);
        System.out.printf("Vücut Kitle İndeksiniz (BMI): %.2f\n", bmi);

        // BMI'ye göre durum belirleme
        if (bmi < 18.5) {
            System.out.println("Durum: Zayıf");
        } else if (bmi >= 18.5 && bmi < 24.9) {
            System.out.println("Durum: Normal kilolu");
        } else if (bmi >= 25 && bmi < 29.9) {
            System.out.println("Durum: Fazla kilolu");
        } else {
            System.out.println("Durum: Obez");
        }

        // Scanner'ı kapatma
        scanner.close();
    }
}