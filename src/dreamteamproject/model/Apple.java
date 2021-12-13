package dreamteamproject.model;

/**
 *
 * @author Murni
 */
public class Apple {

    private static BaseLeptop leptop1;
    private static BaseLeptop leptop2;
    private static BaseLeptop leptop3;
    private static BaseLeptop leptop4;
    private static Integer jumlah;
    
    public static Integer getJumlah() {
        jumlah = leptop1.getHarga() + leptop2.getHarga() + leptop3.getHarga() + leptop4.getHarga();
        return jumlah;
    }

    public static void setJumlah(Integer jumlah) {
        Apple.jumlah = jumlah;
    }

    public static BaseLeptop getLeptop1() {
        return leptop1;
    }

    public static void setLeptop1(BaseLeptop leptop1) {
        Apple.leptop1 = leptop1;
    }

    public static BaseLeptop getLeptop2() {
        return leptop2;
    }

    public static void setLeptop2(BaseLeptop leptop2) {
        Apple.leptop2 = leptop2;
    }

    public static BaseLeptop getLeptop3() {
        return leptop3;
    }

    public static void setLeptop3(BaseLeptop leptop3) {
        Apple.leptop3 = leptop3;
    }

    public static BaseLeptop getLeptop4() {
        return leptop4;
    }

    public static void setLeptop4(BaseLeptop leptop4) {
        Apple.leptop4 = leptop4;
    }

    
}
