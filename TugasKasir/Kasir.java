import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


//Tugas_Kasir/src/DataPelanggan.txt


public class Kasir {
    private String namaPelanggan;
    private String nomorPelanggan;

    private String fileName = "C:\\Users\\user\\IdeaProjects\\Tugas_Kasir\\src\\DataPelanggan.txt";
    private boolean isDataAvailable = false;

    public Kasir(String namaPelanggan, String nomorPelanggan){
        this.namaPelanggan = namaPelanggan;
        this.nomorPelanggan = nomorPelanggan;
    }

    public void cekData() {
        boolean check = false;
        try {
            // Membaca isi file
            BufferedReader reader = new BufferedReader(new FileReader(fileName));

            String line;

            String nama = namaPelanggan;
            String nomor = nomorPelanggan;
            String newData = nama + ", " + nomor;

            while ((line = reader.readLine()) != null) {
                if (line.equals(newData)) {
                    isDataAvailable = true;
                    break;
                }
            }
            reader.close();

            // Menambahkan data baru jika tidak ada data yang sama
            if (!isDataAvailable) {
                BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true));
                writer.write(getNamaPelanggan() + ", " + getNomorPelanggan());
                writer.newLine();
                writer.close();
                check = true;
                System.out.println("data anda di tambahkan");
            } else {
                check = false;
                System.out.println("data anda sudah pernah tersedia");
            }

        } catch (IOException ie) {
            System.out.println("file tidak tersedia : " + ie.getMessage());
        }
        //return check;
    }



//    public void setNamaPelanggan(String namaPelanggan) {
//        this.namaPelanggan = namaPelanggan;
//    }
//
//    public void setNomorPelanggan(int nomorPelanggan) {
//        this.nomorPelanggan = nomorPelanggan;
//    }

    public String getNamaPelanggan() {
        return namaPelanggan;
    }

    public String getNomorPelanggan() {
        return nomorPelanggan;
    }
}
