public class PeminjamanMobil {
     public void jenisMobil(String mobil) {
        System.out.println("Jenis mobil " + mobil);
    }

    int hargaPajero(int jamPinjam) {
        int hargaSewa = jamPinjam * 500;
        return hargaSewa;
    }

    int kembalian(int totalBayar, int hargaSewa) {
        int kembalian = totalBayar - hargaSewa;
        return kembalian;
    }

    int hargaAlphard(int jamPinjam) {
        int hargaSewa = jamPinjam * 400;
        return hargaSewa;
    }

    int hargaAvanza(int jamPinjam) {
        int hargaSewa = jamPinjam * 300;
        return hargaSewa;
    }

    int hargaKijang(int jamPinjam) {
        int hargaSewa = jamPinjam * 200;
        return hargaSewa;
    }
}
