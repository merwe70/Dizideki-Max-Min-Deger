import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] list = {15, 12, 788, 1, -1, -778, 2, 0};

        System.out.print("Bir sayı giriniz: ");
        int number = scanner.nextInt();

        int closestMin = list[0];
        int closestMax = list[0];

        // Listedeki her eleman için girilen sayıya olan uzaklığı karşılaştır
        for (int i : list) {
            if (i < number && (number - i < number - closestMin)) {
                closestMin = i;
            }
            if (i > number && (i - number < closestMax - number)) {
                closestMax = i;
            }
        }

        // Girilen sayıya en yakın küçük ve büyük sayıları bul
        for (int i : list) {
            if (i < number) {
                if (closestMin < i || closestMin >= number) {
                    closestMin = i;
                }
            }
            if (i > number) {
                if (closestMax > i || closestMax <= number) {
                    closestMax = i;
                }
            }
        }

        // Sonuçları yazdır
        System.out.println("Girilen sayıdan küçük en yakın sayı: " + (closestMin < number ? closestMin : "Bulunamadı"));
        System.out.println("Girilen sayıdan büyük en yakın sayı: " + (closestMax > number ? closestMax : "Bulunamadı"));
    }
}