import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        PeminjamanMobil rental = new PeminjamanMobil();
        //Kasir kasir = new Kasir();
        Menu menu = new Menu();

        menu.TampilMenu();


//        System.out.print("Masukkan nama pelanggan: ");
//        String nama = input.nextLine();
//
//        System.out.print("Masukkan nomor pelanggan: ");
//        String nomor = input.nextLine();
//
//        Kasir kasir = new Kasir(nama, nomor);
//        kasir.cekData();
//
//        System.out.println("Nama pelanggan: " + kasir.getNamaPelanggan());
//
//        System.out.println("Nomor pelanggan: " + kasir.getNomorPelanggan());

        while (true){
            System.out.println("\n--- MENU ---");
        System.out.println("1. Rental Mobil");
        System.out.println("2. Exit");
        System.out.print("pilih menu : ");

            int pilih = input.nextInt();
            input.nextLine();

            if(pilih == 1){
                System.out.print("\nMasukkan nama pelanggan: ");
                String nama = input.nextLine();

                System.out.print("Masukkan nomor pelanggan: ");
                String nomor = input.nextLine();

                Kasir kasir = new Kasir(nama, nomor);
                kasir.cekData();

                System.out.println("\nNama pelanggan: " + kasir.getNamaPelanggan());

                System.out.println("Nomor pelanggan: " + kasir.getNomorPelanggan());




                System.out.print("\nJenis mobil : ");
                int mobil = 0;
                do{
                    mobil = input.nextInt();
                    if (mobil == 1) {
                        rental.jenisMobil("Pajero");

                        System.out.print("Berapa lama jam pinjam : ");
                        int jamPinjam = input.nextInt();

                        System.out.println("Total pembayaran : " + rental.hargaPajero(jamPinjam));
                        System.out.print("Masukan nominal pembayaran : ");
                        int totalBayar = input.nextInt();

                        System.out.println("Total kembalian : " + rental.kembalian(totalBayar, rental.hargaPajero(jamPinjam)));
                        if (totalBayar >= rental.hargaPajero(jamPinjam)) {
                            System.out.println("Transaksi anda berhasil");
                        } else {
                            System.out.println("Transaksi anda gagal");
                        }
                    }else if (mobil == 2){
                        rental.jenisMobil("Alphard");

                        System.out.print("Berapa lama jam pinjam : ");
                        int jamPinjam = input.nextInt();

                        System.out.println("Total pembayaran : " + rental.hargaAlphard(jamPinjam));
                        System.out.print("Masukan nominal pembayaran : ");
                        int totalBayar = input.nextInt();

                        System.out.println("Total kembalian : " + rental.kembalian(totalBayar, rental.hargaAlphard(jamPinjam)));
                        if (totalBayar >= rental.hargaAlphard(jamPinjam)) {
                            System.out.println("Transaksi anda berhasil");
                        } else {
                            System.out.println("Transaksi anda gagal");
                        }
                    }else if (mobil == 3){
                        rental.jenisMobil("Avanza");

                        System.out.print("Berapa lama jam pinjam : ");
                        int jamPinjam = input.nextInt();

                        System.out.println("Total pembayaran : " + rental.hargaAvanza(jamPinjam));
                        System.out.print("Masukan nominal pembayaran : ");
                        int totalBayar = input.nextInt();

                        System.out.println("Total kembalian : " + rental.kembalian(totalBayar, rental.hargaAvanza(jamPinjam)));
                        if (totalBayar >= rental.hargaAvanza(jamPinjam)) {
                            System.out.println("Transaksi anda berhasil");
                        } else {
                            System.out.println("Transaksi anda gagal");
                        }
                    }else if (mobil == 4){
                        rental.jenisMobil("Kijang");

                        System.out.print("Berapa lama jam pinjam : ");
                        int jamPinjam = input.nextInt();

                        System.out.println("Total pembayaran : " + rental.hargaKijang(jamPinjam));
                        System.out.print("Masukan nominal pembayaran : ");
                        int totalBayar = input.nextInt();

                        System.out.println("Total kembalian : " + rental.kembalian(totalBayar, rental.hargaKijang(jamPinjam)));
                        if (totalBayar >= rental.hargaKijang(jamPinjam)) {
                            System.out.println("Transaksi anda berhasil");
                        } else {
                            System.out.println("Transaksi anda gagal");
                        }
                    } else {
                        System.out.println("masukan angka yang tersedia");
                        System.out.print("jenis mobil : ");
                    }
                }while (mobil <= 0 || mobil >= 5);


            } else if (pilih == 2) {
                System.out.println("TerimKasih");
                break;
            } else {
                System.out.println("masukan inputan yang sesuai");
                //System.out.print("jenis mobil : ");
            }
        }

//        System.out.print("Jenis mobil : ");
//        int mobil = input.nextInt();
//
//        if (mobil == 1) {
//            rental.jenisMobil("Pajero");
//
//            System.out.print("Berapa lama jam pinjam : ");
//            int jamPinjam = input.nextInt();
//
//            System.out.println("Total pembayaran : " + rental.hargaPajero(jamPinjam));
//            System.out.print("Masukan nominal pembayaran : ");
//            int totalBayar = input.nextInt();
//
//            System.out.println("Total kembalian : " + rental.kembalian(totalBayar, rental.hargaPajero(jamPinjam)));
//            if (totalBayar >= rental.hargaPajero(jamPinjam)) {
//                System.out.println("Transaksi anda berhasil");
//            } else {
//                System.out.println("Transaksi anda gagal");
//            }
//        }else if (mobil == 2){
//            rental.jenisMobil("Alphard");
//
//            System.out.print("Berapa lama jam pinjam : ");
//            int jamPinjam = input.nextInt();
//
//            System.out.println("Total pembayaran : " + rental.hargaAlphard(jamPinjam));
//            System.out.print("Masukan nominal pembayaran : ");
//            int totalBayar = input.nextInt();
//
//            System.out.println("Total kembalian : " + rental.kembalian(totalBayar, rental.hargaAlphard(jamPinjam)));
//            if (totalBayar >= rental.hargaAlphard(jamPinjam)) {
//                System.out.println("Transaksi anda berhasil");
//            } else {
//                System.out.println("Transaksi anda gagal");
//            }
//        }else if (mobil == 3){
//            rental.jenisMobil("Avanza");
//
//            System.out.print("Berapa lama jam pinjam : ");
//            int jamPinjam = input.nextInt();
//
//            System.out.println("Total pembayaran : " + rental.hargaAvanza(jamPinjam));
//            System.out.print("Masukan nominal pembayaran : ");
//            int totalBayar = input.nextInt();
//
//            System.out.println("Total kembalian : " + rental.kembalian(totalBayar, rental.hargaAvanza(jamPinjam)));
//            if (totalBayar >= rental.hargaAvanza(jamPinjam)) {
//                System.out.println("Transaksi anda berhasil");
//            } else {
//                System.out.println("Transaksi anda gagal");
//            }
//        }else if (mobil == 4){
//            rental.jenisMobil("Kijang");
//
//            System.out.print("Berapa lama jam pinjam : ");
//            int jamPinjam = input.nextInt();
//
//            System.out.println("Total pembayaran : " + rental.hargaKijang(jamPinjam));
//            System.out.print("Masukan nominal pembayaran : ");
//            int totalBayar = input.nextInt();
//
//            System.out.println("Total kembalian : " + rental.kembalian(totalBayar, rental.hargaKijang(jamPinjam)));
//            if (totalBayar >= rental.hargaKijang(jamPinjam)) {
//                System.out.println("Transaksi anda berhasil");
//            } else {
//                System.out.println("Transaksi anda gagal");
//            }
//        }else {
//            System.out.println("masukan angka yang tersedia");
//        }
    }
}