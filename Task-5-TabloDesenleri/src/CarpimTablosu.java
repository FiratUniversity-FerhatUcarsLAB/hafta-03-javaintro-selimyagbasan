public class CarpimTablosu {

    public static void main(String[] args) {
        int sayi = 2; // Çarpım tablosunu oluşturacağımız sayı

        System.out.println("--- 5.3 - " + sayi + "'nin Çarpım Tablosu (1'den 10'a kadar) ---");

        // 1'den 10'a kadar döngü
        for (int i = 1; i <= 10; i++) {
            int sonuc = sayi * i;

            // Format: 2 x 1 = 2
            // %2d: 2 karakterlik alan
            System.out.printf("%d x %2d = %2d%n", sayi, i, sonuc);
        }
    }
}