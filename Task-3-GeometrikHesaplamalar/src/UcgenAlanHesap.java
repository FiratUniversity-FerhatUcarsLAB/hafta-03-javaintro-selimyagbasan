public class UcgenAlanHesap {
    public static void main(String[] args) {
        // Üçgenin kenarları
        double a = 3.0;
        double b = 4.0;
        double c = 5.0;

        // Yarı çevre (s)
        double s = (a + b + c) / 2.0;

        // Heron formülü: A = sqrt( s * (s - a) * (s - b) * (s - c) )
        double alan = Math.sqrt(s * (s - a) * (s - b) * (s - c));

        // Sonucu ekrana yazdır
        System.out.println("Kenarlar: a=" + a + ", b=" + b + ", c=" + c);
        System.out.println("Yarı çevre s = " + s);
        System.out.println("Üçgenin alanı A = " + alan);
    }
}