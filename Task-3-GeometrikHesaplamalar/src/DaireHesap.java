public class DaireHesap {
    public static void main(String[] args) {
        double r = 5.5;
        double pi = 3.14159;

        // ALAN HESABI
        double Alan = pi * r * r;

        // ÇEVRE HESABI
        double Cevre = 2 * pi * r;

        // YARIÇAP
        double Yaricap = r;

        // ÇIKTI, SONUÇ
        System.out.println("Alan = " + Alan);
        System.out.println("Çevre = " + Cevre);
        System.out.println("Yarıçap = " + Yaricap);
    }
}
