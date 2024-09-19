public class ContohMethodStaticDanNonStatic {
    public static double hitungluasPersegi(double sisi) {
        return sisi * sisi;

    }

    public static void main(String[] args) {
        double luasPersegi = ContohMethodStaticDanNonStatic.hitungluasPersegi(20);
        System.out.println("Luas persegi: " + luasPersegi);

        ContohMethodStaticDanNonStatic object = new ContohMethodStaticDanNonStatic();
        object.tampilkanPesanSelamatDatang("Benaya");

    }
    public void tampilkanPesanSelamatDatang(String nama) {
        System.out.println("Selamat datang, " + nama + " !");
    }
}
