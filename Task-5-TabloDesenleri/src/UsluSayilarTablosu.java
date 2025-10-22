void main() {

    IO.println("--- Üslü Sayılar Tablosu (a=1'den a=5'e kadar) ---");

    // Tablo başlıkları için sabit genişlik belirleyelim
    int sutunGenislik = 8;

    // Tablo Başlıkları
    // %-8s: 8 karakter sola hizalı metin
    System.out.printf("%-" + sutunGenislik + "s", "a");
    System.out.printf("%" + sutunGenislik + "s", "a^2");
    System.out.printf("%" + sutunGenislik + "s", "a^3");
    IO.println();

    // Ayırıcı çizgi
    StringBuilder cizgi = new StringBuilder();
    cizgi.append("-".repeat(3 * sutunGenislik));
    IO.println(cizgi);

    // a değerlerini 1'den 5'e kadar döngü ile hesaplama ve yazdırma
    for (int a = 1; a <= 5; a++) {
        // a^2 ve a^3 değerlerini hesaplama
        int aKare = a * a;
        int aKup = a * a * a; // Veya Math.pow(a, 3) kullanılıp int'e çevrilebilir, ama çarpma daha basit

        // Satırı tablo formatında yazdırma
        // %-8d: 8 karakter sola hizalı tam sayı
        // %8d: 8 karakter sağa hizalı tam sayı

        // "a" sütunu (sol hizalı)
        System.out.printf("%-" + sutunGenislik + "d", a);

        // "a^2" sütunu (sağ hizalı)
        System.out.printf("%" + sutunGenislik + "d", aKare);

        // "a^3" sütunu (sağ hizalı)
        System.out.printf("%" + sutunGenislik + "d", aKup);

        IO.println();
    }
}