public class HesapOzeti {

    public static void main(String[] args) {
        // 1. Alışveriş Listesi Verileri: Ürün, miktar, fiyat
        String[] urunler = {"Ekmek", "Süt", "Yumurta", "Peynir", "Elma"};
        int[] miktarlar = {2, 1, 12, 1, 3}; // Ekmek: adet, Süt: litre, Yumurta: adet, Peynir: adet, Elma: kg
        double[] birimFiyatlar = {7.50, 25.00, 2.00, 75.00, 15.00}; // Birim fiyatları

        // 2. Tablonun Başlığını Oluşturma
        // Başlıklar için sabit genişlikler belirleyelim (hizalama için önemlidir)
        int urunGenislik = 15;
        int miktarGenislik = 8;
        int fiyatGenislik = 10;
        int toplamGenislik = 12;

        System.out.println("--- Alışveriş Hesap Özeti ---");

        // Başlık satırı
        System.out.printf("%-" + urunGenislik + "s", "ÜRÜN");
        System.out.printf("%" + miktarGenislik + "s", "MİKTAR");
        System.out.printf("%" + fiyatGenislik + "s", "B.FİYAT (TL)");
        System.out.printf("%" + toplamGenislik + "s", "TOPLAM (TL)");
        System.out.println();

        // Ayırıcı çizgi
        String cizgi = "-";
        for (int i = 0; i < urunGenislik + miktarGenislik + fiyatGenislik + toplamGenislik; i++) {
            cizgi += "-";
        }
        System.out.println(cizgi);


        // 3. Verileri Döngü ile İşleme ve Tablo Formatında Gösterme
        double genelToplam = 0.0;

        for (int i = 0; i < urunler.length; i++) {
            String urun = urunler[i];
            int miktar = miktarlar[i];
            double birimFiyat = birimFiyatlar[i];

            // Hesaplama: Toplam Fiyat = Miktar * Birim Fiyat
            double toplamFiyat = miktar * birimFiyat;
            genelToplam += toplamFiyat;

            // Satırı tablo formatında yazdırma
            // %-15s: 15 karakter sola hizalı metin
            // %8d: 8 karakter sağa hizalı tam sayı
            // %10.2f: 10 karakter sağa hizalı, virgülden sonra 2 basamaklı ondalık sayı
            System.out.printf("%-" + urunGenislik + "s", urun); // Ürün adı
            System.out.printf("%" + miktarGenislik + "d", miktar); // Miktar
            System.out.printf("%" + fiyatGenislik + ".2f", birimFiyat); // Birim Fiyat
            System.out.printf("%" + toplamGenislik + ".2f", toplamFiyat); // Satır Toplamı
            System.out.println();
        }

        // 4. Genel Toplamı Gösterme
        System.out.println(cizgi);
        System.out.printf("%-" + (urunGenislik + miktarGenislik + fiyatGenislik) + "s", "GENEL TOPLAM:");
        System.out.printf("%" + toplamGenislik + ".2f", genelToplam);
        System.out.println();
    }
}