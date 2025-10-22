public class DonusumTablosu {

    public static void main(String[] args) {
        // Dönüşüm oranı: 1 mil = 1.609 km
        final double DONUSUM_ORANI = 1.609;

        // Hesaplayacağımız mil değerleri
        int[] miller = {1, 5, 10, 20, 50};

        System.out.println("--- 5.2 - Mil -> Kilometre Dönüşüm Tablosu ---");

        // Tablo başlıkları için genişlik
        int sutunGenislik = 12;
        System.out.printf("%-" + sutunGenislik + "s", "Mil");
        System.out.printf("%" + sutunGenislik + "s", "Kilometre");
        System.out.println();

        // Ayırıcı çizgi
        String cizgi = "------------";
        System.out.println(cizgi + cizgi);

        // Hesaplamalar ve yazdırma
        for (int mil : miller) {
            double kilometre = mil * DONUSUM_ORANI;

            // Satırı tablo formatında yazdırma
            // %-12d: 12 karakter sola hizalı tam sayı
            // %12.3f: 12 karakter sağa hizalı, virgülden sonra 3 basamaklı ondalık sayı
            System.out.printf("%-" + sutunGenislik + "d", mil);
            System.out.printf("%" + sutunGenislik + ".3f", kilometre);
            System.out.println();
        }
    }
}