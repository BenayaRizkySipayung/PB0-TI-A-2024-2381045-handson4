public class ContohOverLoading {
    public static double hitungluas(double sisi) {
        return sisi* sisi;

    }

    public static double hitungluas(double panjang, double lebar) {
        return panjang * lebar;
    }
    public static double hitungluas(double jarijari, boolean isiLingkaran) {
        if(isiLingkaran) {
            return Math.PI * jarijari * jarijari;
        } else {
            return 0;
        }
    }

    public static void main(String [] args) {
        double luasPersegi = hitungluas(5);
        System.out.println("Luas persegi: " + luasPersegi);

        double luasPersegiPanjang = hitungluas(4, 6);
        System.out.println("Luas persegi panjang: " + luasPersegiPanjang);

        double luasLingkaran = hitungluas(4, true);
        System.out.println("Luas Lingkaran: " + luasLingkaran);
        }
    }


